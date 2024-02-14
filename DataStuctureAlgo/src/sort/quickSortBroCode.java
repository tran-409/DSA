package sort;

public class quickSortBroCode {

	public static void main(String[] args) {
		int [] array = {5, 7, 3, 2, 4, 6, 9, 8, 1};
		
		quickSort(array , 0, array.length - 1);
		
		for(int display : array) {
			System.out.print(display + " ");
		}

	}

	private static void quickSort(int[] array, int start, int end) {
		
		if(start >= end) {
			return;
		}
		
		int pivot = partition(array, start, end);
		quickSort(array, start, pivot - 1);
		quickSort(array, pivot + 1, end);
		
	}
	
	private static int partition(int [] array, int start, int end) {
		
		int pivot = array[end];
		int i = start - 1;
		
		for(int j = start; j<= end - 1; j++) {
			if(array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i]= array[j];
				array[j] = temp;
			}
		}
		i++;
		int temp = array[i];
		array[i]= array[end];
		array[end] = temp;
		
		return i;
	}

}