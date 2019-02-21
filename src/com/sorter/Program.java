package com.sorter;

public class Program {
	public static void main(String[] args) {
		String[] strings = {"Stas", "Yana", "Adam", "Gabriel", "Leo"};
		Sorter.SortStrings(strings);
		
		PrintArrayToString(strings);
	}
	
	public static void PrintArrayToString(String[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			
			if(i < array.length - 1) {
				System.out.print(", ");
			}
		}
	}
}
