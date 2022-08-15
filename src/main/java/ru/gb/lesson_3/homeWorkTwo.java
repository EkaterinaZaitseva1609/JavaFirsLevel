package ru.gb.lesson_3;

import java.util.Random;
import java.util.Scanner;

public class homeWorkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        //сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        //apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        //Для сравнения двух слов посимвольно, можно пользоваться:
        //String str = "apple";
        //str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово
        //Используем только маленькие буквы

        String[] array = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Привет, давай играть;) Я загадал слово, это растение, возможно фрукт, ягода или овощ, думаю, ты много раз его пробовал, знаешь что это? ");
        System.out.println("напиши строчнымы буквами свой ответ");


        int index = random.nextInt(array.length);
        System.out.println(array[index]);
        while (true) {
            String word = scanner.nextLine();
            if (word.equals(array[index])) {
                System.out.println("Вау, ты умеешь читать мысли! " + word + " - правильный ответ");
                break;
            } else {
                int wordMass = 0;
                if (word.length() > array[index].length()) {
                    wordMass = array[index].length();
                } else {
                    wordMass = word.length();
                }
                for (int i = 0; i < wordMass; i++) {

                    if (word.charAt(i) == array[index].charAt(i)) {
                        System.out.print(word.charAt(i));
                    } else {
                        System.out.print("*");

                    }

                }
            }
        }
    }
}
