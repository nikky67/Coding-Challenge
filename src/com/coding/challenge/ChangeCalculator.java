//while((i>=0) && (prices[i]>=0)){
//            maxValue = max(maxValue, prices[i]);
//            maxProfit = max(maxProfit, maxValue-prices[i]);
//            i--;
package com.coding.challenge;

import java.util.HashMap;
import java.util.Map;

public class ChangeCalculator {

	public static Map<String, String> maxProfit(int[] prices) {
        int maxGain = 0;
        int maxValue = -1, sellingDay = 0;
        int i= prices.length -1  ;
		String sellingDays="";
		String buyingDays="";
		
		Map<String, String> res = new HashMap<>();
		
        
		while((i>=0)){
            if(prices[i] >= 0 && prices[i] >= maxValue) {
            	sellingDays = (maxValue == prices[i] ?  sellingDays+"," + String.valueOf(i+1) : String.valueOf(i+1));
    				maxValue = prices[i];
            }
            if(prices[i] >= 0 && (maxValue - prices[i]) >= maxGain){
            	maxGain = maxValue - prices[i];
				res.put("Buying Day", String.valueOf(i+1));
				res.put("Selling Day", sellingDays);
				res.put("Maximum Gain", String.valueOf(maxGain)); 
			}
			i--;
            
        }
        return res;
    }
	public static void main(String[] args) {
		int[] stock = {3,1,8,8,38,1,7,55,55,34};
		System.out.println(maxProfit(stock));
		
	}

}
