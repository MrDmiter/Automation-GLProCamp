package com.firstTask;

public class Runner {
    public static void main(String[] args) {
        //Creation of the Implementator object
        Implementator implementator = new Implementator();
        //Creation of the object of the class which inherits abstract class
        InheritedFromAbstractClass abstractor = new InheritedFromAbstractClass(2);
        //Usage of the returnDayNameByNum method and print result
        System.out.println(implementator.returnDayNameByNum(3));
        //Usage of the returnDayNumByName method and print result
        System.out.println(implementator.returnDayNumByName("FRiDaY"));
        //Usage of the getMonthNameByNum and print result
        System.out.println(abstractor.getMonthNameByNum(7));
        //Usage of the printPhrase method from implementator class
        implementator.printPhrase();
        //Usage of the printPhrase method from abstractor class
        abstractor.printPhrase();
    }
}

