package pack1;
import java.util.*;
import java.math.*;

public class TirePressure {
	  public static void main ( String[] args )  
	  {
		  
		    int rightFront, leftFront, rightRear, leftRear;
		    boolean goodPressure = true;
		    Scanner scan = new Scanner( System.in );

		    System.out.println("Enter the right front pressure: ");
		    rightFront = scan.nextInt();
		    if(rightFront<35 || rightFront > 45)
		    {
		    	System.out.println("Warning:  RF Pressure is out of range!");
		    	goodPressure = false;
		    }
//		    System.out.println("You entered:" + inData );

		    System.out.println("Enter the left front pressure: ");
		    leftFront = scan.nextInt();
		    if(leftFront<35 || leftFront > 45)
		    {
		    	System.out.println("Warning:  LF Pressure is out of range!");
		    	goodPressure = false;
		    }

		    System.out.println("Enter the right rear pressure: ");
		    rightRear = scan.nextInt();
		    
		    if(rightRear<35 || rightRear > 45)
		    {
		    	System.out.println("Warning:  RR Pressure is out of range!");
		    	goodPressure = false;
		    }

		    System.out.println("Enter the left rear pressure: ");
		    leftRear = scan.nextInt();
		    if(leftRear<35 || leftRear > 45)
		    {
		    	System.out.println("Warning:  LR Pressure is out of range!");
		    	goodPressure = false;
		    }


		    if((rightFront-leftFront<=Math.abs(3)) && (rightRear-leftRear<=Math.abs(3)) && 
		    		goodPressure == true) 
		    {
			    System.out.println("Inflation is ok.");
		    }
		    else {
			    System.out.println("Inflation is BAD!");
		    }
		    
	  }

}
