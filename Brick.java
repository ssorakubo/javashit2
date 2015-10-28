package pack1;
import java.io.*;
import java.util.Scanner;

class Brick
{
  public static void main (String[] args)
  {
    double time, distance;
    Scanner scan = new Scanner( System.in );
 
    System.out.print("Enter the number of seconds: ");
    time = scan.nextDouble();

    System.out.println("Speed of the brick: " + 32.174*time + " feet per second");
    
    time = Math.sqrt(2*100/32.174);
    System.out.println("time to fall 100 feet: " + time + " seconds");
  }

}
