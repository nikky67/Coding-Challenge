/**
 * 
 */
package com.coding.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * CodingChallenge2.java
 * Purpose: To find out the best Buying and Selling day from daily stock prices of last 10 days to get maximum profit.
 * 
 * @author Nikhita
 *
 */
public class CodingChallenge2 {
	
	/**
	 * This functions takes the stock_prices of last ten days as an input.
	 * Returns a Map which contains the information about the maximum profit, best selling day and best buying day to get that maximum profit 
	 * 
	 * @param prices
	 * @return Map<String, String>
	 */
	public static Map<String, Integer> maxProfit(int[] prices) {
		
		int maxGain = 0;
        int maxValue = -1;
        int i= prices.length -1  ;
		int sellingDay = 0; 
		int buyingDay = 0;
        
		Map<String, Integer> res = new HashMap<>();
        
		while((i>=0)){
            if(prices[i] >= 0 && prices[i] >= maxValue) {
    				maxValue = prices[i];
    				sellingDay = i+1;
    		}
            
            if(prices[i] >= 0 && (maxValue - prices[i]) >= maxGain){
            	maxGain = maxValue - prices[i];
            	buyingDay = i+1;
				res.put("Buying Day", buyingDay);
				res.put("Selling Day", sellingDay);
				res.put("Maximum Gain", maxGain); 
                
			}
			
            i--;
            
        }
        
        return res;
    }
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int[] stock = new int[10];
        System.out.print("Enter last 10 stock prices");
        for(int i = 0; i < 10; i++)
        {
            stock[i] = s.nextInt();
        }
		System.out.println(maxProfit(stock));
		
	}
}
