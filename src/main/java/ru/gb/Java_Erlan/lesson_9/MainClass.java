package ru.gb.Java_Erlan.lesson_9;

public class MainClass {
    public static void main(String[] args) {
        /*
       Cat cat1 = new Cat("Buklya", 30, 30);
       Plate plate1 = new Plate(100);
       plate1.info();
       plate1.moreFood(10);
       plate1.info();
       cat1.eat(plate1);
       plate1.info();

         */
//
//        Cat cat2 = new Cat("Mars",60, 30);
//        Plate plate2 = new Plate(60);
//
//        System.out.println(cat1.name);
//
//        plate1.info();
//        cat1.eat(plate1);
//        plate1.info();
//        cat1.iswWllFed();
//
//        plate2.info();
//        cat2.eat(plate2);
//        plate2.info();
//        cat2.iswWllFed();


        Cat cat1 = new Cat ("Bylka", 20);
        Cat cat2 = new Cat ("Marta", -5);
        Cat cat3 = new Cat ("Mars", 25);
        Cat cat4 = new Cat ("Barsik", 300);
        Cat cat5 = new Cat ("Persik", 45);

        Cat[] cats = new Cat[5];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = cat4;
        cats[4] = cat5;

Plate plate = new Plate(300);
plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
        }
plate.info();
        for (Cat cat : cats) {
            cat.iswWllFed();
        }




    }
}
