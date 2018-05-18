package HomeWork01_18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.math.*;
import java.util.Arrays;

public class HW01_18 {
    public static void main(String[] args) {
        // manage array's II
        Scanner scan = new Scanner(System.in).useLocale(Locale.getDefault());

        // >0 - skip input for debugging, else - manual input
        int iX = 3;
        int iY = 3;

        System.out.println("18) Input array dimention:");
        System.out.println("Nuber of columns:");
        if (iX <= 0) {
            iX = scan.nextInt();
        } else {
            System.out.println(iX);
        }

        System.out.println("Nuber of rows:");
        if (iY <= 0) {
            iY = scan.nextInt();
        } else {
            System.out.println(iY);
        }

        double[][] myArr = new double[iY][iX];
        String sD, sIntegetPart, sFractionalPart;
        // fill array
        System.out.println("Input array:");
        for (int y = 0; y < iY; y++) {
            for (int x = 0; x < iX; x++) {
//                myArr[y][x] = 1.0 + (Math.random() * (Math.random() * 999.0) );   // <---
//                myArr[y][x] = scan.nextDouble();                                //   change this for manual input
                System.out.print("[" + y + "," + x + "]=");
                sD = scan.next();
                if (sD.indexOf('.') < 0) {
                    System.out.println("Warning: decimal separator '.' not found. Try to check other...");
                    // may be "," ?
                    if (sD.indexOf(',') > 0) {
                        System.out.println("Warning: ',' as decimal separator found. Try to change...");
                        sIntegetPart = sD.substring(0, sD.indexOf(','));
                        sFractionalPart = sD.substring(sD.indexOf(',') + 1);
                        sD = sIntegetPart + "." + sFractionalPart;
                    } else {
                        // integer ?
                        System.out.println("Warning: any decimal separator not found. Try as integer...");
                        sD = sD + ".0";
                    }
                }
                sIntegetPart = sD.substring(0, sD.indexOf('.'));
                if (sIntegetPart.length() > 3) {
                    System.out.println("Error: Integer Part of " + sD + " more than 3 - Hände Hoch !");
                    return;
                }
                sFractionalPart = sD.substring(sD.indexOf('.') + 1);
                if (sFractionalPart.length() > 3) {
                    System.out.println("Warning: Fractional Part of " + sD + " more than 3 - will be cut !");
                }
                myArr[y][x] = Double.valueOf(sD);
            }
        }

        System.out.println("17.1) Initial array:");
        for (int y = 0; y < iY; y++) {
            System.out.print("|");
            for (int x = 0; x < iX; x++) {
                System.out.printf(" %f", myArr[y][x]);
            }
            System.out.println("|");
        }

        System.out.println("17.2) After round and format:");
        for (int y = 0; y < iY; y++) {
            System.out.print("|");
            for (int x = 0; x < iX; x++) {
                System.out.printf("%-7.2f", MyRound.RoundDouble(myArr[y][x]));
            }
            System.out.println("|");
        }

// ---------------------- my internal test
        //String sD = scan.next();
/*
        sD = "123.45";
        double dD;

        System.out.println("String = " + sD);
        System.out.println("Position of Comma = " + sD.indexOf('.'));
        System.out.println("Substr before '.' = " + sD.substring(0,sD.indexOf('.')));
        System.out.println("Substr after '.' = " + sD.substring(sD.indexOf('.')+1));

        dD = Double.valueOf(sD);

        System.out.printf("\"Number = %-7.2f",dD);

        double dD1 = 123.4567;
        double dD2 = MyRound.RoundDouble(dD1);
        System.out.printf("\nNumber D1 = %f",dD1);
        System.out.printf("\nNumber D2 = %f",dD2);
        System.out.println();

        double d = 1.23456;
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println(f.format(d));
        System.out.println(f.format(dD1));
*/
    }
}

