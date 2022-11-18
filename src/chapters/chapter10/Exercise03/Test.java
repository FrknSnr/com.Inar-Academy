package chapters.chapter10.Exercise03;

public class Test {
    public static void main(String[] args) {

        MyInteger myInteger = new MyInteger(4);
        MyInteger myInteger1 = new MyInteger(7);
        System.out.println(MyInteger.isEven(myInteger));
        System.out.println(myInteger.isEven(6));
        System.out.println(MyInteger.isEven(7));
        System.out.println(myInteger.isEven());
        System.out.println(myInteger.equals(9));
        System.out.println(myInteger.equals(myInteger1));
        System.out.println(MyInteger.parseInt(new char[]{'3','2','3'}));
        System.out.println(MyInteger.parseInt("123456"));
        System.out.println(myInteger.isPrime(5));
    }
}
