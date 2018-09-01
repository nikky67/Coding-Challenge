package com.coding.challenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChangeCalculator {

	public static Map<String, Integer> maxGain(List<Integer> prices) {
		int maxGain = 0;
        int maxValue = -1;
        int i= prices.size() -1 ;
		Map<Integer, Integer> mp = null;
		
		Map<String, Integer> result = new HashMap<>();
//		result.put("Selling Day", 0);
//		result.put("Buying Day", 0);
//		result.put("Maximum Gain", 0);
		
		for(int j=0; j< prices.size(); j++){
			mp.put(j+1, prices.get(j));
        }
        
        while((i>=0) && (mp.get(i) >=0)){
            
			if(mp.get(i)> maxValue){
				maxValue = mp.get(i);
				result.put("Selling Day", mp.get(i));
			}
			if((maxValue - mp.get(i)) > maxGain){
				maxGain = maxValue - mp.get(i);
				result.put("Buying Day", mp.get(i));
				result.put("Maximum Gain", maxGain); 
			}
            
			i--;
            
        }
        return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
