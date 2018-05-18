package HomeWork01_05;

import java.util.Scanner;
import java.math.*;

public class HW01_05 {
	// HW_01.5
	public static void main(String[] args) {
		// input x and print result x - 5%
		Scanner scan = new Scanner(System.in);
		  
		System.out.println("Input value for X:");
		double dwX = scan.nextDouble();
		double dwResult = dwX - 5*(dwX/100);
		System.out.println("Result of " + dwX + "-5%" + " is " + dwResult);
	}
}
