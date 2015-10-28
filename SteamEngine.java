package pack1;

import java.util.Scanner;

public class SteamEngine {
	  public static void main ( String[] args )  
	  {
	    double Tair, Tsteam, efficiency;
	    Scanner scan = new Scanner( System.in );

	    System.out.println("Enter the Air temperature: ");
	    Tair = scan.nextDouble();

	    System.out.println("Enter the Steam temperature: ");
	    Tsteam = scan.nextDouble();

	    efficiency = 1-(Tair/Tsteam);
	    if (Tsteam >= 373)
	    	System.out.println("Max efficiency is " +efficiency);
	    else
	    	System.out.println("Efficiency is 0, as Tsteam less than boiling temp");
	    

	  }


}
