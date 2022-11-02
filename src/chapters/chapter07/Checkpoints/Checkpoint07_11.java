package chapters.chapter07.Checkpoints;

public class Checkpoint07_11 {

    public static void main(String[] args) {
        int list[] = {1, 2, 3, 4, 5, 6};
        for (int i = 1; i < list.length; i++) {
            list[i] = list[i - 1];
            System.out.print(list[i]);
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "");
        }
    }
}
