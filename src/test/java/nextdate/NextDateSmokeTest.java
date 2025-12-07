package nextdate;

import domain.NextDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NextDateSmokeTest {
    @Test void febNonLeap_28_2_2023_to_01_03_2023() {
        assertEquals("01-03-2023", NextDate.nextDate(28,2,2023));
    }
    @Test void endOfYear_31_12_2024_to_01_01_2025() {
        assertEquals("01-01-2025", NextDate.nextDate(31,12,2024));
    }
}
