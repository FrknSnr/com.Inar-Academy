package chapters.chapter08;

public class Exercise33 {

    public static void main(String[] args) {



    } public static double areaFormula(double[] p1, double[] p2, double[] p3) {
        double side1 = Math.pow(Math.pow(p2[0] - p1[0], 2)
                + Math.pow(p2[1] - p1[1], 2), 0.5);

        double side2 = Math.pow(Math.pow(p3[0] - p2[0], 2
        ) + Math.pow(p3[1] - p2[1], 2), 0.5);

        double side3 = Math.pow(Math.pow(p3[0] - p1[0], 2)
                + Math.pow(p3[1] - p1[1], 2), 0.5);

        double s = (side1 + side2 + side3) / 2;

        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return area;
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[] intersectingPoints = new double[2];

        //0-2  and  1-3
        double a = points[0][1] - points[2][1];
        double b = -(points[0][0] - points[2][0]);
        double e = (points[0][1] - points[2][1]) * points[0][0] - (points[0][0] - points[2][0]) * points[0][1];
        double c = (points[1][1] - points[3][1]);
        double d = -(points[1][0] - points[3][0]);
        double f = (points[1][1] - points[3][1]) * points[1][0] - (points[1][0] - points[3][0]) * points[1][1];

        if (a * d - b * c == 0) {
            return intersectingPoints;
        } else {
            intersectingPoints[0] = (e * d - b * f) / (a * d - b * c);
            intersectingPoints[1] = (a * f - e * c) / (a * d - b * c);
        }

        return intersectingPoints;

    }
}