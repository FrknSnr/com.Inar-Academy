package chapters.chapter09.Exercise08;

public class Fan {

    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Fan() {
    }

    public String toString() {
        if (!isOn()) {
            return "The color of the fan : " + getColor()
                    + "\nThe radius of the fan :" + getRadius()
                    + "\nFAN IS OFF !";
        }
        return "Speed of the fan : " + getSpeed()
                + "\nColor of it : " + getColor()
                + "\nRadius : " + getRadius();
    }
}
