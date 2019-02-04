package com.firstTask;


public abstract class AbstractClass {


    // class variable
    private int numOfMonth;

    /**
     * Constructor of the class
     * @param numOfMonth
     */
    AbstractClass(int numOfMonth) {
        this.numOfMonth = numOfMonth;
    }

    /**
     * Abstract method
     */
    abstract void printPhrase();

    /**
     * Enum, list of the months
     */
    enum Months {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    }

    /**
     * Non-abstract method which return name of the month by its position within a year
     * @param numOfMonth
     * @return monthName
     */
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
