
public class LetterChanges {

	public LetterChanges() {

	}

	public String change(String myWord){
		for(int characterSpot = 0; myWord.length()>characterSpot; characterSpot++) {
			String currentChar = myWord.substring(characterSpot,characterSpot+1);
			switch(currentChar.toLowerCase()) {
				case "a": myWord = myWord.replace('a','b');
					System.out.println("hi");
					break;
				case "b": myWord = myWord.replace('b','c');
					System.out.println("this is odd");
					break;
				case "c": myWord = myWord.replace('c','d');
					break;
				case "d": myWord = myWord.replace('d','E');
					break;
				case "e":  myWord = myWord.replace('c','d');
					break;
			}
			

		}
		return myWord;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LetterChanges tryChange = new LetterChanges();

		System.out.println(tryChange.change("a"));

	}

}
