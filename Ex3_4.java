import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Ex3_4 {
	public static void split() {
		boolean didCR = true; 
		int i;
		String phrase_modifie = "";
		LinkedList <String>liste;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Saisissez une phrase:");
		String phrase = stdin.nextLine();
		for (i=0; i<phrase.length();++i ){
			if ((phrase.charAt(i) >= 'a' && phrase.charAt(i) <= 'z') || (phrase.charAt(i) >= 'A' && phrase.charAt(i) <= 'Z')){
				 System.out.print(phrase.charAt(i));
	             didCR = false;
			}
			else {
				if ( didCR == false ) {
	                System.out.println();
	                didCR = true;
	            }
			}
			
		}
		System.out.println(phrase_modifie);
	}
	
	public static void main(String[] args){
		split();
	}
}

/* CORRECTION
public class ListWordsInString {

public static void main(String[] args) {

    String line;    // A line of text, typed in by the user.
    int i;          // Position in line, from 0 to line.length() - 1.
    char ch;        // One of the characters in line.
    boolean didCR;  // Set to true if the previous output was a carriage return.
    
    System.out.println("Enter a line of text.");
    System.out.print("? ");
    line = TextIO.getln();
    
    System.out.println();
    didCR = true;
    
    for ( i = 0;  i < line.length();  i++ ) {
       ch = line.charAt(i);
       if ( Character.isLetter(ch) ) {
          System.out.print(ch);
          didCR = false;
       }
       else {
          if ( didCR == false ) {
             System.out.println();
             didCR = true;
          }
       }
    }
    
    System.out.println();  // Make sure there's at least one carriage return at the end.
      
}  // end main()

}  // end class ListWordsInString */