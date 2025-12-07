package nextdate;

import domain.NextDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NextDateEPTests {

    // ngày thường giữa tháng
    @Test
    void middleOfMonth() {
        assertEquals("16-01-2024", NextDate.nextDate(15,1,2024));
    }

    // cuối tháng 31 ngày
    @Test
    void endOf31DayMonth() {
        assertEquals("01-02-2024", NextDate.nextDate(31,1,2024));
    }

    // cuối tháng 30 ngày
    @Test
    void endOf30DayMonth() {
        assertEquals("01-05-2024", NextDate.nextDate(30,4,2024));
    }

    // 28/2 năm không nhuận
    @Test
    void febNonLeapToMarch() {
        assertEquals("01-03-2023", NextDate.nextDate(28,2,2023));
    }

    // 29/2 năm nhuận
    @Test
    void febLeapToMarch() {
        assertEquals("01-03-2024", NextDate.nextDate(29,2,2024));
    } 

    // 31/12 sang năm mới
    @Test
    void endOfYearToNextYear() {
        assertEquals("01-01-2025", NextDate.nextDate(31,12,2024));
    }

    // ngày không hợp lệ: 31/4
    @Test
    void invalidDay31_4() {
        assertEquals("Invalid", NextDate.nextDate(31,4,2024));
    }

    // tháng không hợp lệ
    @Test
    void invalidMonth13() {
        assertEquals("Invalid", NextDate.nextDate(10,13,2024));
    }

    // năm ngoài miền
    @Test
    void invalidYearOutOfRange() {
        assertEquals("Invalid", NextDate.nextDate(10,10,2200));
    }
}
