package chapters.chapter13.Exercise03;

import weeks.week_15.Number;

import java.util.ArrayList;

public class SortArrayList {
    public static void main(String[] args) {

        Number num = new Number(3.2);
        Number num1 = new Number(1);
        Number num2 = new Number(6.250);
        Number num3 = new Number(4.5);
        Number num4 = new Number(9);

        ArrayList<Number> list = new ArrayList<>();
        list.add(num);
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);

        System.out.println("Before sorting : ");
        displayArr(list);

        sort(list);

        System.out.println("After sorting : ");
        displayArr(list);

    }

    public static void displayArr(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getValue() + " ");
        }
        System.out.println();
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Number min = list.get(i);
            int minIndex = i ;
            for (int j = i + 1 ; j < list.size() ; j++) {
                if (min.getValue() > list.get(j).getValue()){
                    min = list.get(j) ;
                    minIndex = j ;
                }
            }
            if (minIndex != i){
                list.set(minIndex,list.get(i)) ;
                list.set(i, min);
            }
        }

    }


}
