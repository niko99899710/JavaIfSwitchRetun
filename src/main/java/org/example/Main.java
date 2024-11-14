package org.example;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задание1");
        int x = 8;
        int y = 16;
        if ((x % 2 == 0) && (y % 2 == 0)) {
            System.out.println("Удачное совпадение");
        } else {
            System.out.println();
        }
    }

    public static void task2() {
        int day = 8;
        String DECADE = switch (day) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30 -> "1 декада";
            case 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> "2 декада";
            case 21, 22, 23, 24, 25, 26, 27, 28, 29 -> "3 декада";
            default -> "not a decada";
        };
        System.out.println(DECADE);

    }
}
