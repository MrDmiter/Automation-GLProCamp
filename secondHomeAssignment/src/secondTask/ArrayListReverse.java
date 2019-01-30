package secondTask;

import java.util.*;


public class ArrayListReverse {


    public static void main(String[] args) {
        List<String> list= new ArrayList<>(Arrays.asList("6","a","3","z"));
        System.out.println("List with initial order: " + list);
        Collections.reverse(list);
        System.err.println("List with reverse order: " + list);
    }


}
