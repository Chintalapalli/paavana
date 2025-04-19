package com.learn;

import java.util.Arrays;
import java.util.*;

public class StringPrograms {

	public static void main(String[] args) {
		//CountCharacters();
		//Anagram();
		//DivideStringIntoEqualParts();
		//SubSetStrings();
		//LongestRepeatingString();
		Permutation("Paavana","");
	}
	
	private static void Permutation(String name, String result) {
		int n = name.length();
		//System.out.println("length::"+n);
		if(n==0) {
			System.out.print(" "+result);
			return ;
		}
		
		for(int i=0;i<n;i++) {
			char ch = name.charAt(i);
			String str = name.substring(0, i) + name.substring(i+1);
			Permutation(str,result+ch);
		}
		
	}

	private static void LongestRepeatingString() {
		String name = "PaavanaChintalapalliPaavanaKumarKumar";
		int n = name.length();
		String longestSequence = "";
		Map<String,Integer> subStringMap = new HashMap<String,Integer>();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				String nasa = name.substring(i, j+1);
				subStringMap.put(nasa, subStringMap.getOrDefault(nasa, 0)+1);
				if(subStringMap.get(nasa) > 1 && nasa.length() > longestSequence.length()) {
					longestSequence=nasa;
					System.out.println("longestSequence :::"+longestSequence);
				}
			}
		}
		//System.out.println("subStringMap :::"+subStringMap);
	}

	private static void SubSetStrings() {
		String name = "PaavanaChintalapalliPaavanaKumar";
		int n = name.length();
		String longestSequence = "";
		Map<String,Integer> subStringMap = new HashMap<String,Integer>();
		int sets = n*(n+1)/2;
		int count=0;
		String[] arr = new String[sets];
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				arr[count++]=name.substring(i, j+1);
			}
		}
		Arrays.sort(arr);
		for(String na : arr) {
			//System.out.println(" "+na);
			subStringMap.put(na, subStringMap.getOrDefault(na, 0)+1);
			if(subStringMap.get(na) > 1 && na.length() > longestSequence.length()) {
				longestSequence=na;
				System.out.println("longestSequence :::"+longestSequence);
			}
		}
	}

	private static void DivideStringIntoEqualParts() {
		String name = "PaavanaChintalapalli";
		int len = name.length();
		if(len%2==0) {
			String name1 = name.substring(0, len/2);
			System.out.println("1st half String:::"+name1);
			String name2 = name.substring(len/2,len);
			System.out.println("2nd half String:::"+name2);
		}
	}

	private static void Anagram() {
		String name = "pavanaa";
		String name1 ="vanapa";
		char[] nam = name.toCharArray();
		char[] nam1 = name1.toCharArray();
		Arrays.sort(nam);
		Arrays.sort(nam1);
		if(nam.length==nam1.length) {
		for(int i=0;i<nam.length;i++) {
			if(nam[i]==nam1[i]) {
				System.out.println("Anagrams");
			}else {
				System.out.println("Not Anagrams");
			}
		}
		}else {
			System.out.println("Not Anagrams");
		}
	}

	private static void CountCharacters() {
		String words ="Learning java with Paavana Chintalapalli";
		int count=0;
		for(int i=0;i<words.length();i++) {
			if(words.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("words count:::"+count);
	}

}
