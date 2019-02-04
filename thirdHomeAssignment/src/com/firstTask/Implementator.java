package com.firstTask;

public class Implementator implements Util {

    /**
     * Realization of the methods defined in the interface that we must override
     */
    @Override
    public void printPhrase() {
        System.out.println("Phrase from Implementator class");
    }

    /**
     * Methods that we must override
     *
     * @param returnDayNameByNum
     * @return name
     */
    @Override
    public String returnDayNameByNum(int returnDayNameByNum) {
        String name;
        switch (returnDayNameByNum) {
            case 1:
                name = EnumClass.DaysOfWeek.MONDAY.getName();
                break;
            case 2:
                name = EnumClass.DaysOfWeek.TUESDAY.getName();
                break;
            case 3:
                name = EnumClass.DaysOfWeek.WEDNESDAY.getName();
                break;
            case 4:
                name = EnumClass.DaysOfWeek.THURSDAY.getName();
                break;
            case 5:
                name = EnumClass.DaysOfWeek.FRIDAY.getName();
                break;
            case 6:
                name = EnumClass.DaysOfWeek.SATURDAY.getName();
                break;
            case 7:
                name = EnumClass.DaysOfWeek.SUNDAY.getName();
                break;
            default:
                return "You should enter number 1-7";
        }
        return name;
    }

    /**
     * Methods that we must override
     *
     * @param name
     * @return dayNumber
     */
    @Override
    public int returnDayNumByName(String name) {
        int dayNumber;
        switch (name.toLowerCase()) {
            case "monday":
                dayNumber = EnumClass.DaysOfWeek.MONDAY.getDayNumber();
                break;
            case "tuesday":
                dayNumber = EnumClass.DaysOfWeek.TUESDAY.getDayNumber();
                break;
            case "wednesday":
                dayNumber = EnumClass.DaysOfWeek.WEDNESDAY.getDayNumber();
                break;
            case "thursday":
                dayNumber = EnumClass.DaysOfWeek.THURSDAY.getDayNumber();
                break;
            case "friday":
                dayNumber = EnumClass.DaysOfWeek.FRIDAY.getDayNumber();
                break;
            case "saturday":
                dayNumber = EnumClass.DaysOfWeek.SATURDAY.getDayNumber();
                break;
            case "sunday":
                dayNumber = EnumClass.DaysOfWeek.SUNDAY.getDayNumber();
                break;
            default:
                System.out.println("You should enter name of the day of week, e.g Monday/Tuesday/...");
                return 0;
        }
        return dayNumber;
    }
}
