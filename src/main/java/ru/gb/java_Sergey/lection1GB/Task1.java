package ru.gb.java_Sergey.lection1GB;
import java.util.Scanner;


public class Task1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число");
        for (int i = 10; i <= 30; i += 10) playLevel(i);
        System.out.println("Вы выиграли");
        scanner.close();
    }

    private static void playLevel(int range){
        int number = (int)(Math.random() * range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("вы угадали");
                break;
            } else if (input_number > number) {
                System.out.println("загаданное число меньше");
            } else {
                System.out.println("загаданное число больше");
            }
        }
    }
}
