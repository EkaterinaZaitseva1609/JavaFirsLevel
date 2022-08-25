package ru.gb.lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Practice_5_chess {
    //Переменные - параметры игры
    public static final int SIZE = 8;
    public static final int DOTS_TO_WIN = 3;

    //Константы
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_F = 'F';
    public static int indFx, indFy;
    public static final char DOT_L = 'L';
    public static int indLx, indLy;
    public static final char DOT_K = 'K';
    public static int indK;
    public static final int LINE_LIMIT = 10;

    // Переменные - игровое поле с клавиатурой, случайные числа
    public static char[][] map;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();


    public static void main(String[] args) {
// Инициализация игрового поля
        initMap();

        //Печать игрового поля
        printMap();

        // Ход игрока
        humanTurn();

        //Печать игрового поля
        printMap();

        // Ход игрока
        humanTurnL();

        //Печать игрового поля
        printMap();

        // Ход игрока
        humanTurnK();

        //Печать игрового поля
        printMap();

        //Проверка хода ладьи
        checkL();

        //Печать игрового поля
        printMap();

        //Проверка хода ферзя
        checkF();

        //Печать игрового поля
        printMap();
    }

    private static void checkF() {
        //Проверка хода ферзя
        for (int i = 0; i < map.length; i++) {
            if (map[indFy][i] != DOT_L && map[indFy][i] != DOT_F && map[indFy][i] != DOT_K) {
                map[indFy][i] = 'x';
            }
            if (map[i][indFx] != DOT_L && map[i][indFx] != DOT_F && map[i][indFx] != DOT_K) {
                map[i][indFx] = 'x';
            }
        }

    }

    private static void checkL() {
// /Проверка хода ладьи
        for (int i = 0; i < map.length; i++) {
            if (map[indLy][i] != DOT_L && map[indLy][i] != DOT_F && map[indLy][i] != DOT_K) {
                map[indLy][i] = 'x';
            }
            if (map[i][indLx] != DOT_L && map[i][indLx] != DOT_F && map[i][indLx] != DOT_K) {
                map[i][indLx] = 'x';

            }
        }
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате x, y в диапазоне [1.." + SIZE + "] для фигуры Ферзь(F)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_F;
        indFx = x;
        indFy = y;
    }

    private static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE) return false;
        if (y < 0 || y >= SIZE) return false;
        if (map[y][x] != DOT_EMPTY) return false;
        return true;
    }

    private static void humanTurnL() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате x, y в диапазоне [1.." + SIZE + "] для фигуры Ладья(l)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_L;
        indLx = x;
        indLy = y;

    }

    private static boolean isCellValidL(int x, int y) {
        if (x < 0 || x >= SIZE) return false;
        if (y < 0 || y >= SIZE) return false;
        if (map[y][x] != DOT_EMPTY) return false;
        return true;
    }

    private static void humanTurnK() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате x, y в диапазоне [1.." + SIZE + "] для фигуры Конь(K)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_K;
    }

    private static boolean isCellValidK(int x, int y) {
        if (x < 0 || x >= SIZE) return false;
        if (y < 0 || y >= SIZE) return false;
        if (map[y][x] != DOT_EMPTY) return false;
        return true;
    }


    private static void printMap() {
        //Сделали отступ
        for (int i = 0; i < LINE_LIMIT; i++) {
            System.out.println();
        }


        System.out.println();
// Выводим игровое поле
        for (int y = SIZE - 1; y >= 0; y--) {
            System.out.print((y + 1) + " ");
            for (int x = 0; x < SIZE; x++) {
                System.out.print(map[y][x] + " ");
            }
            System.out.println();
        }

        // Буквы под полем
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }


        //дополнительный отступ
        System.out.println();
    }


    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }


}
