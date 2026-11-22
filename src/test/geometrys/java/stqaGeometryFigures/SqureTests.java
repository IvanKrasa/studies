package test.geometrys.java.stqaGeometryFigures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import studies.geometrys.figures.Square;

public class SqureTests {

    @Test
    void canCalculateArea() {
        var s = new Square(4.0);
        double result = s.area();
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(20.0, new Square(5.0).perimetr());
    }

    @Test
    void cannotCreateSquareWithNegativeSide() {
        try {
            new Square(-5.0);
            Assertions.fail();
        }  catch (IllegalArgumentException exception) {}
    }
}
