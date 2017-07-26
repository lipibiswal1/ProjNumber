package devops.numbers;

/*Numbers class */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class NumberWordsApplication {
	private final NumberWords numberWords ;
	private final BufferedReader reader ;
	
	public NumberWordsApplication() {
		numberWords = new NumberWords() ;
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	
	public void execute() {
		
			try {
				System.out.print( "Enter number: " ) ;
				String value = reader.readLine() ;
				int number = Integer.parseInt( value ) ;
				numberWords.toWords(number);
		
			} catch ( NumberFormatException e ) {
				System.out.println( "Invalid number" ) ;
			}
			catch ( IOException e ) {
				System.out.println( "Invalid number" ) ;
			}
		}
	

	public static void main(String[] args) {
		new NumberWordsApplication().execute() ;
	}

}
