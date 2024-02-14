package sort;

import java.util.Scanner;

public class bubbleSortString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many employees? ");
		int intInput = scan.nextInt();
		
		
		Scanner scan2 = new Scanner(System.in);
		String [] arr = new String[intInput];
		
		System.out.println("Enter names:");
		for(int i = 0; i < intInput; i++) {
			arr[i] = scan2.nextLine();
		}
		
		String temp;
		for(int i = 0; i < intInput; i++) {
			for(int j = i + 1; j < intInput; j++) {
				if(arr[i].compareTo(arr[j])>0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted: ");
		for(String arr2 : arr) {
			System.out.println(arr2);
		}

	}

}
