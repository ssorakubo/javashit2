package pack1;
import java.util.*;
import java.math.*;

public class CorrectChange {
	  public static void main ( String[] args )  
	  {
		  
		    int inData;
		    Scanner scan = new Scanner( System.in );

		    System.out.println("Enter amount of change is due (in cents): ");
		    inData = scan.nextInt();
		    System.out.println("You entered: " + inData +" cents");

	    int dollars, quarters, dimes, nickels, pennies;
	    dollars = inData/100;
	    quarters = (inData%100)/25;
	    dimes = (inData%100-quarters*25)/10;
	    nickels = (inData%100-quarters*25-dimes*10)/5;
	    pennies = inData%100-quarters*25-dimes*10-nickels*5;
	    System.out.println("That is: " + dollars +" dollars ");
	    System.out.println("Quarters: " + quarters +" quarters ");
	    System.out.println("Dimes: " + dimes +" dimes ");
	    System.out.println("Nickels: " + nickels +" nickels ");
	    System.out.println("pennies: " + pennies +" pennies ");
	  }

}
