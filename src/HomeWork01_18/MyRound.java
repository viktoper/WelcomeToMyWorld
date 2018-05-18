package HomeWork01_18;

import java.text.DecimalFormat;

public class MyRound {
    public static double RoundDouble(double number) {

        double roundOff = Math.round(number*100)/100.00;
//        DecimalFormat df = new DecimalFormat("###.00");
//        double roundOff = Double.valueOf(df.format(number));

        return roundOff;
    }
}


