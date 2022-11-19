package chapters.chapter11.Exercise07;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        java.util.Collections.shuffle(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }


    }
}
