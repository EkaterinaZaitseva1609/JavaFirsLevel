package ru.gb.lesson_3;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkOne {
    // 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Приготовься к игре! У тебя всего 3 попытки! Введи чесло от 0 до 9");

        int secretNum = random.nextInt(10);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Попытка №" + i);
            int num = scanner.nextInt();
            if (num < 0 || num > 9) {
                System.out.println("Ошибка! Ты ввел число, которое выходит за рамки нашей программы");
            } else if (num == secretNum) {
                System.out.println("Ура!!! Ты угадал, правильный ответ = " + secretNum);
                break;
            } else if (num > secretNum) {
                System.out.println("Ты ввел слишком большое число");
            } else {
                System.out.println("Ты ввел слишком маленькое число");
            }
        }
    }
}


