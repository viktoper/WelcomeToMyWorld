package HomeWork01_03;

import java.util.Scanner;
import java.math.*;

public class HW01_03 {
    // HW_01.3
    public static void main(String[] args) {
        // the power of ...
        Scanner scan = new Scanner(System.in);

        System.out.println("Input value for power:");
        double dwValue = scan.nextDouble();
        double dwResult = dwValue * dwValue;
        System.out.println("Result of " + dwValue + "*" + dwValue + " is " + dwResult);
    }
}
