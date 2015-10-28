package pack1;

import java.util.Scanner;

public class BeefValue {
	  public static void main ( String[] args )  
	  {
	    double priceA, leanA, priceB, leanB;
	    Scanner scan = new Scanner( System.in );

	    System.out.println("Enter price per lb of package A: ");
	    priceA = scan.nextDouble();

	    System.out.println("Percent lean of package A: ");
	    leanA = scan.nextDouble();

	    System.out.println("Package A cost per lb of lean: " +priceA*100/leanA);

	    System.out.println("Enter price per lb of package B: ");
	    priceB = scan.nextDouble();

	    System.out.println("Percent lean of package B: ");
	    leanB = scan.nextDouble();

	    System.out.println("Package B cost per lb of lean: " +priceB*100/leanB);
	    
	    if (priceB/leanB > priceA/leanA)
	    	System.out.println("Package A is the best value");
	    else
	    	System.out.println("Package B is the best value");
	    

	  }


}
