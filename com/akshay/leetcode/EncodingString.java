package com.akshay.leetcode;

import java.util.LinkedHashSet;
import java.util.Set;

public class EncodingString {
	
	private static String encodeString(String s) {
		StringBuffer codeBuffer=new StringBuffer();
		
		//Removing vowels from given string
		s=s.replaceAll("[aeiou]", "");	
		
		//Removing duplicates using helper function removeDuplicates
		s=removeDuplicates(s);
		
		//encoding string
		s=encodingHelper(s,codeBuffer);
		
		//returning result to main function
		return codeBuffer.toString();
	}
	
	
	private static String encodingHelper(String s, StringBuffer codeBuffer) {
		
		//encoding characters from first character until last but one characters
		for(int i=0; i<s.length()-1; i++) {
			int next = s.charAt(i+1) - 'a'+1, prev=s.charAt(i) - 'a' +1;
			int sum1 = (next + prev)%26;
			char encoded = (char) ('a' + sum1%26 -1); 
			codeBuffer.append(encoded); //appending every character to string buffer as it is encoded
		}
		
		//encoding last character
		int idLast = s.charAt(s.length()-1) - 'a'+1, idFirst=s.charAt(0) - 'a' +1;
		int sum = (idLast + idFirst)%26;
		char lastEncoded = (char) ('a' + sum%26 -1);		
		codeBuffer.append(lastEncoded); //appending last character by handling it separately
		
		return codeBuffer.toString();
	}
	
	private static String removeDuplicates(String s) {
		char[] chars = s.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		return sb.toString();
	}
		
	public static void main(String[] args) {
		System.out.println(encodeString("yxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxyxioioioioio"));
	}
}
