package LastPart.Map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(10, 25);
        m.put(1, 40);
        m.put(2, 50);
        m.put(1, 30);
        m.put(3, 60);

        Map<String, String> map = new HashMap<>();
        map.put("a", "furkan");
        map.put("b", "fatih");
        System.out.println(map.get("a").length());
        String s = "map";
        System.out.println(m.size());
        System.out.println("''''''''''''''''''''''''''''''''''''''''''''");

        for (int value : m.values()) {
            System.out.println(value);
        }
        System.out.println("--------------------");
    }
}
