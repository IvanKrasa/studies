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
}
