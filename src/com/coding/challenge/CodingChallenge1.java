package com.coding.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * CodingChallenge1.java
 * Purpose: To calculate the exact change of a number which represent cents.
 * 
 * @author Nikhita
 *
 */
public class CodingChallenge1 {

	/**
	 * Returns a map which contains the number of Quarters, Dimes, Nickels, Pennies required to form the exact change.
	 * This function will take an Integer as an input(represents cents) for which we have to find the exact change 
	 * 
	 * @param givenNum
	 * @return Map<String, Integer> 
	 */
	public static List<Integer> changeCalculator(int givenNum){
		
		int temp;
		
		List<Integer> coinsCount = new ArrayList<Integer>();
		
		if(givenNum >= 25) {
			temp = givenNum / 25;
			givenNum = givenNum % 25;
			coinsCount.add (temp);
		} else { coinsCount.add(0); }		
		
		if(givenNum >= 10) {
			temp = givenNum / 10;
			givenNum = givenNum % 10;
			coinsCount.add(temp);
		} else { coinsCount.add(0); }
		
		
		if(givenNum >= 5) {
			temp = givenNum / 5;
			givenNum = givenNum % 5;
			coinsCount.add(temp);
		} else { coinsCount.add(0); }
		
		
		if(givenNum >= 1) {
			temp = givenNum / 1;
			givenNum = givenNum % 1;
			coinsCount.add(temp);
		} else { coinsCount.add(0); }
		
		
		return coinsCount;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to get Exact change: ");
		int number = input.nextInt();
		input.close();
		List<Integer> coinsCount = changeCalculator(number);
		
		System.out.println("Quarters(25): " + coinsCount.get(0) +", "+ "Dimes(10): " + coinsCount.get(1) +", "+"Nickels(5): " + coinsCount.get(2) +", "+"Pennies(1): " + coinsCount.get(3) );
	}

}
