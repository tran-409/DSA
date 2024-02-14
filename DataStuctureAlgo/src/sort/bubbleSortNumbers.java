package sort;

import java.util.Scanner;

public class bubbleSortNumbers {

	public static void main(String[] args) {
		
		
		int [] arr = {5, 8, 3, 1, 6, 9, 7, 2};
		
		bubbleSort(arr);
		
		for(int display : arr) {
			System.out.print(display);
		}
	}

	private static void bubbleSort(int[] arr) {
		
		int temp;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
	}

}
