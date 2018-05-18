package HomeWork01_02;

import java.util.Scanner;
import java.math.*;

public class HW01_02 {
    // HW_01.2
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input low value for range:");
        int lowRange = scan.nextInt();
        System.out.println("Input high value for range:");
        int highRange = scan.nextInt();

        int iRange = highRange-lowRange;
        if (iRange > 0) {
            int[] myList = new int[iRange];
            int iMax = lowRange;
            int iMin = lowRange+highRange;
            int iSum = 0;
            for (int i = 0; i < iRange; i++ ) {
                myList[i] = lowRange + (int)(Math.random()*highRange);
                if (iMax < myList[i]) {
                    iMax = myList[i];
                }
                if (iMin > myList[i]) {
                    iMin = myList[i];
                }
                iSum = iSum + myList[i];
                System.out.println("m["+i+"]="+myList[i]);
            }
            System.out.println("min="+iMin);
            System.out.println("max="+iMax);
            System.out.println("sum="+iSum);
            System.out.println("avg="+((double)iSum/iRange));
        } else {
            System.out.println("ERR: High value must be bigger than Low value !");
        }
    }
}
