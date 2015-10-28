package pack1;
import java.util.*;
import java.math.*;

public class StartingValue {
	  public static void main ( String[] args )  
	  {
		  
		    int start, end, i;
		    Scanner scan = new Scanner( System.in );

		    System.out.println("Enter the starting number: ");
		    start = scan.nextInt();

		    System.out.println("Enter the ending number: ");
		    end = scan.nextInt();
		    i = start;
		    while( i <= end) 
		    		{
				    	System.out.println(i);
				    	i=i+1;
		    		}
	  }

}
