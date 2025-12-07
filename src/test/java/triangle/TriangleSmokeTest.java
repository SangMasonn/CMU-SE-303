package triangle;

import domain.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleSmokeTest {
    @Test void equilateral_3_3_3() {
        assertEquals(Triangle.Type.EQUILATERAL, Triangle.classify(3,3,3));
    }
    @Test void notTriangle_1_2_3() {
        assertEquals(Triangle.Type.NOT_TRIANGLE, Triangle.classify(1,2,3));
    }
}
