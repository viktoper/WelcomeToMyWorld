package HomeWork01_12;

import java.util.Scanner;

public class HW01_12 {
    // HW_01.12 - 01.14
    public static void main(String[] args) {
        // Draw triangle
        int iD = 6;                               // >0 - skip input for debugging, else - manual input R-dimention
        String cP = " ";
        Scanner scan = new Scanner(System.in);
        if (iD <= 0) {
            System.out.println("Input dimention:");
            iD = scan.nextInt();
        }

        System.out.print("Triangle for 1.12:");
        for (int ln = 1; ln < iD + 1; ln++) {
            System.out.println();
// -- 1.12
            for (int pos = iD; pos > 0; pos--) {
                if (ln - iD + pos - 1 < 0) {
                    System.out.print(cP);     // print SPACE
                } else {
                    System.out.print("*");    // print *
                }
            }
        }
        System.out.println();

        System.out.print("Triangle for 1.13:");
        for (int ln = 1; ln < iD + 1; ln++) {
            System.out.println();
// -- 1.13
            for (int pos = iD; pos > 0; pos--) {
                if (pos > ln) {
                    System.out.print(cP);      // print SPACE
                } else {
                    System.out.print("*");    // print *
                }
            }
        }
        System.out.println();

        System.out.print("Square for 1.14:");
// -- 1.14
        for (int ln = 1; ln < iD+1; ln++) {
            System.out.println();
            for (int pos = 1; pos < iD+1; pos++) {
                if ((pos == 1 || pos == iD) || (ln == 1 || ln == iD)) {
                    System.out.print("*");    // print *
                } else {
                    System.out.print(cP);      // print SPACE
                }
            }
        }
    }
}
