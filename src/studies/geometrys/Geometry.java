package studies.geometrys;

import studies.geometrys.figures.Rectangle;
import studies.geometrys.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printSqureArea(new Square(7.0));
        Square.printSqureArea(new Square(5.0));
        Square.printSqureArea(new Square(3.0));

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(7.0, 9.0);
    }

}
