package LastPart.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise11_14 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = createArrayList();
        System.out.println(Arrays.toString(list1.toArray()));
        ArrayList<Integer> list2 = createArrayList();
        System.out.println(Arrays.toString(list2.toArray()));
        Set<Integer> united = union(list1, list2);
        System.out.println("United array : " + Arrays.toString(united.toArray()));

    }

    public static Set<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set<Integer> united = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            united.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            united.add(list2.get(i));
        }
        return united;
    }

    public static ArrayList<Integer> createArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        int i = (int) (Math.random() * 10);
        for (int j = 0; j < i; j++) {
            list.add((int) (Math.random() * 10));
        }
        return list;
    }
}
