package chapters.chapter11.Exercise14;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter five integers for list1 : ");
        ArrayList<Integer> list1 = getFromUser();
        System.out.println("Enter five integers for list2 : ");
        ArrayList<Integer> list2 = getFromUser();
        ArrayList<Integer> united = union(list1, list2);
        display(united);

    }public static void display(ArrayList<Integer> united){
        for (int i = 0; i < united.size(); i++) {
            System.out.print(united.get(i)+" ");
        }
        System.out.println(united);
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> united = new ArrayList<>();
        for (int i = 0; i < list1.size() ; i++) {
            united.add(list1.get(i));
        }
        for (int i = 0; i < list2.size() ; i++) {
            united.add(list2.get(i));
        }
        return united;
    }


    public static ArrayList<Integer> getFromUser() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        return list;
    }
}
