package com.sorter;

public class Sorter {
	public static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	public Sorter() {
		
	}
	
	public static int IndexOfLetter(char letter) {
		for(int i = 0; i < alphabet.length; i++) {
			if(letter == alphabet[i]) return i;
		}
		
		return -1;
	}
	
	public static String CompareStrings(String stringA, String stringB) {
		int shortestLength = 0;
		String backupString = "";
		
		if(stringA.length() < stringB.length()) {
			shortestLength = stringA.length();
			backupString = stringA;
		}
		else {
			shortestLength = stringB.length();
			backupString = stringB;
		}
		
		for(int i = 0; i < shortestLength; i++) {
			char charA = Character.toLowerCase(stringA.charAt(i));
			char charB = Character.toLowerCase(stringB.charAt(i));
			
			if(IndexOfLetter(charA) < IndexOfLetter(charB)) {
				return stringA;
			}
			else if(IndexOfLetter(charA) > IndexOfLetter(charB)) {
				return stringB;
			}
		}
		
		return backupString;
	}
	
	public static boolean BooleanCompareStrings(String stringA, String stringB) {
		int shortestLength = 0;
		
		if(stringA.length() < stringB.length()) shortestLength = stringA.length();
		else shortestLength = stringB.length();
		
		for(int i = 0; i < shortestLength; i++) {
			char charA = Character.toLowerCase(stringA.charAt(i));
			char charB = Character.toLowerCase(stringB.charAt(i));
			
			if(IndexOfLetter(charA) > IndexOfLetter(charB)) {
				return true;
			}
		}

		return false;
	}
	
	public static void SortStrings(String[] stringsArray) {
		int length = stringsArray.length;
		String[] array = stringsArray;
		
		for(int i = 0; i < length - 1; i++) {
			for(int j = 0; j < length - i - 1; j++) {
				String stringA = array[j];
				String stringB = array[j + 1];
				
				if(CompareStrings(stringA, stringB).contentEquals(stringB)) {
					array[j] = stringB;
					array[j + 1] = stringA;
				}
			}
		}
		
		stringsArray = array;
	}
}
