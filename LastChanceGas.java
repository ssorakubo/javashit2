package pack1;
import java.util.*;
import java.math.*;

public class LastChanceGas {
	  public static void main ( String[] args )  
	  {
		  
		    int tankCapacity, gageReading, mpg;
		    Scanner scan = new Scanner( System.in );

		    System.out.println("Enter your tank capacity in gallons: ");
		    tankCapacity = scan.nextInt();
//		    System.out.println("You entered:" + inData );

		    System.out.println("Enter gage reading in percent: ");
		    gageReading = scan.nextInt();

		    System.out.println("Enter car miles per gallon: ");
		    mpg = scan.nextInt();

		    if(mpg*(tankCapacity*gageReading/100) >= 200) {
			    System.out.println("Don't need gas.");
		    }
		    else {
			    System.out.println("Get Gas now!");
		    }
		    
	  }

}
