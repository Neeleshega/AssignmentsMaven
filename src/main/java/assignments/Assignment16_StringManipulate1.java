package assignments;

public class Assignment16_StringManipulate1 {

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";

		// devided in to multiple words
		String[] words = paragraph.split(" ");

		int count = 0;

		for (int i = 0; i < words.length; i++) {

			if (words[i].equalsIgnoreCase("Java")) {
				System.out.println("Java wword is present in Array with Index: " + i);
				count++;
			}

		}
		System.out.println("Total  number of Java Words in Sentence is: " + count);
	}

}
