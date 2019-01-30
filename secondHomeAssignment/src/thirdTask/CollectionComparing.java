package thirdTask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class CollectionComparing {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("pineapple");
        set.add("watermelon");
        set.add("apple");
        set.add("pear");
        set.add("quince");
        set.add("lemon");
        set.add("kiwi");
        System.out.println("***Initial set***");
        for (String s : set) {
            System.out.println(s);
        }
        LinkedList<String> list = new LinkedList<>();
        list.add("plum");
        list.add("nut");
        list.add("apple");
        list.add("grape");
        list.add("peach");
        list.add("pear");
        list.add("cherry");
        list.add("orange");
        list.add("watermelon");
        list.add("apricot");
        list.add("pineapple");
        System.out.println("***Initial list***");
        for (String s : list) {
            System.out.println(s);
        }
//        List<String> resultList = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            if (set.contains(list.get(i))) {
//                resultList.add(list.get(i));
//            }
//        }
        list.retainAll(set);
        System.out.println("***Result list***");
        for (String x : list) {
            System.out.println(x);
        }

    }
}
