/*
 * This challenge question is as follows 
 * "For this challenge you will be determining the largest word in a string."
 */
public class LongestWord {

	String theLongest = ""; 



	public LongestWord(String sentence) {

		findLongest(sentence);

		System.out.println(theLongest);

	}


	/**
	 * This implementation runs in O(n) Time. 
	 * My implementation takes the string, and has a class variable already set. This variable will be changed 
	 * in the event that the word closest to the front is bigger than the class variable string. 
	 * it recursively goes through the string to check if the string has a larger string
	 * and then takes the first word off the string. 
	 * @param sentence This is a string that the user will input to check for the longest word
	 */
	public void findLongest(String sentence) { 
		
		if (sentence.contains(" ") == true) {
			
			String currentWord = sentence.substring(0,sentence.indexOf(" "));

			if (this.theLongest.length() < currentWord.length()) {

				this.theLongest = currentWord;

			}

			sentence = sentence.substring(sentence.indexOf(" ")+1,sentence.length());

			findLongest(sentence);

		}

		else if (sentence.length()>0) {
			
			if (this.theLongest.length() < sentence.length()) {
				
				this.theLongest = sentence;
			
			}
			
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LongestWord theLongestWord = new LongestWord("This is a TESTER for the People to Look at balls ");

	}

}
