package com.firstTask;

public class EnumClass {
    /**
     * Initialization of the enum
     */
    enum DaysOfWeek {
        MONDAY("Monday", 1), TUESDAY("Tuesday", 2), WEDNESDAY("Wednesday", 3), THURSDAY("Thursday", 4),
        FRIDAY("Friday", 5), SATURDAY("Saturday", 6), SUNDAY("Sunday", 7);
        private String name;
        private int dayNumber;

        /**
         * Constructor of the enum
         *
         * @param name
         * @param dayNumber
         */
        DaysOfWeek(String name, int dayNumber) {
            this.name = name;
            this.dayNumber = dayNumber;
        }

        //Getter
        public String getName() {
            return name;
        }

        //Setter
        public int getDayNumber() {
            return dayNumber;
        }
    }
}
