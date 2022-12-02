package chapters.chapter13.Exercise05;

public abstract class ComparableGeometricObject implements Comparable {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;


    protected ComparableGeometricObject() {
        dateCreated = new java.util.Date();
    }

    protected ComparableGeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled : " + filled;
    }

    public static ComparableGeometricObject max(ComparableGeometricObject o1, ComparableGeometricObject o2) {
        return o1.compareTo(o2) > 0 ? o1 : o2;
    }

    public int compareTo(ComparableGeometricObject o) {
        return this.getArea() > o.getArea() ? 1 : (this.getArea() == o.getArea() ? 0 : -1);
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

