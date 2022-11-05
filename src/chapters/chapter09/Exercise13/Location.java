package chapters.chapter09.Exercise13;

public class Location {

    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public int getColumn() {
        return column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void display() {
        System.out.println("The location of the largest element is " + getMaxValue() + " at (" + getRow() + "," + getColumn() + ")");
    }


}