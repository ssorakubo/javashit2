//package com.paypal.test.filtercoffee.test.aries.membersale;
package pack1;
import java.io.*;
import java.util.Scanner;

class Appliance
{
  public static void main (String[] args)
  {
    double cost, hours;
    Scanner scan = new Scanner( System.in );
 
    System.out.print("Enter the cost per kw-hr in cents: ");
    cost = scan.nextDouble();

    System.out.print("Enter the number of kw-hrs used per year: ");
    hours = scan.nextDouble();

    System.out.printf("Annual Cost: $" + "%.2f", cost * hours/100.);
  }

}
