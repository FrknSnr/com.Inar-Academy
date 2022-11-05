package chapters.chapter09.Exercise08;

public class Test {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(5);
        fan1.setColor("blue");
        fan2.setOn(false);

        System.out.println(fan1);
        System.out.println("----------------------");
        System.out.println(fan2.toString());
    }
}
