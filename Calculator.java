package com.calculator;

import java.util.Scanner;

public class Calculator {

	String a;
	char c;
	String b;
	String romanResult;
	
public static void main(String[] args) {

	Scanner ScanInput = new Scanner(System.in);
	System.out.println("Enter your arithmetic expression:");
	String a = ScanInput.next().toUpperCase();
	char c = ScanInput.next().charAt(0);
	String b = ScanInput.next().toUpperCase();	

		Roman.Convert(a, c, b); 
	try { 
		Operators.Calculate(a, c, b); } 
	catch (Exception e) {
	  
		 }
	 }
}




	



	

