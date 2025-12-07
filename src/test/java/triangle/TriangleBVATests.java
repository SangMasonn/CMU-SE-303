package triangle;

import domain.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleBVATests {

    // Cận dưới 1
    @Test
    void lowerBound_allOnes() {
        assertEquals(Triangle.Type.EQUILATERAL, Triangle.classify(1,1,1));
    }

    @Test
    void lowerBound_violateInequality() {
        assertEquals(Triangle.Type.NOT_TRIANGLE, Triangle.classify(1,1,2));
    }

    // Cận trên 200
    @Test
    void upperBound_all200() {
        assertEquals(Triangle.Type.EQUILATERAL, Triangle.classify(200,200,200));
    }

    @Test
    void upperBound_outOfRange201() {
        assertEquals(Triangle.Type.NOT_TRIANGLE, Triangle.classify(201,200,200));
    }

    // Sát biên bất đẳng thức
    @Test
    void inequality_exactBoundary() {
        assertEquals(Triangle.Type.NOT_TRIANGLE, Triangle.classify(2,3,5)); // 2+3=5
    }

    @Test
    void inequality_justInside() {
        assertEquals(Triangle.Type.SCALENE, Triangle.classify(2,3,4)); // 2+3>4
    }
}
