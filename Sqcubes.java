package pack1;
import java.util.Scanner;

public class Sqcubes {
	  public static void main ( String[] args )  
	  {
	    int intInput;
	    int sumSquares, sumCubes;
	    int sumSquares2, sumCubes2;
	    Scanner scan = new Scanner( System.in );

	    System.out.println("Enter an integer for the upper limit: ");
	    intInput = scan.nextInt();
	    
	    sumSquares = 0;
	    sumCubes = 0;
	    int i=1;
	    while(i <= intInput) {
	    	sumSquares = sumSquares + i*i;
	    	sumCubes = sumCubes + i*i*i;
	    	i++;
	    }
	    System.out.println("Sum of squares is: " +sumSquares);
	    System.out.println("Sum of cubes is: " +sumCubes);

    	sumSquares2 = intInput*(intInput+1)*(2*intInput+1)/6;
    	sumCubes2 = intInput*intInput*(intInput+1)*(intInput+1)/4;
	    System.out.println("Sum of squares2 is: " +sumSquares2);
	    System.out.println("Sum of cubes2 is: " +sumCubes2);

	  }

}
