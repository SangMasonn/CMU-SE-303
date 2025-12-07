package nextdate;

import domain.NextDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NextDateDecisionTableTests {

    // Rule: d < maxDay(m) => d+1, same month
    @Test
    void rule1_middleOfMonth() {
        assertEquals("16-05-2024", NextDate.nextDate(15,5,2024));
    }

    // Rule: d = maxDay(m) & m != 12 => 01/(m+1)
    @Test
    void rule2_endOfApril() {
        assertEquals("01-05-2024", NextDate.nextDate(30,4,2024));
    }

    // Rule: d = maxDay(m) & m = 12 => 01/01, y+1
    @Test
    void rule3_endOfYear() {
        assertEquals("01-01-2025", NextDate.nextDate(31,12,2024));
    }

    // Rule: Feb non-leap 28 => 01/03
    @Test
    void rule4_febNonLeap() {
        assertEquals("01-03-2023", NextDate.nextDate(28,2,2023));
    }

    // Rule: Feb leap 29 => 01/03
    @Test
    void rule5_febLeap() {
        assertEquals("01-03-2024", NextDate.nextDate(29,2,2024));
    }

    // Rule: invalid date (d>maxDay or invalid month/year)
    @Test
    void rule6_invalidDate() {
        assertEquals("Invalid", NextDate.nextDate(31,11,2024)); // tháng 11 chỉ có 30 ngày
    }
}
