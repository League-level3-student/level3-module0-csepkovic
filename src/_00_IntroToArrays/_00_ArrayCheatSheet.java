package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] strings = new String[5];
		//2. print the third element in the array
		System.out.println(strings[2]);
		//3. set the third element to a different value
		strings[2] = "three";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < strings.length; i++) {
			strings[i] = "kachow";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		//7. make an array of 50 integers
		int[] numbers = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		}
		//9. without printing the entire array, print only the smallest number on the array
		System.out.println(numbers[0]);
		//10 print the entire array to see if step 8 was correct
		for (int n: numbers) {
			System.out.println(n);
		}
		//11. print the largest number in the array.
		System.out.println(numbers[49]);
		//12. print only the last element in the array
		System.out.println(numbers[numbers.length-1]);
	}
}
