package MudandoString;

public class Strings {

	public static void main(String[] args) {
		
		String original = "abcde FGHI ABC abc DEFG    ";
		
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
				
		
		System.out.println("Original: - " + original + "-");
		System.out.println("toLowerCase: - " + s01 + "-");
		System.out.println("toUpperCase: - " + s02 + "-");
		System.out.println("trim: - " + s03 + "-");
		System.out.println("substring(2): - " + s04 + "-");
		System.out.println("substring(2,9): - " + s05 + "-");
		System.out.println("replace: - " + s06 + "-");
		System.out.println("index of: - " + i);
		System.out.println("index of: - " + j);
		

		
	}

}
