package cad;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class CADAppTest {

    Point p1 = new Point(0, 0);
    Point p2 = new Point(10, 10);
    Point centre = new Point(5, 5);

    @Test
    public void shouldDrawLine() {
        Graphics graphics = mock(Graphics.class);

        new CADApp().drawShapes(graphics, new Shape[]{getLine()});

        verify(graphics, times(1)).drawLine(p1, p2);
    }

    @Test
    public void shouldDrawRectangle() {
        Graphics graphics = mock(Graphics.class);

        new CADApp().drawShapes(graphics, new Shape[]{getRectangle()});

        verify(graphics, times(1)).drawRectangle(p1, p2);
    }

    @Test
    public void shouldDrawCircle() {
        Graphics graphics = mock(Graphics.class);

        new CADApp().drawShapes(graphics, new Shape[]{getCircle()});

        verify(graphics, times(1)).drawCircle(centre, 5);
    }

    @Test
    public void shouldDrawMultipleTests() {
        Graphics graphics = mock(Graphics.class);

        new CADApp().drawShapes(graphics, new Shape[]{getLine(), getRectangle(), getCircle(), getCircle()});

        verify(graphics, times(2)).drawCircle(centre, 5);
        verify(graphics, times(1)).drawRectangle(p1, p2);
        verify(graphics, times(1)).drawLine(p1, p2);

    }

    private Shape getLine() {
        Shape line = new Shape();
        line.setShapeType(Shape.TYPE_LINE);
        line.setP1(p1);
        line.setP2(p2);
        return line;
    }

    private Shape getRectangle() {
        Shape rectangle = new Shape();
        rectangle.setShapeType(Shape.TYPE_RECTANGLE);
        rectangle.setP1(p1);
        rectangle.setP2(p2);
        return rectangle;
    }

    private Shape getCircle() {
        Shape circle = new Shape();
        circle.setShapeType(Shape.TYPE_CIRCLE);
        circle.setP1(centre);
        circle.setRadius(5);
        return circle;
    }


}
