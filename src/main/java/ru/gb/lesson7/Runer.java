package ru.gb.lesson7;

import ru.gb.lesson_6.animals.Cat;

public class Runer {
    public static void main(String[] args) {

        ScienceFiction book1 = new ScienceFiction("The Grand Design", "Hawking");
        book1.getSale(700, 2000);
        System.out.println(book1.name);
        System.out.println(book1.language);
        System.out.println(book1.page);


        ScienceFiction book2 = new ScienceFiction("Dune", "Herbert");
        book2.getSale(200,500);
        System.out.println(book2.language);
    }
}
