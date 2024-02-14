package reverse;

public class stringReverse {

	public static void main(String[] args) {
		
		String name = reverse("tune");
		System.out.println(name);
	}

	private static String reverse(String name) {
		
		char [] letters = new char[name.length()];
		int index = 0;
		
		for(int i = name.length() - 1; i >= 0; i--) {
			letters[index] = name.charAt(i);
			index++;
		}
		
		String empty = "";
		for(int i = 0; i < name.length(); i++) {
			empty = empty + letters[i];
		}
		
		return empty;
		
	}

}
