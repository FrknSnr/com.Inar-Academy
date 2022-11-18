package chapters;

import javax.jws.soap.SOAPBinding;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("10"));
        System.out.println(Integer.parseInt("10", 10));
        System.out.println(Integer.parseInt("10", 16));
        System.out.println(Integer.parseInt("11"));
        System.out.println(Integer.parseInt("11", 10));
        System.out.println(Integer.parseInt("11", 16));


        Integer intObject = 2;
        System.out.println(intObject);

        Integer[] intArray = {1, 2, 3};
        System.out.println(intArray[0] + intArray[1] + intArray[2]);

        int x = new Integer(3) + new Integer(4);
        System.out.println(x);

        Double v = 3.5;
        System.out.println(v.intValue());
        System.out.println(v.compareTo(4.5));

        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("2");
        BigInteger c = a.multiply(b); // 9223372036854775807 * 2
        System.out.println(c);



    /*   BigDecimal d = new BigDecimal(1.0);
        BigDecimal e = new BigDecimal(3);
        BigDecimal f = d.divide(e,5,BigDecimal.ROUND_DOWN) ;
        System.out.println(f);

        System.out.println("50! is : " + factorial(50));
    }public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE ;
        for (int i = 1; i <=n ; i++) {
            result = result.multiply(new BigInteger(i+ "")) ;

        }
        return result;

    }
     */

        java.math.BigInteger q = new java.math.BigInteger("3");
        java.math.BigInteger y = new java.math.BigInteger("7");
        java.math.BigInteger z = q.add(y);
        System.out.println("q is " + q);
        System.out.println("y is " + y);
        System.out.println("z is " + z);


        String s = "samuel etoo";
        System.out.println(s.lastIndexOf('o'));

        char[] charArray = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
        String message = new String(charArray);
        System.out.println(message);

        String u = "Java";
        u = "HTML";
        System.out.println(u);

        String[] tokens = "Java#HTML#Perl".split("#J");
        for (int i = 0; i < tokens.length; i++)
            System.out.println(tokens[i] + " ");

        double j = Double.parseDouble("12");
        System.out.println(j);


        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";
        System.out.println("Welcome to Java".replace("Java", "HTML"));
        System.out.println(s1.replace('o', 'T'));
        System.out.println(s1.replaceAll("[ot]", "T"));
        System.out.println(s1.replaceFirst("o", "T"));
        System.out.println(s1.toCharArray());
        System.out.println(s1.toCharArray()[0]);

        String s5 = "Welcome to Java";
        String s6 = s5.replace("o", "abc");
        System.out.println(s6);
        System.out.println(s5);

        String s7 = "Welcome";
        String s8 = "welcome";
        s8 = s7.replace('e', 'E');
        System.out.println(s8);

        String[] stringArr = "Welcome to Java and HTML".split(" ");
        System.out.println(Arrays.toString(stringArr));


        String[] arr = "Hey there!".split("e");
        String[] arr1 = {"HEY", "THERE", "HOW", "ARE", "YOU"};
        System.out.println(Arrays.toString(arr1[1].split("E")));

        char chh = 'a';
        String f = chh + "";
        System.out.println(f);
        String sch = String.valueOf(new char[]{'a', 'd', 'c'});
        System.out.println(sch);


        Test test = new Test("ABC");
//       System.out.println(test.text.toLowerCase());


        System.out.println("Hi, ABC, good".matches("ABC "));
        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
        System.out.println("A,B;C".replace(",;", "#"));
        System.out.println("A,B;C".replaceAll("[,;]", "#"));
        String[] tokenss = "A,B;C".split("[,;]");
        for (int i = 0; i < tokenss.length; i++)
            System.out.print(tokenss[i] + " ");
        System.out.println();

        String as = "Hi, Good Morning";
        System.out.println(m(as));

        Integer h = new Integer(3);
        System.out.println(h.intValue());
        System.out.println(h.compareTo(new Integer(4)));

        Integer zg = 3 + new Integer(5);
        System.out.println(zg);

        Integer xy = 3;
        System.out.println(xy.doubleValue());

        String[] arrr = {"furkan" , " fatih " , " seda ", " omer"};
        for (int i = 0; i < arrr.length; i++) {
            System.out.print(arrr[i]);

        }
    }


    public static int m(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (Character.isUpperCase(s.charAt(i)))
                count++;
        return count;
    }

    private String text;

    public Test(String s) {
        String text = s;
    }

    String text1;

    public void Test(String s) {
        text = s;


        }
    }
