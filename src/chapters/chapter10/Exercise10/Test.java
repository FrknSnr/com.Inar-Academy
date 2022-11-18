package chapters.chapter10.Exercise10;

public class Test {
    public static void main(String[] args) {

        Queue q = new Queue();
        for (int i = 0; i < 20; i++) {
            q.enqueue(i+1);
        }

        int size = q.getSize();
        for (int i = 0; i < size ; i++) {
            System.out.print(q.dequeue() + " ");
        }
    }
}
