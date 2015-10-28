package pack1;
import java.util.*;

public class Trig {
	  public static void main ( String[] args )  
	  {
	    double sinx,cosx,sum, rad, degrees;
//	    degrees=180;
	    Scanner scan = new Scanner( System.in );

	    System.out.println("Enter degrees: ");
	    degrees = scan.nextDouble();
	    System.out.println("You entered: " + degrees);

	    rad = degrees * Math.PI/180;
	    sinx = Math.sin(rad);
	    cosx = Math.cos(rad);
	    
	    sum = sinx*sinx + cosx*cosx;
	    System.out.println("sine: "  +sinx +" \ncosine: " +cosx +" \nsum: " +sum);
	  }
}
