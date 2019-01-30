package firstTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("Test", 7);
        map.put("Class", 4.5);
        map.put("Cat", true);
        map.put("Dog", null);
        map.put("Bird", "Cat");
        map.put("Something", new Long(83));
        map.put("Mail", new Character('8'));
        map.put("Tab", '2');
        map.put("Browser", 22222222222L);
        map.put("IDE", (double) 489);
//        for (Map.Entry entry :map.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + " | " + "Value: " + entry.getValue());
//        }
//
    map.forEach((k,v)-> System.out.println("Key: " + k + " | " + "Value: " + v));
    }
}
