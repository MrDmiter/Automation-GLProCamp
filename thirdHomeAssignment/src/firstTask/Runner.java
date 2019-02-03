package firstTask;

public class Runner {
    public static void main(String[] args) {
        Implementator implementator = new Implementator();
        InheritedFromAbstractClass abstractor = new InheritedFromAbstractClass();
        System.out.println(implementator.returnDayNameByNum(3));
        System.out.println(implementator.returnDayNumByName("FRiDaY"));
        System.out.println(abstractor.getMonthNameByNum(7));
        implementator.printPhrase();
        abstractor.printPhrase();
    }
}

