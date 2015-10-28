package pack1;
import java.util.*;
import java.math.*;

public class OrderChecker {
	  public static void main ( String[] args )  
	  {
		  
		    int bolts, nuts, washers, amount;
		    final int boltsPrice=5;
		    final int nutsPrice=3;
		    final int washersPrice=1;
		    Scanner scan = new Scanner( System.in );

		    System.out.println("Enter the number of bolts: ");
		    bolts = scan.nextInt();
//		    System.out.println("You entered:" + inData );

		    System.out.println("Enter the number of nuts: ");
		    nuts = scan.nextInt();

		    System.out.println("Enter the number of washers: ");
		    washers = scan.nextInt();

		    amount = bolts*boltsPrice + nuts*nutsPrice + washers*washersPrice;
		    System.out.println("Total Cost: " +amount +" cents");

		    if(nuts < bolts) {
			    System.out.println("Check the order:  Too few nuts");
		    }
		    if(washers < 2*bolts) {
			    System.out.println("Check the order:  Too few washers");
		    }
		    
	  }

}
