package chapters.chapter10.Exercise03;

public class MyInteger {

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean isOdd() {
        if (value % 2 != 0) {
            return true;
        }
        return false;
    }

    public boolean isPrime() {
        for (int i = 0 ; i < value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOdd(int n) {
        if (n % 2 != 0) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger n) {
        return n.isEven();
    }

    public static boolean isOdd(MyInteger n) {
        return n.isOdd();
    }

    public static boolean isPrime(MyInteger n) {
        return n.isPrime();
    }
    public boolean equals(int n){
        return n == getValue();
    }
    public boolean equals(MyInteger n){
        return equals(n.getValue());
    }
    public static int parseInt(char[] arr) {
        return parseInt(new String(arr));

        /* int n = 0;
        int v;
        for (int i = arr.length - 1, p = 0; i <= 0; i--, p++) {
            v = (int) (arr[i] - '0');
            n += Math.pow(10, p) * v;
        }
        return n;*/
    }
    public static int parseInt(String s){
        return Integer.parseInt(s);
    }
}


