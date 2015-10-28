package pack1;
import java.util.*;
import java.math.*;

public class WordLength {
	  public static void main ( String[] args )  
	  {
		  
		    String word;
		    int i;
		    Scanner scan = new Scanner( System.in );

		    System.out.println("Enter a word: ");
		    word = scan.next();


		    i = 1;
		    while( i <= word.length()) 
		    		{
				    	System.out.println("i= " +i +"\t" +word);
				    	i++;
		    		}
	  }

}
