package HomeWork01_11;

import java.util.Scanner;

public class HW01_11 {
	// HW_01.11
	public static void main(String[] args) {
		// Draw rhombus
		int iD = 0;                               // >0 - skip input for debugging, else - manual input R-dimention
		String cP = " ";
		Scanner scan = new Scanner(System.in);
		if (iD <= 0) {
			System.out.println("Input rombus dimention:");
			iD = scan.nextInt();
		}

		for (int ln = 1; ln < iD+1; ln++) {
			System.out.println();
// -- 1.1
			for (int pos = iD; pos > 0; pos--) {
				if (pos > ln) {                    // for digits printing...
				   System.out.print(cP);           // print special symbol for debuging
				} else {
					System.out.print(ln-pos+1);    // line - position + 1
				}
			}
// -- 1.2
            for (int pos = 2; pos <= iD; pos++) {
                if (pos <= ln) {
                    System.out.print(ln-pos+1);
                } else {
                    System.out.print(cP);
                }
            }
	}
        for (int ln = iD-1; ln >= 1; ln--) {
            System.out.println();
// -- 2.1
            for (int pos = iD; pos > 0; pos--) {
                if (pos > ln) {
                    System.out.print(cP);
                } else {
                    System.out.print(ln-pos+1);
                }
            }
// -- 2.2
            for (int pos = 2; pos <= iD; pos++) {
                if (pos <= ln) {
                    System.out.print(ln-pos+1);
                } else {
                    System.out.print(cP);
                }
            }
        }

  } // main
} // HW01.11
