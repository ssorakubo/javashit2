package pack1;
import java.util.*;
import java.math.*;

public class FindLog2 {
	  public static void main ( String[] args )  
	  {
		  
		    double inData, loge;
		    Scanner scan = new Scanner( System.in );

		    System.out.println("Enter a double: ");
		    inData = scan.nextDouble();
		    System.out.println("You entered: " + inData);

		    //calculates log base 2 (inData)
		    loge = Math.log(inData)/Math.log(2);
	    System.out.println("Base 2 log of " +inData +"is " +loge);
	  }

}
