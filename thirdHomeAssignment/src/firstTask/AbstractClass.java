package firstTask;

import java.util.ArrayList;

public abstract class AbstractClass {
    private int numOfMonth;

    AbstractClass(int numOfMonth) {
        this.numOfMonth = numOfMonth;
    }

    AbstractClass() {

    }

    abstract void printPhrase();

    enum Months {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    }

    String getMonthNameByNum(int numOfMonth) {
        String monthName;
        try {
            Months[] a = Months.values();
            monthName = a[numOfMonth - 1].name();
        } catch (Exception e) {
            return "It was entered number out of range 1-12";
        }
        return monthName;
    }
}
