package com.sorter;

public class Program {
	public static void main(String[] args) {
		String[] strings = {"Stas", "Yana", "Adam", "Gabriel", "Leo"};
		Sorter.SortStrings(strings);
		
		PrintArrayToString(strings);
	}
	
	public static void PrintArrayToString(String[] array) {
		for(String string : array) {
			System.out.print(string + ", ");
		}
	}
}
