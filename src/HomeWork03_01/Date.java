package HomeWork03_01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Date {
    private int theDay;
    private int theMonth;
    private int theYear;

    public Date() {
        theDay = 1;
        theMonth = 1;
        theYear = 1970;
    };

    public Date(int iDay, int iMonth, int iYear) {
        theDay = iDay;
        theMonth = iMonth;
        theYear = iYear;
    }

    public Date(Date date) {
        theDay = date.theDay;
        theMonth = date.theMonth;
        theYear = date.theYear;
    }

    public void setDay(int iDay) {
        if (iDay > 0 || iDay < 32) {
            theDay = iDay;
        } else {
            theDay = 1;
        }
    }

    public void setMonth(int iMonth) {
        if (iMonth > 0 || iMonth < 13) {
            theMonth = iMonth;
        } else {
            theMonth = 1;
        }
    }

    public void setYear(int iYear) {
        if (iYear > 1969) {
            theYear = iYear;
        } else {
            theYear = 1970;
        }
    }

    public void setDate(Date date) {
        theDay = date.theDay;
        theMonth = date.theMonth;
        theYear = date.theYear;
    }

    public int getDay() {
        return theDay;
    }

    public int getMonth() {
        return theMonth;
    }

    public int getYear() {
        return theYear;
    }

    public String getDayOfWeek(Date date) {

        LocalDate dt = LocalDate.of(date.theYear, date.theMonth, date.theDay);
        DayOfWeek  dw = dt.getDayOfWeek();
        int iDayOfWeek = dw.getValue();

        String sRez = "";
        switch (iDayOfWeek) {
            case 1:  sRez = "пн"; break;
            case 2:  sRez = "вт"; break;
            case 3:  sRez = "ср"; break;
            case 4:  sRez = "чт"; break;
            case 5:  sRez = "пт"; break;
            case 6:  sRez = "сб"; break;
            case 7:  sRez = "вс"; break;
            default: sRez = "??"; break;
        }
        return sRez;
    };

    public int getWeekOfYear() {

        LocalDate today = LocalDate.of(this.theYear, this.theMonth, this.theDay);
        LocalDate firstDay = LocalDate.of(this.theYear, 1,1);

        long weeks = ChronoUnit.WEEKS.between(firstDay, today);

        return (int)weeks+1;
    };
}
