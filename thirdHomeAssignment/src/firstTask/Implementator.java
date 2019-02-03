package firstTask;

public class Implementator implements Util {
    @Override
    public void printPhrase() {
        System.out.println("Phrase from Implementator class");
    }

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

    @Override
    public int returnDayNumByName(String name) {
        int dayNumber;
        switch (name.toLowerCase()) {
            case "monday":
                dayNumber = 1;
                break;
            case "tuesday":
                dayNumber = 2;
                break;
            case "wednesday":
                dayNumber = 3;
                break;
            case "thursday":
                dayNumber = 4;
                break;
            case "friday":
                dayNumber = 5;
                break;
            case "saturday":
                dayNumber = 6;
                break;
            case "sunday":
                dayNumber = 7;
                break;
            default:
                System.out.println("You should enter name of the day of week, e.g Monday/Tuesday/...");
                return 0;
        }
        return dayNumber;
    }
}
