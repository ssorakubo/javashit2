package pack1;

import java.util.*;
import java.math.*;

public class Stars {
	public static void main(String[] args) {

		int i, index;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter initial number of stars: ");
		i = scan.nextInt();
		index = i;
		int j, k;

		for (k = 1; k <= i; k++) {
			for (j = 1; j <= index; j++) {
				System.out.print("*");
			}
			System.out.println();
			index--;

		}
	}

}
