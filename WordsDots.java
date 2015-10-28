package pack1;
import java.util.*;
import java.math.*;

public class WordsDots {
	  public static void main ( String[] args )  
	  {
		  
		    String word1, word2;
		    int i, len1, len2;
		    Scanner scan = new Scanner( System.in );

		    System.out.println("Enter word1: ");
		    word1 = scan.next();
		    System.out.println("Enter word2: ");
		    word2 = scan.next();

		    len1=word1.length();
		    len2=word2.length();

		    System.out.print(word1);
		    i = len1;
		    while( i < 30-len2) 
		    		{
				    	System.out.print(".");
				    	i++;
		    		}
		    System.out.print(word2);
	  }

}
