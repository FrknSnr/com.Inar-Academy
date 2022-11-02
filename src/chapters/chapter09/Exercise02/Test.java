package chapters.chapter09.Exercise02;

public class Test {

    public static void main(String[] args) {

        Stock s1 = new Stock("ORCL","Oracle Corporation") ;
        s1.previousClosingPrice = 3;
        s1.currentPrice = 4 ;
        System.out.printf("%.2f",s1.getChangedPercent());

    }
}
