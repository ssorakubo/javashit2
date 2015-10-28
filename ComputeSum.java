package pack1;

import java.util.Scanner;

public class ComputeSum {
	  public static void main ( String[] args )  
	  {
	    int intInput;
	    double sum;
	    Scanner scan = new Scanner( System.in );

	    System.out.println("Enter an integer for the denominator: ");
	    intInput = scan.nextInt();
	    
	    sum = 0;
	    int i=1;
	    while(i <= intInput) {
	    	sum = sum + 1.0/i;
	    	i++;
	    }
	    System.out.println("Total is: " +sum);
	    	


	    

	  }


}
