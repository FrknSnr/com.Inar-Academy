package chapters.chapter07.Checkpoints;

public class Checkpoint07_08 {
    public static void main(String[] args) {
        // a.
        double[] value = new double[10];
        // b.
        value[9] = 5.5;
        // c.
        System.out.println(value[0]+value[1]);
        System.out.println("-----------------------------------");
        // d.
        double sum = 0 ;
        for(int i = 0 ; i < value.length ; i++ ){
            sum += value[i] ;
        }
        System.out.println(sum);
        System.out.println("-----------------------------------");
        // e.
        double min = 5.5 ;
        for (int m = 0 ; m < value.length ; m++){
            if (value[m] < min) min = value[m];
        }
        System.out.println(min);
        System.out.println("-----------------------------------");
        // f.
        for(int r = 0; r < value.length ; r++){
            value[r] =(int)(Math.random() * 10.1  * 100 ) / 100.0  ;
            System.out.println(value[r]);
        }
        System.out.println("-----------------------------------");
    }
}
