package domain;

public final class NextDate {
    private NextDate() {
    }

    static boolean isLeap(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }
    public static String nextDate(int d, int m, int y) {
        if (y < 1900 || y > 2100 || m < 1 || m > 12) {
            return "Invalid";
        }
        int[] md = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeap(y)) {
            md[2] = 29;
        }
        if (d < 1 || d > md[m]) {
            return "Invalid";
        }
        int nd = d + 1;
        int nm = m;
        int ny = y;

        if (nd > md[m]) {
            nd = 1;
            nm++;
        }
        if (nm > 12) {
            nm = 1;
            ny++;
        }
        if (ny > 2100) {
            return "Invalid";
        }
        return String.format("%02d-%02d-%04d", nd, nm, ny);
    }
}
