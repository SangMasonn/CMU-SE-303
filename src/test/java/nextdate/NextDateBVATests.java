package nextdate;

import domain.NextDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NextDateBVATests {

    // Biên đầu tháng
    @Test
    void firstDayOfMonth() {
        assertEquals("02-01-2024", NextDate.nextDate(1,1,2024));
    }

    // Biên cuối tháng 31 ngày
    @Test
    void lastDay31() {
        assertEquals("01-03-2024", NextDate.nextDate(29,2,2024)); // đã test ở EP, nhưng BVA nhấn mạnh biên
    }

    // 28/2, 29/2, 30/2
    @Test
    void feb28NonLeap() {
        assertEquals("01-03-2023", NextDate.nextDate(28,2,2023));
    }

    @Test
    void feb29Leap() {
        assertEquals("01-03-2024", NextDate.nextDate(29,2,2024));
    }

    @Test
    void feb30Invalid() {
        assertEquals("Invalid", NextDate.nextDate(30,2,2024));
    }

    // Biên năm 1900 và 2100
    @Test
    void lowerYearBound() {
        assertEquals("02-01-1900", NextDate.nextDate(1,1,1900));
    }

    @Test
    void upperYearBoundInvalidNext() {
        // ngày sau 31/12/2100 bị xem là vượt phạm vi
        assertEquals("Invalid", NextDate.nextDate(31,12,2100));
    }
}
