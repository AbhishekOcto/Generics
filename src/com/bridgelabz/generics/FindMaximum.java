package com.bridgelabz.generics;

/**
* Purpose - UC1 Given 3 Integers find the maximum
* @author -Abhishek Kumar
* @since - 26-08-2022
*/

public class FindMaximum {
	
	/**
	* Method used to compare three integer values and get the maximum value.
	* @param a1 : First value to compare
	* @param a2 : Second value to compare
	* @param a3 : Third value to compare
	* @return max : Maximum of three integers
	*/
	
	public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3){
		Integer max = a1;
		if (a2.compareTo(max) > 0)
		max = a2;
		if (a3.compareTo(max) > 0)
		max = a3;
		return max;
		}
	
	public static void main(String[] args) {
		System.out.println("The maximum value between the three integer is : " + maxOfInteger(3, 8, 5)+ "\n");
	}
}
