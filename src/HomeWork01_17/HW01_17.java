package HomeWork01_17;

import java.util.Scanner;
import java.math.*;
import java.util.Arrays;

public class HW01_17 {
    public static void main(String[] args) {
        // manage array's II
        Scanner scan = new Scanner(System.in);
        int iD = 20;                               // >0 - skip input for debugging, else - manual input
        if (iD <= 0) {
            System.out.println("17) Input array dimention:");
            iD = scan.nextInt();
        }

        int[] myArr = new int[iD];
        // fill array
        for (int i = 0; i < iD; i++) {
            myArr[i] = 1 + (int) (Math.random() * 10);
        }

        System.out.println("16.1) Initial array (for):");
        System.out.print("[");
        for (int i = 0; i < myArr.length; i++) {
            if (i < myArr.length - 1) {
                System.out.print(myArr[i] + ", ");
            } else {
                System.out.print(myArr[i]);
            }
        }
        System.out.print("]");
        System.out.println();

        System.out.println("16.1a) Initial array (short for):");
        System.out.print("[");
        for (int myA : myArr) {
                System.out.print(myA + " ");
        }
        System.out.print("]");
        System.out.println();

        System.out.println("16.2) Initial array (while):");
        System.out.print("[");
        int k = 0;
        while (k < myArr.length) {
            if (k < myArr.length - 1) {
                System.out.print(myArr[k] + ", ");
            } else {
                System.out.print(myArr[k]);
            }
            k++;
        }
        System.out.print("]");
        System.out.println();

        System.out.println("16.3) Initial array (Arrays):");
        System.out.print(Arrays.toString(myArr));
        System.out.println();
    }
}