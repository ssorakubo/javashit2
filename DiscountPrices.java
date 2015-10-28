package pack1;
import java.util.*;
import java.math.*;

public class DiscountPrices {
	  public static void main ( String[] args )  
	  {
		  
		    int inData;
		    Scanner scan = new Scanner( System.in );

		    System.out.println("Enter the price in cents: ");
		    inData = scan.nextInt();
		    System.out.println("You entered:" + inData );

		    if(inData > 1000) {
			    System.out.println("Discounted price is: " +(inData - inData/10) +" cents");
		    }
			else {
			    System.out.println("Sorry, no Discount.  Full price of " +inData +" cents");
			}
		    
	  }

}
