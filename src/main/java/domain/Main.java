package domain;

import java.util.Scanner;

public class Main {

    // Hàm đọc số nguyên an toàn (chống nhập chữ)
    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Hãy nhập số!");
                sc.next(); 
            }
        }
    }

    // Chức năng NextDate
    private static void runNextDate(Scanner sc) {
        int d = readInt(sc, "Nhập ngày (d): ");
        int m = readInt(sc, "Nhập tháng (m): ");
        int y = readInt(sc, "Nhập năm (y): ");

        String result = NextDate.nextDate(d, m, y);
        System.out.println("Ngày kế tiếp: " + result);
        System.out.println("--------------------------------");
    }

    // Chức năng Triangle
    private static void runTriangle(Scanner sc) {
        int a = readInt(sc, "Nhập cạnh a: ");
        int b = readInt(sc, "Nhập cạnh b: ");
        int c = readInt(sc, "Nhập cạnh c: ");

        Triangle.Type type = Triangle.classify(a, b, c);

        System.out.print("Kết quả: ");
        switch (type) {
            case EQUILATERAL:
                System.out.println("EQUILATERAL (Tam giác đều)");
                break;
            case ISOSCELES:
                System.out.println("ISOSCELES (Tam giác cân)");
                break;
            case SCALENE:
                System.out.println("SCALENE (Tam giác thường)");
                break;
            case NOT_TRIANGLE:
            default:
                System.out.println("NOT_TRIANGLE (Không phải tam giác hợp lệ)");
                break;
        }
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Tính ngày kế tiếp (NextDate)");
            System.out.println("2. Phân loại tam giác (Triangle)");
            System.out.println("0. Thoát");
            System.out.println("================");
            int choice = readInt(sc, "Nhập lựa chọn: ");

            switch (choice) {
                case 1:
                    runNextDate(sc);
                    break;
                case 2:
                    runTriangle(sc);
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, hãy chọn lại!");
                    System.out.println("--------------------------------");
            }
        }
    }
}
