package Search;

public class interpolationSearch {

	public static void main(String[] args) {


		int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int index = InterpolationSearch(array, 8);

	}

	private static int InterpolationSearch(int[] array, int value) {
		
		int high = array.length - 1;
		int low = 0;
		
		while(value >= array[low] && value <= array[high] && low <= high) {
			int probe = low + (high - low) * (value - array[low]) / 
						(array[high] - array[low]);
		}
		return 0;
	}

}
