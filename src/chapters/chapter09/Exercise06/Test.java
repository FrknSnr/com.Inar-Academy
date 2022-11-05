package chapters.chapter09.Exercise06;


public class Test {
    public static void main(String[] args) {

        double[] arr = new double[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * Integer.MAX_VALUE) ;
        }
        StopWatch second = new StopWatch();
        second.start();
        for (int i = 0; i < arr.length-1; i++) {
            double currentMin = arr[i] ;
            int minIndex = i ;
            for (int j = i+1 ; j <arr.length; j++) {
                if (currentMin > arr[j]){
                    currentMin = arr[j];
                    minIndex = j ;
                }
            }if (minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = currentMin ;
            }
        }
        second.stop();
        System.out.println(second.getElapsedTime() + " milliseconds. ");
    }
}
