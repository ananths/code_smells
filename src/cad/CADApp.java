package cad;

public class CADApp {
    void drawShapes(Graphics graphics, Shape[] shapes)
    {
        for (int i = 0; i < shapes.length; i++)
        {
            switch (shapes[i].getShapeType())
            {
                case Shape.TYPE_LINE: graphics.drawLine(shapes[i].getP1(), shapes[i].getP2());
                                     break;
                case Shape.TYPE_RECTANGLE: //draw the four edges.
                                    graphics.drawRectangle(shapes[i].getP1(), shapes[i].getP2());
                                    break;
                case Shape.TYPE_CIRCLE: graphics.drawCircle(shapes[i].getP1(), shapes[i].getRadius());
                                    break;
            }
        }
    }
}
