package chapters.Chapter05.Checkpoints;

public class Checkpoint03 {

	public static void main(String[] args) {

		
		// (a) :
		
		int i = 1;
		while (i < 10)
		if (i % 2 == 0)
		 System.out.println(i);

		// (b) :
		int a = 1;
		while (a < 10)
		if (a % 2 == 0)
		 System.out.println(a++);
		
		// (c) :
		int b = 1;
		while (b < 10)
		if ((b++) % 2 == 0)
		 System.out.println(b);
		
	}

}
