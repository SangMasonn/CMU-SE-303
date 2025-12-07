package nextdate;

import domain.NextDate;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class NextDateCombinationalTest {

    @ParameterizedTest
    @CsvFileSource(
            resources = "/datasets/nextdate_pict.csv",
            numLinesToSkip = 1,
            delimiter = '\t'   // PICT xuất file cách nhau bằng tab
    )
    void testNextDateWithPICT(int year, int month, int day) {
        // CSV theo thứ tự: Year, Month, Day
        String result = NextDate.nextDate(day, month, year);
        assertNotNull(result);   // chỉ cần đảm bảo không crash
    }
}
