package pack1;
import java.util.*;
import java.math.*;

public class HarmonicMean {
	  public static void main ( String[] args )  
	  {
		  
		    double inData, inData2, h;
		    Scanner scan = new Scanner( System.in );

		    System.out.println("Enter x: ");
		    inData = scan.nextDouble();
		    System.out.println("You entered: " + inData);

		    System.out.println("Enter y: ");
		    inData2 = scan.nextDouble();
		    System.out.println("You entered: " + inData2);

		    //calculates log base 2 (inData)
		    h = 2/((1/inData) + (1/inData2));
	    System.out.println("Arithmetic mean is: " +((inData+inData2)/2));
	    System.out.println("Harmonic mean is: " +h);
	  }

}
