package com.coding.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodingChallenge2 {

	public static Map<String, Integer> exactChange(int givenNum){
		int num = givenNum;
		int quartersCount = 0;
		int dimesCount = 0;
		int nickelsCount = 0;
		int penniesCount = 0;
		int sum =0;
		Map<String, Integer> coinsCount = new HashMap<>(); 
		
		while((sum < num) && (num-sum) >= 25) {
			sum = sum + 25;
			quartersCount++;
		}
		coinsCount.put("Quarters", quartersCount);
		
		while((sum < num) && (num-sum) >= 10) {
			sum = sum + 10;
			dimesCount++;
		}
		coinsCount.put("Dimes", dimesCount);
		
		while((sum < num) && (num-sum) >= 5) {
			sum = sum + 5;
			nickelsCount++;
		}
		coinsCount.put("Nickels", nickelsCount);
		
		while((sum < num) && (num-sum) >= 1) {
			sum = sum + 1;
			penniesCount++;
		}
		coinsCount.put("Pennies", penniesCount);
		return coinsCount;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to get Exact change: ");
		int number = input.nextInt();
		input.close();
		
		Map<String, Integer> coinsCount = new HashMap<>(); 
		coinsCount= exactChange(number);
		System.out.println("Quarters(25): " + coinsCount.get("Quarters") +", "+ "Dimes(10): " + coinsCount.get("Dimes") +", "+"Nickels(5): " + coinsCount.get("Nickels") +", "+"Pennies(1): " + coinsCount.get("Pennies") );
	}

}
