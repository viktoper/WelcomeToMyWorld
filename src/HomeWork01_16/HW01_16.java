package HomeWork01_16;

import java.util.Scanner;
import java.math.*;
import java.util.Arrays;

public class HW01_16 {
    // HW_01.16 - 01.18
    public static void main(String[] args) {
        // manage array's
        Scanner scan = new Scanner(System.in);
        int iD = 20;                               // >0 - skip input for debugging, else - manual input
        if (iD <= 0) {
            System.out.println("16.1) Input array dimention:");
            iD = scan.nextInt();
        }

        int[] myArr = new int[iD];
        int iTmp;

        // fill array
        for (int i = 0; i < iD; i++) {
            myArr[i] = (int)(Math.random()*100);
        }

        System.out.println("16.1) Initial array:");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
        System.out.println();

        // reverse array
        for (int i = 0; i < myArr.length / 2; i++) {
            iTmp = myArr[i];
            myArr[i] = myArr[myArr.length-i-1];
            myArr[myArr.length-i-1] = iTmp;
        }

        System.out.println("16.2) Reverse array:");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
        System.out.println();

        // change odd and even elements
        for (int i = 0; i < myArr.length / 2; i+=2) {
            iTmp = myArr[i];
            myArr[i] = myArr[i+1];
            myArr[i+1] = iTmp;
        }

        System.out.println("16.2) Change odd and even elements:");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
        System.out.println();

        Arrays.sort(myArr);

        System.out.println("16.4) Sorted array:");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
    }
}
