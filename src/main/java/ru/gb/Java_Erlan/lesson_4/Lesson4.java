package ru.gb.Java_Erlan.lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {

    //Переменные - параметры игры
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;


    //Константы
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final int LINE_LIMIT = 15;

    // Переменные - игровое поле с клавиатурой, случайные числа
    public static char[][] map;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    //Основной метод
    public static void main(String[] args) {

        // Инициализация игрового поля
        initMap();

        // Вывод поля
        printMap();

        //Главный игровой цикл
        while (true) {

            // Ход игрока
            humanTurn();

            //Печать игрового поля
            printMap();

            // Проверка победителя
            if (checkWin(DOT_X)) {
                System.out.println("Человеческий игрок одержал побуду!");
                break;
            }

            // Проверка полностью заполненного поля
            if (mapIsFull()) {
                System.out.println("Ничья!");
                break;
            }

            // Ход ИИ
            aiTurn();


            // Вывод игрового поля
            printMap();

            // Провоерка победителя
            if (checkWin(DOT_O)) {
                System.out.println("Совершеннейшее существо победило!!!");
                break;
            }


            // Проверка заполненной карты
            if (mapIsFull()) {
                System.out.println("Ничья!");
                break;
            }


        }

        // Игра закончена
        System.out.println("Игра завершена ");

        //  Закрываем консоль
        scanner.close();
    }

    private static boolean mapIsFull() {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                if (map[y][x] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char symbol) {
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;
        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;
        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
        if (map[2][0] == symbol && map[1][1] == symbol && map[0][2] == symbol) return true;
        return false;

    }

    private static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }
// Предоставляем ход игроку
    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате x, y в диапазоне [1.." + SIZE + "]");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    private static boolean isCellValid(int x, int y) {
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

        // Верхняя "легенда"
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
// Выводим игровое поле
        for (int y = 0; y < SIZE; y++) {
            System.out.print((y + 1) + " ");
            for (int x = 0; x < SIZE; x++) {
                System.out.print(map[y][x] + " ");
            }
            System.out.println();
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
