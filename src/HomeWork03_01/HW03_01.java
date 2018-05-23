package HomeWork03_01;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class HW03_01 {
    public static void main(String[] args) {
        // OOP
        // initial date - constructor by default
        Date myD = new Date();
        System.out.println("1) Current date is " + myD.getDay() + "." + + myD.getMonth() + "." + myD.getYear());

        // date - initial by values
        Date myD1 = new Date(10,10,1980);
        System.out.println("2) Another instance date is " + myD1.getDay() + "." + + myD1.getMonth() + "." + myD1.getYear());

        // date - initial by copy another date
        Date myD2 = new Date( myD );
        System.out.println("3) Another instance date is " + myD2.getDay() + "." + + myD2.getMonth() + "." + myD2.getYear());

        System.out.println("4) Get Day = " + myD1.getDay());
        System.out.println("   Get Month = " + myD1.getMonth());
        System.out.println("   Get Year = " + myD1.getYear());

        System.out.println("5) Day of Week for "+ myD2.getDay() + "." + + myD2.getMonth() + "." + myD2.getYear() +" is "+ myD1.getDayOfWeek( myD2 ));

        Date myD3 = new Date(30,1,2018);
        System.out.println("6) Week of "+ myD3.getDay() + "." + + myD3.getMonth() + "." + myD3.getYear() +" is " + myD3.getWeekOfYear());




//------------------
        System.out.println();
        System.out.println("------------------ test ------------------");
        LocalDate toDay = LocalDate.of(2018, 5, 22);
        System.out.println("today = " + toDay.toString());
        LocalDate firstDay = LocalDate.of(2018, 1,1);
        System.out.println("first day of year = " + firstDay.toString());

        int p = Period.between(firstDay, toDay).getDays();
        System.out.println("p = " + p);
// right way!
        long days = ChronoUnit.WEEKS.between(firstDay, toDay);
        System.out.println("p = " + days);

    }
}
