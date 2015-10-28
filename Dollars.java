package pack1;
import java.util.*;
import java.math.*;

public class Dollars {
	  public static void main ( String[] args )  
	  {
		  
		    int inData;
		    Scanner scan = new Scanner( System.in );

		    System.out.println("Enter the number of cents: ");
		    inData = scan.nextInt();
		    System.out.println("You entered: " + inData +" cents");

	    int dollars, cents;
	    dollars = inData/100;
	    cents = inData%100;
	    System.out.println("That is: " + dollars +" dollars and " +cents +" cents" );
	  }

}
