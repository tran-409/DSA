package sort;

public class quickSort {

	public static void main(String[] args) {
		
		int [] array = {5, 7, 3, 2, 4, 6, 9, 8, 1};

		quicksort(array, 0, array.length - 1);
		
		for(int displayArray: array) {
			System.out.print(displayArray + " ");
		}
	}

	private static void quicksort(int[] array, int lowIndex, int highIndex) {
		
		if(lowIndex >= highIndex) {
			return;
		}
		
		int pivot = array[highIndex];
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while(leftPointer < rightPointer) {
			
			while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			
			swap(array, leftPointer, rightPointer);
		}
		
		swap(array, leftPointer, highIndex);
		
		quicksort(array, lowIndex, leftPointer - 1);
		quicksort(array, rightPointer + 1, highIndex);
		
	}
	
	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}
