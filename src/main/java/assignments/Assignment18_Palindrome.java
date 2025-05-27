package assignments;

public class Assignment18_Palindrome {

	public static void main(String[] args) {

		// String s = "A man, a plan, a canal: Panama";

		String s = "race a Car";

		String cleanSentence = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		System.out.println(cleanSentence);

		String sentence = "";

		// taking each letter from last and print as 1st letter
		for (int i = cleanSentence.length() - 1; i >= 0; i--) {
			sentence = sentence + cleanSentence.charAt(i);

		}

		System.out.println(sentence);

		if (sentence != cleanSentence) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}

	}

}
