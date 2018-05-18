package HomeWork01_06;

import java.util.Scanner;
import java.math.*;

public class HW01_06 {
	// HW_01.6
	public static void main(String[] args) {
		// Moon weight
		Scanner scan = new Scanner(System.in);
		  
		System.out.println("Input your body weight (Kg):");
		double dwMass = scan.nextDouble();
		double dwWeight = dwMass*1.622; // Moon g = 1.622 (1/6 of Earth) 
		System.out.printf("Your weight on the Moon will be %3.2f N", dwWeight);
	}
}
