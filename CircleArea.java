package pack1;
import java.util.*;
import java.math.*;

public class CircleArea {
	  public static void main ( String[] args )  
	  {
		  
		    int inData;
		    Scanner scan = new Scanner( System.in );

		    System.out.println("Enter the circle's radius: ");
		    inData = scan.nextInt();
		    System.out.println("You entered:" + inData );

	    double area;
	    area = Math.PI * (inData*inData);
	    System.out.println("area of circle is: " + area );
	  }

}
