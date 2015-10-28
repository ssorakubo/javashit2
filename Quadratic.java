package pack1;

public class Quadratic {
	  public static void main ( String[] args )  
	  {
	    double x, value, quad;
	    x=0.;
	    value=2.0;
	    
	    quad = 3*x*x - 8*x + 4;
	    System.out.println("quad = 3x^2 -8x + 4");
	    System.out.println("x = " + x );
	    System.out.println("at x = " + x  +" the value of quad is " +quad);

	    x = x+value;
	    System.out.println("\nx = " +x);
	    quad = 3*x*x - 8*x + 4;
	    System.out.println("at x = " +x + " the value of quad is " +quad);

	    x = x+value;
	    System.out.println("\nx = " +x);
	    quad = 3*x*x - 8*x + 4;
	    System.out.println("at x = " +x  +" the value of quad is " +quad);

	  }


}
