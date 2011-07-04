package cad;

public class Shape {
    public static final int TYPE_LINE = 0;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_CIRCLE = 2;

    private int shapeType;

    //starting point of the line.
    //lower left corner of the rectangle.
    //center of the circle.
    private Point p1;

    //ending point of the line.
    //upper right corner of the rectangle.
    //not used for the circle.
    private Point p2;

    private int radius;

    public int getShapeType() {
        return shapeType;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public int getRadius() {
        return radius;
    }

    public void setShapeType(int shapeType) {
        this.shapeType = shapeType;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
