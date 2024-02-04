package dsa;

import java.util.Arrays;

import dsa.sorting.MergeSort;

public class App {

	public static void main(String[] args) {
		int[] exampleArray = {7, 3, 12, 9, 24, 8, 1, 25, 10};
		
		System.out.println("Unsorted array: " + Arrays.toString(exampleArray));
		MergeSort.mergeSort(exampleArray, 0, exampleArray.length - 1);
		System.out.println("Sorted array: " + Arrays.toString(exampleArray));
	}

}
