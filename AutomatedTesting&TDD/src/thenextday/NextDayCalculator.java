package thenextday;

import java.util.Scanner;

public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year) {
        int daysInMonth;
        switch (month) {
            case 2:
                if (isleapYear(year))
                    daysInMonth = 29;
                else daysInMonth = 28;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                throw new UnsupportedOperationException();
        }

        day++;
        if (day > daysInMonth) {
            day = 1;
            month += 1;
        }
        if (month > 12){
            month = 1;
            year++;
        }
        return day+"/" +month +"/" +year;
    }

    private static boolean isleapYear( int year){
        boolean isYearDivideBy400 = year % 400 == 0;
        boolean isYearDivideBy100 = year % 100 == 0;
        boolean isYearDivideBy4 = year % 4 == 0;
        if (isYearDivideBy400) return true;
        else if (isYearDivideBy100) return false;
        else return isYearDivideBy4;
    }
}