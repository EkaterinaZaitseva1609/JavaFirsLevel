package ru.gb.Java_Erlan.lesson_8;


public class Runer_3 {
    public static void main(String[] args) {

        Employees prog1 = new Programmers("Алексей Иванов", 2, 8, true, true, "Hello, World!");
        prog1.getNewSalary(true);
        prog1.sayFavoritePhrase();

        Employees  des1 = new Designers("Нина Романова", 4, 6, false, true, "Дизайнеры, вперед!");
        des1.getNewSalary(true);
        des1.sayFavoritePhrase();

        prog1.sayFavoritePhrase();
        des1.sayFavoritePhrase();
        int idNumb = des1.idNumb;
        System.out.println(idNumb);
    }
}
