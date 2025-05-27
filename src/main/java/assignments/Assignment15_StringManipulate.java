package assignments;

public class Assignment15_StringManipulate {

	public static void main(String[] args) {

		//Declare the sentence
		String sentence = "Java programming is fun and challenging";

		//get total number of chars in sentence
		System.out.println("Total  number of Chars in Sentence is: " + sentence.length());

		//get total number of words in sentence
		// System.out.println("Total number of Words in Sentence is: "+sentence.split(" ").length);
		
		//here split sentence in to each word
		String[] word = sentence.split(" ");
		
		//get total number of words in sentence
		System.out.println("Total  number of Words in Sentence is: " + word.length);
		
		String newSentence = "";
		
		//taking each letter from word
		for (int i = word.length - 1; i >= 0; i--) {
		
		//taking 1st letter from word and convert it into upper case
		String firstLetter = word[i].substring(0,1).toUpperCase();
		
		//to kept remaining letter as it is
		String remainingLetters = word[i].substring(1,word[i].length());
		
		//combining 1st letter and remaining letters
		word[i] = firstLetter+remainingLetters;
		
		//combining words after converting upper case of 1st letter from each word  
		newSentence = newSentence+word[i]+" ";
		
		}
		
		//printing new sentence after Convert the first character of each word to upper case
		System.out.println(newSentence);

		String revSentence = "";
		
		//taking each letter from last and print as 1st letter
		for (int i = sentence.length() - 1; i >= 0; i--) {
			revSentence = revSentence + sentence.charAt(i);
		}
		System.out.println(revSentence);

	}

}
