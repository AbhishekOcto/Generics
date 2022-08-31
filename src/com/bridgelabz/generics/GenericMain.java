package com.bridgelabz.generics;

public class GenericMain {

	public static void main(String[] args) {
		System.out.println("Maximum of Integers is: " + FindMaximum.maxOfValues(101, 520, 188, 212));
		System.out.println("Maximum of Float is: " + FindMaximum.maxOfValues(150.75f, 230.44f, 17.71f, 99.99f));
		System.out.println("Maximum of three Strings is: " + FindMaximum.maxOfValues("aeroplane", "truck", "bicycle", "ferry"));

	}

}
