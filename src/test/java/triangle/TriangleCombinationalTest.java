
package triangle;

import domain.Triangle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleCombinationalTest {

    @ParameterizedTest
    @CsvFileSource(
            resources = "/datasets/triangle_pict.csv",
            numLinesToSkip = 1,
            delimiter = '\t'   // PICT dùng tab để phân tách cột
    )

    void testTriangleWithPICT(int a, int b, int c) {
        Triangle.Type result = Triangle.classify(a, b, c);
        assertNotNull(result);  // xác minh không crash
    }
}
