package pack1;

import java.util.*;
import java.math.*;

public class LoginSimulator {
	public static void main(String[] args) {

		String username="", password="";
		int priority;
		Scanner scan = new Scanner(System.in);
		while ((!username.equals("quit")) && (!password.equals("exit"))) {
			System.out.println("Enter a username: ");
			username = scan.next();

			System.out.println("Enter a password: ");
			password = scan.next();

			if((username.equals("gates")) && (password.equals("monopoly")))
				System.out.println("You have logged on with priority 1");
			else if((username.equals("joy")) && (password.equals("sun")))
				System.out.println("You have logged on with priority 4");
			else if((username.equals("jobs")) && (password.equals("apple")))
				System.out.println("You have logged on with priority 3");
			else if((username.equals("root")) && (password.equals("secret")))
				System.out.println("You have logged on with priority 5");
			else if((username.equals("quit")) && (password.equals("exit")))
				System.out.println("System shutting down.  \nBye.");
			else 
				System.out.println("Login Failed.");
				
		}
//		System.out.println("System shutting down.  \nBye.");
		

	}
}
