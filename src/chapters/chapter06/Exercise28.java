package chapters.chapter06;

public class Exercise28 {

    public static void main(String[] args) {
        System.out.printf("%-30s%s\n", "p","2^p-1");
        System.out.println("><><>><><><><><><><><><><><><><><><><>");
        int p = 2;
        int max = 31;
        while (p <= max) {
            if (isPrime(p)) {
                System.out.printf("%-30s%s\n",p,Mersenne(p));
            }
            p++;
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if(number % divisor == 0){
                return false ;
            }
        }return true ;
    }public static int Mersenne(int number){
        return (int)Math.pow(2,number) - 1 ;
    }

}
