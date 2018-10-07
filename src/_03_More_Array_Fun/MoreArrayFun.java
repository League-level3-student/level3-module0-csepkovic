package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	String[] strings = new String[5];
	public static void main(String[] args) {
		String[] strings = new String[5];
		strings[0] = "1";
		strings[1] = "2";
		strings[2] = "3";
		strings[3] = "4";
		strings[4] = "5";
		printStrings(strings);
		System.out.println(" ");
		reversePrintStrings(strings);
		System.out.println(" ");
		printEveryOtherString(strings);
		System.out.println(" ");
		for (int i = 0; i < 5; i++) {
			randomlyPrintStrings(strings);
			System.out.println(" ");
		}
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printStrings(String[] arr) {
		for (String s: arr) {
			System.out.println(s);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void reversePrintStrings(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[(arr.length-1)-i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void printEveryOtherString(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i%2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomlyPrintStrings(String[] arr) {
		int print;
		for (String s: arr) {
			print = new Random().nextInt(2)-1;
			if (print == 0) {
				System.out.println(s);
			}
		}
	}
	
}
