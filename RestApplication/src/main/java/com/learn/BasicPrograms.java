package com.learn;

import java.security.SecureRandom;

public class BasicPrograms {
	
	public static void main(String[] args) {
		//palindrome("mom");
		//palindromeWithNumber(12321);
		//fibonacci(10);
		//primeNumber(10);
		//Factorial(5);
		//ArmStrongNumber(145);
		//RandomNumber();
		//ASCIIvalues();
		System.out.println("RandomNumber::: "+RandomNumber());
		System.out.print("Factorial::: "+Factorial(5));
	}

	private static void ASCIIvalues() {
		char ch;
		for(int i=33;i<100;i++) {
			ch =(char) i;
			System.out.println(i+":"+ch);
		}
		
	}

	private static int RandomNumber() {
		SecureRandom num = new SecureRandom();
		int otp = 100000+num.nextInt(999999);
		String value = String.valueOf(otp);
		if(value.length()!=6) {
			System.out.println("value:::"+value+" length:::"+value.length());
			return RandomNumber();
		}else {
			return otp;
		}
	}

	private static void ArmStrongNumber(int i) {
		int sum =0;
		String num = String.valueOf(i);
		char[] chars = num.toCharArray();
		for(int j=0;j<num.length();j++) {
			int k =Character.getNumericValue(chars[j]);
			sum =sum + Factorial(k);
		}
		if(i==sum) {
			System.out.println("ArmStrongNumber::"+sum);
		}else {
			System.out.println("Not a ArmStrongNumber::"+sum);
		}
		
	}

	private static int Factorial(int i) {
		if(i==0) {
			return 1;
		}
		return i*Factorial(i-1);
	}

	private static void palindromeWithNumber(int i) {
		String num = String.valueOf(i);
		StringBuilder sb = new StringBuilder(num).reverse();
		int j =Integer.parseInt(num);
		if(i==j) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
	}

	private static void palindrome(String string) {
		String revName="";
		char[] chars = string.toCharArray();
		for(int i=0;i<chars.length;i++) {
			revName=chars[i]+revName;
			
		}
		if(string.equalsIgnoreCase(revName)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

	private static void primeNumber(int i) {
		for(int j=0;j<i;j++) {
			if(j%2!=0) {
				System.out.println("prime Numbers:::"+j);
			}
		}
		
	}

	private static void fibonacci(int num) {
		int j=0;
		int k=1;
		System.out.print(j+" "+k);
		for(int i=2;i<num;++i) {
			int sum = j+k;
			System.out.print(" "+sum);  
			j=k;
			k=sum;
		}
	}

}
