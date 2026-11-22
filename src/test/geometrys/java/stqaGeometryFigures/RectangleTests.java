package test.geometrys.java.stqaGeometryFigures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import studies.geometrys.figures.Rectangle;
import studies.geometrys.figures.Square;

public class RectangleTests {

    @Test
    void cannotCreateRectangleWithNegativeSide() {
        try {
            new Rectangle(-5.0, 3.0);
            Assertions.fail();
        }  catch (IllegalArgumentException exception) {

        }
    }


    @Test
    void testNonEquality() {
        var r1 = new Rectangle(5.0, 4.0);
        var r2 = new Rectangle(5.0, 4.0);
        Assertions.assertEquals(r1, r2);
    }

    @Test
    void testNonEquality2() {
        var r1 = new Rectangle(5.0, 4.0);
        var r2 = new Rectangle(4.0, 5.0);
        Assertions.assertEquals(r1, r2);
    }
}
