package chapters.chapter10.Exercise13;

public class MyRectangle2D {

    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return getHeight() * getWidth();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public boolean contains(double x, double y) {
        return ((this.x + (width / 2) >= x && x >= this.x - (width / 2)) &&
                (this.y + (height / 2) >= y && y >= this.y - (height / 2)));
    }

    public boolean contains(MyRectangle2D r) {
        if (this.getMinX() <= r.getMinX() &&
                this.getMaxX() >= r.getMaxX() &&
                this.getMinY() <= r.getMinY() &&
                this.getMaxY() >= r.getMaxY()) {
            return true;
        }
        return false;
    }

    public boolean overlaps(MyRectangle2D r) {
        if ((r.getMinX() <= this.getMaxX() && r.getMaxX() > this.getMaxX()) ||
                (r.getMaxX() >= this.getMinX() && r.getMinX() < this.getMinX()) ||
                (r.getMinY() <= this.getMaxY() && r.getMaxY() > this.getMaxY()) ||
                (r.getMaxY() >= this.getMinY() && r.getMinY() < this.getMinY())) {
            return true;
        }
        return false;
    }

    private double getMinX() {
        return this.getX() - (this.getWidth() / 2);
    }

    private double getMaxX() {
        return this.getX() + (this.getWidth() / 2);
    }

    private double getMinY() {
        return this.getY() - (this.getHeight() / 2);
    }

    private double getMaxY() {
        return this.getY() + (this.getHeight() / 2);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
