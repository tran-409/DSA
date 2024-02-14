package Search;

public class linearSearch {

	public static void main(String[] args) {
		
		int [] array = {9, 1, 8, 2, 7, 3, 4, 5, 6};
		int index = LinearSearch(array, 4);

		System.out.println("index at: " + index);
	}

	private static int LinearSearch(int[] array, int value) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				return i;
			}
		}
		return -1;
	}

}
