package firstTask;

public class Casting {
    public static void main(String[] args) {
        int varInt=10;
        double varDouble;
        String varString;
        varString = String.valueOf(varInt);
        System.out.println(varString);
        varDouble = Double.valueOf(varString);
        System.out.println(varDouble);
        varInt=(int) varDouble;
        System.out.println(varInt);

    }
}
