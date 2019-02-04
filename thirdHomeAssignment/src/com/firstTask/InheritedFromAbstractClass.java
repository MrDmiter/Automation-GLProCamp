package com.firstTask;

public class InheritedFromAbstractClass extends AbstractClass {
    /**
     * Constructor that matches constructor from ancestor class
     *
     * @param numOfMonth
     */
    InheritedFromAbstractClass(int numOfMonth) {
        super(numOfMonth);
    }

    /**
     * Overrride of the printPhrase method from ancestor abstract class
     */
    @Override
    void printPhrase() {
        System.out.println("Phrase from class which inherits abstract");
    }

}
