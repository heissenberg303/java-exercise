import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formatregx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Hallo Weld");
		}
		System.out.println("****************************************");
		//String S = doWrite(2,3,4,5,6);
		String s1 = "apple, apple and orange please";

		String[] parts = s1.split("\\b");

		for (String part: parts) {
			if(part.matches("\\w+"))
				System.out.println(part);
		}
		System.out.println("****************************************");

		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(s1);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		// Java Pattern Class documentation
		// Regular expression -> Powerful pattern matching syntax
		// String class support -> replaceFirst/All: Create new string
		//						-> split: Split String into an array
		//						-> match: Check for matching value
		// Dedicated classes -> Pattern: Compile regular expression
		//					 -> Matcher: Applies pattern to a string
		System.out.println("****************************************");

	}

//	void doWrite(int david, int dawson, int dillon, int gordon, double avgDiff) throws IOException {
//		BufferedWriter writer = Files.newBufferedWriter(Paths.get("myFile.txt"));
//		try(Formatter f = new Formatter(writer)) {
//			f.format("My nephews are %d, %d, %d, and %d years old", david, dawson, dillon, gordon);
//			f.format("The average age between each is %.1f years", avgDiff);
//		}
	}


