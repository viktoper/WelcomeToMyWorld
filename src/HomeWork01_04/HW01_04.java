package HomeWork01_04;

import java.util.Scanner;
import java.math.*;

public class HW01_04 {
	// HW_01.4
	public static void main(String[] args) {
		// variables changing...
		int iFirstValue = 11;
		int iSecondValue = 22;
		
		System.out.println("Initial state:");
		System.out.println("   First Value = " + iFirstValue);
		System.out.println("   Second Value = " + iSecondValue);

		System.out.println("a) interchange with temporary variable:");
		int iTemp = iFirstValue;
		iFirstValue = iSecondValue;
	    iSecondValue = iTemp;
		System.out.println("   First Value = " + iFirstValue);
		System.out.println("   Second Value = " + iSecondValue);
		
		System.out.println("b) interchange without temporary variable:");
		iFirstValue = iFirstValue + iSecondValue;
		iSecondValue = iFirstValue - iSecondValue;
		iFirstValue = iFirstValue - iSecondValue;
		System.out.println("   First Value = " + iFirstValue);
		System.out.println("   Second Value = " + iSecondValue);
	}
}
