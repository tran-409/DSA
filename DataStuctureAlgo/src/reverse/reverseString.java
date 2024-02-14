package reverse;

public class reverseString {

	public static void main(String[] args) {
		String word = "Tune";
		

		System.out.println(reverse(word));

	}

	private static String reverse(String word) {
		
		char [] array = new char[word.length()];
		
		int index = 0;
		
		for(int i = word.length() - 1; i >=0; i--) {
			array[index] = word.charAt(i);
			index++;
		}
		String reversed = "";
		for(int i = 0; i < word.length(); i++) {
			reversed = reversed + array[i];
		}
		
		return reversed;
	}

}
