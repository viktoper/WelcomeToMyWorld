package HomeWork01_10;

import java.util.Scanner;
import java.math.*;

public class HW01_10 {
	// HW_01.10
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input value:");
		double dwD = scan.nextDouble();
		System.out.println("Round value: " + (long)Math.floor(dwD + 0.5));
	}
}
