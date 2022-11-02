package chapters.chapter05.Exercises;

public class Exercise43 {

    public static void main(String[] args) {

        int count = 0 ;

        for(int i = 1 ; i < 8 ; i++){
            for(int j = i ; j < 8 ; j++){
            if(i != j){
                count++;
                System.out.println(i + " " + j);
            }


            }

        }
        System.out.println("The total number of all combinations is : " + count);


    }
}
