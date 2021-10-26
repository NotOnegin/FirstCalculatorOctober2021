package com.calculator;

public class Operators {
	
	static int arabicResult;
	
public static void Calculate (String a, char c, String b) {
	
	Integer.parseInt(a);
	Integer.parseInt(b);
	
	if ((Integer.parseInt(a) > 10) || (Integer.parseInt(b) > 10) || (Integer.parseInt(a) < 1) || (Integer.parseInt(b) < 1)) {
		System.out.println("Please input values between 1-10");
	}
	else {
		
	switch (c) {
	
	case '+':
		arabicResult = (Integer.parseInt(a) + Integer.parseInt(b));
		System.out.println(arabicResult);
		break;
		
	case '-':
		arabicResult = (Integer.parseInt(a) - Integer.parseInt(b));
		System.out.println(arabicResult);
		break;
		
	case '*':
		arabicResult = (Integer.parseInt(a) * Integer.parseInt(b));
		System.out.println(arabicResult);
		break;
		
	case '/':
		arabicResult = (Integer.parseInt(a) / Integer.parseInt(b));
		System.out.println(arabicResult);
		break;
	
	default:
        System.out.println("Invalid operator, please input +, -, *, /");
        break;
}		
}
}
}

