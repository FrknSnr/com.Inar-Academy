package chapters.chapter06;

public class Exercise01 {

    public static void main(String[] args) {
        for (int i = 1, l = 1; i <= 100; i++, l++) {
            if (l % 10 == 0)
                System.out.printf("%-5d\n", pentagonal(i));
            else
            System.out.printf("%-5d", pentagonal(i));
        }
    }
    public static int pentagonal(int n){
        int pentagonal = n * ( 3 * n - 1 ) / 2 ;
        return pentagonal ;
    }
}
