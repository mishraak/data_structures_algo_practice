package com.akshay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IntToRoman {
	
	static Map<Integer, String> map = new HashMap();	
	static int[] arr = new int[] {1000,900,500,400,100,90,50,40,20,10,9,5,4,1};
	static Map<String, Integer> rMap = new HashMap();
	
	static String n="";
	static int nu=0;
	
	public static void main(String[] args) {
		
		map.put(1,"I");
		map.put(4,"IV");
		map.put(5,"V");
		map.put(9,"IX");
		map.put(10,"X");
		map.put(20,"XX");
		map.put(40,"XL");
		map.put(50,"L");
		map.put(90,"XC");
		map.put(100,"C");
		map.put(400,"CD");
		map.put(500,"D");
		map.put(900,"CM");
		map.put(1000,"M");
	
		rMap.put("I",1);
		rMap.put("IV",4);
		rMap.put("V",5);
		rMap.put("IX",9);
		rMap.put("X",10);
		rMap.put("XX",20);
		rMap.put("XL",40);
		rMap.put("L",50);
		rMap.put("XC",90);
		rMap.put("C",100);
		rMap.put("CD",400);
		rMap.put("D",500);
		rMap.put("CM",900);
		rMap.put("M",1000);
		
		
		
		convertToRoman(1857);
		convertToInt("MDCCCLVII");
		System.out.println(n);
		System.out.println(nu);
	}

	private static void convertToRoman(int num) {
		for(int i=0; i<arr.length; i++) {
			while(num>=arr[i]) {
				n+=map.get(arr[i]);
				num-=arr[i];				
			}
		}			
	}
		
	private static void convertToInt(String roman) {
		int[] array = new int[roman.length()];
		for(int i=0; i<roman.length(); i++) array[i]=rMap.get(roman.charAt(i)+"");								
		
		for(int i=0; i<roman.length()-1; i++) {
			if(array[i]<array[i+1]) nu -= array[i];
			else nu += array[i];
		}
		nu+=rMap.get(roman.charAt(roman.length()-1)+"");
		
	}		
}
