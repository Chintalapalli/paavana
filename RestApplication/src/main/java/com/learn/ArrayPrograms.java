package com.learn;

import java.util.*;

public class ArrayPrograms {

	public static void main(String[] args) {
		//CopyAllElements();
		//ElementFrequency();
		//ElementFrequency("PaavanaChintalapalli");
		//DuplicateElements("PaavanaChintalapalli");
		//ReverseArray();
		//LargestSmallestNumber();
		//AsscendingOrder();
		RemovingDuplicates();
	}

	private static void RemovingDuplicates() {
		int[] n = {21,33,21,3,2,42,33,54,65};
		int len = n.length;
		Set<Integer> setNum = new HashSet<>();
		for(int num : n) {
			setNum.add(num);
		}
		int i=0;
		int[] nums = new int[setNum.size()];
		for(int num:setNum) {
			nums[i++]=num;
		}
		Arrays.sort(nums);
		for(int j=0;j<nums.length;j++) {
		System.out.print(" "+nums[j]);
		}
	}

	private static void AsscendingOrder() {
		int[] n = {21,42,33,54,65};
		int len = n.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<i;j++) {
				if(n[i]<n[j]) {   // (<) -- Ascending order  (>) -- Descending order
					int temp =n[j];
					n[j]=n[i];
					n[i]=temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<len;i++) {
			System.out.print(" "+n[i]);
		}
	}

	private static void LargestSmallestNumber() {
		int[] n = {1,2,3,4,5};
		int len = n.length;
		int max = n[0];
		int min = n[0];
		for(int i=0;i<len;i++) {
			if(n[i]>max) {
				max=n[i];
			}
			if(n[i]<min) {
				min=n[i];
			}
		}
		System.out.println("maximum element:::"+max);
		System.out.println("minimum element:::"+min);
	}

	private static void ReverseArray() {
		int[] n = {1,2,3,4,5};
		int len = n.length;
		for(int i=len-1;i>=0;i--) {
			System.out.print(" "+n[i]);
		}
		
	}

	private static void DuplicateElements(String string) {
		string =string.toLowerCase();
		Set count = new HashSet();
		char[] chars = string.toCharArray();
		for(char ch : chars) {
			if(!count.add(ch)) {
				System.out.println("Duplicate elements in name:::"+ch);
			}
		}		
	}

	private static void ElementFrequency(String string) {
		string =string.toLowerCase();
		Map<Object, Integer> count = new HashMap();
		char[] chars = string.toCharArray();
		for(char ch : chars) {
			count.put(ch, count.getOrDefault(ch, 0)+1);
		}
		System.out.println("frequency elements in name:::"+count);
	}

	private static void ElementFrequency() {
		int[] n = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,1,1,1,1,1,1,2,1};
		Map<Integer, Integer> countMap = new HashMap();
		for(int num : n) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}
		System.out.println("frequency elements:::"+countMap);
	}

	private static void CopyAllElements() {
		int[] n = {1,2,3,4,5};
		int[] n1 = {6,7,8,9,0};
		
		int nlength = n.length;
		int n1len = n1.length;
		int[] copy =new int[nlength+n1len];
		for(int i=0;i<nlength;i++) {
			copy[i]=n[i];
		}
		for(int i=0;i<n1len;i++) {
			copy[nlength+i]=n1[i];
		}
		for(int i=0;i<copy.length;i++) {
		System.out.println("Copied Elements::"+copy[i]);
		}
	}

	
}
