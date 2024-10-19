package com.Array.Sorting;

//This program is the implementation of the bubble sort algorithm.
public class BubbleSort {
	public static void main(String[] args) {
//	The given array
		int array[] = { 5, 8, 3, 4 };

//	This outer for loop is used to control the phase of bubble sort
		for (int i = 0; i < array.length; i++) {

			int flag = 0;
			for (int j = 0; j < array.length - 1 - i; j++) {//array.length - 1 - i this making avoid the largest element comparision after each phase
//			inner loop is used to iterate the array

//			If condition is used to check the first element is greater or smaller than the second one
				if (array[j] > array[j + 1]) {
//			if true then swap the variable by using third variable
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
//				Making flag is 1 to indicate that array is not sorted yet.
					flag = 1;
				}
			}
			if (flag == 0) {
//			flag varible is used to identify further that array is sorted
				break;
			}
		}
//         Printing the sorted array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
