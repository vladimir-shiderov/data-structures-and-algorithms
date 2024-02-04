package dsa.sorting;

public class MergeSort {
	public static void mergeSort(int[] array, int begin, int end) {
		if (begin < end) {
			int middle = (begin + end) / 2;
			mergeSort(array, begin, middle);
			mergeSort(array, middle + 1, end);
			merge(array, begin, middle, end);
		}
	}
	
	private static void merge(int[] array, int begin, int middle, int end) {
		int sizeOfLeftArray = middle - begin + 1;
		int sizeOfRightArray = end - middle;
		
		int[] leftArray = new int[sizeOfLeftArray];
		int[] rightArray = new int[sizeOfRightArray];
		
		for (int i = 0; i < sizeOfLeftArray; i++) {
			leftArray[i] = array[begin + i];
		}
		for (int j = 0; j < sizeOfRightArray; j++) {
			rightArray[j] = array[middle + 1 + j];
		}
		
		int i = 0, j = 0, k = begin;
		while (i < sizeOfLeftArray && j < sizeOfRightArray) {
			if (leftArray[i] <= rightArray[j]) {
				array[k++] = leftArray[i++];
			}
			else {
				array[k++] = rightArray[j++];
			}
		}
		
		while (i < sizeOfLeftArray) {
			array[k++] = leftArray[i++];
		}
		while (j < sizeOfRightArray) {
			array[k++] = rightArray[j++];
		}
	}
}
