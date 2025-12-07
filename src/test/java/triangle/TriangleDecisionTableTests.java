package triangle;

import domain.Triangle;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TriangleDecisionTableTests {

    // R1: a = b = c -> EQUILATERAL
    @Test
    void rule1_equilateral() {
        assertEquals(Triangle.Type.EQUILATERAL,
                Triangle.classify(3, 3, 3));
    }

    // R2: a=b≠c OR b=c≠a OR a=c≠b -> ISOSCELES
    @Test
    void rule2_isosceles() {
        assertEquals(Triangle.Type.ISOSCELES,
                Triangle.classify(4, 4, 6));   // a=b≠c
    }

    // R3: a+b>c AND a+c>b AND b+c>a -> SCALENE
    @Test
    void rule3_scalene() {
        assertEquals(Triangle.Type.SCALENE,
                Triangle.classify(4, 5, 6));
    }

    // R4: one edge <= 0 -> INVALID
    @Test
    void rule4_oneEdgeNonPositive() {
        assertEquals(Triangle.Type.NOT_TRIANGLE,
                Triangle.classify(-1, 3, 4));
    }

    // R5: a + b <= c -> INVALID
    @Test
    void rule5_aPlusBLessOrEqualC() {
        assertEquals(Triangle.Type.NOT_TRIANGLE,
                Triangle.classify(1, 2, 3));
    }

    // R6: a + c <= b -> INVALID
    @Test
    void rule6_aPlusCLessOrEqualB() {
        assertEquals(Triangle.Type.NOT_TRIANGLE,
                Triangle.classify(1, 3, 2));
    }

    // R7: b + c <= a -> INVALID
    @Test
    void rule7_bPlusCLessOrEqualA() {
        assertEquals(Triangle.Type.NOT_TRIANGLE,
                Triangle.classify(3, 1, 2));
    }

}

