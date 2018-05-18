package HomeWork01_07;

import java.util.Scanner;
import java.math.*;

public class HW01_07 {
	// HW_01.7
	public static void main(String[] args) {
		// remainder of division and integer 
		Scanner scan = new Scanner(System.in);
		  
		System.out.println("Input value for Q:");
		int iQ = scan.nextInt();
		System.out.println("Input value for W:");
		int iW = scan.nextInt();
		System.out.println("Result of " + iQ + "/" + iW + " = " + iQ/iW + " and " + iQ%iW + " in the remainder");
	}
}
