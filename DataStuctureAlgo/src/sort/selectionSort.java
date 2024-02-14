package sort;

public class selectionSort {

	public static void main(String[] args) {
		
		
		int array [] = {5, 8, 9, 2, 7, 1, 6, 3};
		
		selectionSort(array);
		
		for(int display : array) {
			System.out.print(display);
		}

	}

	private static void selectionSort(int[] array) {
		
		for(int i = 0; i < array.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[min] > array[j]) {
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		
	}

}
