import java.io.*;   	//for file

public class HangmanListTest {
   public static void main(String[] args) throws FileNotFoundException {
  	HangmanList hangman = new HangmanList();
  	hangman.setList("easy");
  	String word = hangman.getWord();
  	System.out.println(word);
  	word = hangman.getWord();
  	System.out.println(word);
  	System.out.println();
  	HangmanList moreDifficult = new HangmanList();
  	moreDifficult.setList("medium");
  	String word2 = moreDifficult.getWord();
  	System.out.println(word2);
  	word2 = moreDifficult.getWord();
  	System.out.println(word2);
  	System.out.println();
  	//HangmanList mostDifficult = new HangmanList();
  	//mostDifficult.setList("hard");
  	//String word3 = mostDifficult.getWord();
  	//System.out.println(word3);
  	//word3 = mostDifficult.getWord();
  	//System.out.println(word3);
   }
}