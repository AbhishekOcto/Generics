package com.bridgelabz.generics;

/**
* Purpose - UC2 Given 3 Floats find the maximum
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
	
	public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3){ //UC1
		Integer max = a1;
		if (a2.compareTo(max) > 0)
		max = a2;
		if (a3.compareTo(max) > 0)
		max = a3;
		return max;
		}
	
	/**
	* Method to compare three float values and get the maximum value.
	* @param f1 : First value to compare.
	* @param f2 : Second value to compare.
	* @param f3 : Third value to compare.
	* @return max : Maximum of three float
	*/

	public static Float maxOfFloat(Float f1, Float f2, Float f3) { //UC2
	Float max = f1;
	if (f2.compareTo(max) > 0)
	max = f2;
	if (f3.compareTo(max) > 0)
	max = f3;
	return max;
	}
	
	public static void main(String[] args) {
		System.out.println("The maximum value between the three integer is : " + maxOfInteger(78, 95, 51)+ "\n");
		System.out.println("The maximum value between the three float is : " + maxOfFloat(12.5f, 31.56f, 5.87f) + "\n");
	}
}
