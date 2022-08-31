package com.bridgelabz.generics;

/**
 * UC4 Extend the max method to take more then three parameters
* @author -Abhishek Kumar
* @since - 31-08-2022
*/

public class FindMaximum {
	
	/**
	* Method to compare any type of data and find maximum using generic
	* @param a1 : First value to compare
	* @param a2 : Second value to compare
	* @param a3 : Third value to compare
	* @param a4 : Fourth value to compare
	* @return max : Maximum of four values
	*/
	public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3, T a4) {
		T max = a1;
		if (a2.compareTo(max) > 0 && a2.compareTo(a3) > 0 && a2.compareTo(a4) > 0) {
			max = a2;
		}
		if (a3.compareTo(max) > 0 && a3.compareTo(a2) > 0 && a3.compareTo(a4) > 0) {
			max = a3;
		}
		if (a4.compareTo(max) > 0 && a4.compareTo(a2) > 0 && a4.compareTo(a3) > 0) {
			max = a4;
		}
		return max;
		}
	
}
