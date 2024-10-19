package com.Array.Sorting;

//this program is used to implementing the selection sort algorithm
public class SelectionSort {
public static void main(String[] args) {
//	declaring an array
	int arr[]= {64,55,22,51,11,6,3};
	
//	Outer loop is for selecting the element
	for(int i=0;i<arr.length;i++) {
//		indicating the ith element is the smallest
		int min=i;
		
//		inner loop is find the smallest among the unsorted part
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[min]) {
				min=j;
			}
		}
//		Swapping the variable
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
	}
	
//	For printing the statement
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
