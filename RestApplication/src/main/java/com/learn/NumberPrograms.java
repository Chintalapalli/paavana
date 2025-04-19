package com.learn;

public class NumberPrograms {

	public static void main(String[] args) {
		ReverseNumber(354);
		
		
	}

	private static void ReverseNumber(int num) {
		String n = String.valueOf(num);
		String revNumber ="";
		char[] ch = n.toCharArray();
		for(int i=0;i<n.length();i++) {
			revNumber=ch[i]+revNumber;
		}
		int n1 = Integer.valueOf(revNumber);
		System.out.println("ReverseNumber:::"+n1);
	}

}
