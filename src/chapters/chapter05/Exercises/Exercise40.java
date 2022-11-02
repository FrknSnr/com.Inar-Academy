package chapters.chapter05.Exercises;
public class Exercise40 {
    public static void main(String[] args) {
        int tails = 0;
        int heads = 0;

        System.out.println("0 for head and 1 for tails");
        for (int i = 0; i < 1000000; i++) {
            int j = (int)(Math.random() * 2);

            if(j == 0){
                heads ++;
            }
            else if(j == 1){
                tails++;
            }

        }
        System.out.println("The number of tails is : " + tails );
        System.out.println("The number of heads is : " + heads );
    }

}



