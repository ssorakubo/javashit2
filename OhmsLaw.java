package pack1;
import java.util.*;
import java.math.*;

public class OhmsLaw {
	  public static void main ( String[] args )  
	  {
		  
		    int inData, inData2;
		    Scanner scan = new Scanner( System.in );
		    Scanner scan2 = new Scanner( System.in );

		    System.out.println("Enter the voltage in Volts: ");
		    inData = scan.nextInt();
		    System.out.println("You entered: " + inData +" Volts");
		    
		    System.out.println("Enter the resistance in ohms: ");
		    inData2 = scan2.nextInt();
		    System.out.println("You entered: " + inData2 +" ohms");

	    double i;
	    i = (inData + 0.0)/inData2;
	    System.out.println("i = " + i +" Amps ");
	  }

}
