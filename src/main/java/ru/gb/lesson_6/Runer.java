package ru.gb.lesson_6;

import ru.gb.lesson_6.animals.Cat;

public class Runer {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Букля", 6);
        System.out.println(cat1.getName());
        cat1.setName("Bob");
        System.out.println(cat1.getName());

        cat1.run(20);

Cat cat2 = new Cat ("Filya", 6);




    }
}
