package pack1;
import java.util.Scanner;
import java.math.*;

public class Power {
	  public static void main ( String[] args )  
	  {
	    double x, power;
	    double n;
	    Scanner scan = new Scanner( System.in );

	    System.out.println("Enter X, the number to be raised to a power: ");
	    x = scan.nextFloat();

	    System.out.println("Enter n, the positive integer exponent: ");
	    n = scan.nextInt();

	    int i=1;
	    power=1;
	    if(n < 0) {
		    System.out.println("n must be a positive integer, stupid!\n");
	    } 
	    else {
	    	for (i=1; i<=n; i++) {
	    		power = power*x;
//	    		i++;
	    		}
	    
	    System.out.println(x +" raised to the power of " +n +" is:" +power);
	    }

	  }

}
