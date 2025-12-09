package domain;

public final class Triangle {
    public enum Type { EQUILATERAL, ISOSCELES, SCALENE, NOT_TRIANGLE }

    public static Type classify(int a, int b, int c) {
        // range check
        if (a < 1 || b < 1 || c < 1 || a > 200 || b > 200 || c > 200) return Type.NOT_TRIANGLE;
        // triangle inequality
        if (a + b <= c || a + c <= b || b + c <= a) return Type.NOT_TRIANGLE;
        if (a == b && b == c) return Type.EQUILATERAL;
        if (a == b || a == c || b == c) return Type.ISOSCELES;
        return Type.SCALENE;
    }
}
