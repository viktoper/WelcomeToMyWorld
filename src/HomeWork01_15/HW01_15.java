package HomeWork01_15;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class HW01_15 {
    // HW_01.12 - 01.14
    public static void main(String[] args) {
        // palindrome
        Scanner scan = new Scanner(System.in);
        int iD = 0;                               // >0 - skip input for debugging, else - manual input
        if (iD <= 0) {
            System.out.println("Input dimention:");
            iD = scan.nextInt();
        }

        String sMinNum = "1", sMaxNum = "9";
        for (int i = 1; i < iD; i++) {
            sMinNum = sMinNum.concat("0");
            sMaxNum = sMaxNum.concat("9");
        }
        long iMin = Long.valueOf(sMinNum) * Long.valueOf(sMinNum);
        long iMax = Long.valueOf(sMaxNum) * Long.valueOf(sMaxNum);
        long iMaxPalindrome = 0;

        Instant start_tm, end_tm;  // elapsed time measuring

        System.out.println("Check all numbers from " + iMin + " to " + iMax + " for maximum palindrome:");

        start_tm = Instant.now();
        for (long n = iMax; n > iMin; n--) {
            if (CheckNumber.isPalindrome(n)) {
                iMaxPalindrome = n;
                break;
            }
        }
        end_tm = Instant.now();
        System.out.println("Elapsed time is " + Duration.between(start_tm, end_tm));
        System.out.println("Max palindrome is " + iMaxPalindrome);
    }
}
