package ru.gb.lesson_5;

public class CatDemoApp {

    public static void main(String[] args) {

//        Integer a = new Integer(2);

        Cat myCat = new Cat();
        String name = myCat.name;


        Cat aCat = new Cat();
//Два дефолтных объекта

        System.out.println("КОТ 1 имя: " + myCat.name + ", цвет: " + myCat.color +
                ", возраст: " + myCat.age);

        System.out.println("КОТ 2 имя: " + aCat.name + ", цвет: " + aCat.color +
                ", возраст: " + aCat.age);


        myCat.name = "Барсик";
        myCat.color = "белый";
        myCat.age = 4;


        aCat.name = "Мурзик";
        aCat.color = "черный";
        aCat.age = 6;

        System.out.println("КОТ 1 имя: " + myCat.name + ", цвет: " + myCat.color +
                ", возраст: " + myCat.age);

        System.out.println("КОТ 2 имя: " + aCat.name + ", цвет: " + aCat.color +
                ", возраст: " + aCat.age);

    }


}



