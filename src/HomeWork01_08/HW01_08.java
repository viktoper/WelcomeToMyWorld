package HomeWork01_08;

import java.util.Scanner;

public class HW01_08 {
	// HW_01.8
	// HW_01.9
	public static void main(String[] args) {
		// sum of digits
		Scanner scan = new Scanner(System.in);
		  
		System.out.println("Input value for Q:");
		int iQ = scan.nextInt();
		String sQ = String.valueOf(iQ);
		String sResult = "";
		int iSum = 0;
		
		for(int i=0; i < sQ.length(); i++) {
			if (i < sQ.length()-1) {
				sResult = sResult.concat(sQ.substring(i, i+1)+"+");
			} else {
				sResult = sResult.concat(sQ.substring(i, i+1));
			}
			iSum = iSum + Integer.valueOf(sQ.substring(i, i+1)).intValue();
		}
		System.out.print("Digits: " + sResult);
		System.out.println();
		System.out.println("Sum of digits is " + iSum);
	}
}
