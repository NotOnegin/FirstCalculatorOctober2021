package com.calculator;

public class Roman {
	static String romanResult;
	static int preliminaryRomanResult;
	static int aa;
	static int bb;

public static void Convert (String a, char c, String b) {
	
	switch (a) {
	
	case "I":
		a = "1";
		aa = 1;
		break;
		
	case "II":
		a = "2";
		aa = 2;
		break;
		
	case "III":
		a = "3";
		aa = 3;
		break;
		
	case "IV":
		a = "4";
		aa = 4;
		break;
		
	case "V":
		a = "5";
		aa = 5;
		break;
		
	case "VI":
		a = "6";
		aa = 6;
		break;
		
	case "VII":
		a = "7";
		aa = 7;
		break;
		
	case "VIII":
		a = "8";
		aa = 8;
		break;
		
	case "IX":
		a = "9";
		aa = 9;
		break;
		
	case "X":
		a = "10";
		aa = 10;
		break;

	}
	
switch (b) {
	
	case "I":
		b = "1";
		bb = 1;
		break;
		
	case "II":
		b = "2";
		bb = 2;
		break;
		
	case "III":
		b = "3";
		bb = 3;
		break;
		
	case "IV":
		b = "4";
		bb = 4;
		break;
		
	case "V":
		b = "5";
		bb = 5;
		break;
		
	case "VI":
		b = "6";
		bb = 6;
		break;
		
	case "VII":
		b = "7";
		bb = 7;
		break;
		
	case "VIII":
		b = "8";
		bb = 8;
		break;
		
	case "IX":
		b = "9";
		bb = 9;
		break;
		
	case "X":
		b = "10";
		bb = 10;
		break;	
		
	}
switch (c) {

case '+':
	preliminaryRomanResult = (aa + bb); 
	romanResult = Integer.toString(preliminaryRomanResult); 
	Conversion.convertToRoman(romanResult); 
	
	break;
	
case '-':
	preliminaryRomanResult = (aa - bb);
	if (preliminaryRomanResult < 0)
	System.out.println("Roman numerals cannot be negative");
	else {
		romanResult = Integer.toString(preliminaryRomanResult);
		Conversion.convertToRoman(romanResult);
	}
	break;
	
case '*':
	preliminaryRomanResult = (aa * bb);
	romanResult = Integer.toString(preliminaryRomanResult);
	Conversion.convertToRoman(romanResult);
	
	break;
	
case '/':
	preliminaryRomanResult = (aa / bb);
	romanResult = Integer.toString(preliminaryRomanResult);
	Conversion.convertToRoman(romanResult);
	
	break;

default:
    System.out.println("Invalid operator, please input +, -, *, /");
    break;
	}
}
}



	