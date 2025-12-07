package triangle;

import domain.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleEPTests {

    // EP hợp lệ: tam giác đều
    @Test
    void equilateral_valid() {
        assertEquals(Triangle.Type.EQUILATERAL, Triangle.classify(5,5,5));
    }

    // EP hợp lệ: tam giác cân
    @Test
    void isosceles_valid() {
        assertEquals(Triangle.Type.ISOSCELES, Triangle.classify(4,4,5));
    }

    // EP hợp lệ: tam giác thường
    @Test
    void scalene_valid() {
        assertEquals(Triangle.Type.SCALENE, Triangle.classify(3,4,5));
    }

    // EP không hợp lệ: vi phạm bất đẳng thức
    @Test
    void invalid_inequality() {
        assertEquals(Triangle.Type.NOT_TRIANGLE, Triangle.classify(1,2,3));
    }

    // EP không hợp lệ: cạnh = 0
    @Test
    void invalid_zero_side() {
        assertEquals(Triangle.Type.NOT_TRIANGLE, Triangle.classify(0,10,10));
    }

    // EP không hợp lệ: cạnh ngoài miền >200
    @Test
    void invalid_out_of_range() {
        assertEquals(Triangle.Type.NOT_TRIANGLE, Triangle.classify(201,10,10));
    }
}
