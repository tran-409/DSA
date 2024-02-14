package sort;

public class insertionSort {

	public static void main(String[] args) {
		
		int [] arr = {3, 6, 7, 1, 9, 2, 5, 4};
		
		insertionSort(arr);
		
		for(int array : arr) {
			System.out.print(array + " ");
		}
		
		
		
	}

	private static void insertionSort(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		
	}

}
