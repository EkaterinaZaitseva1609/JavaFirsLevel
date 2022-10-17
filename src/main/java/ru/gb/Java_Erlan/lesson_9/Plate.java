package ru.gb.Java_Erlan.lesson_9;

public class Plate {

    private int food;


    public Plate(int animalFood) {
        this.food = animalFood;
    }

    public void decreaseFood(Cat cat) {
        if (cat.appetite > food) {
            System.out.println("Слишком мало еды для " + cat.name);
        } else {
            food -= cat.appetite;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void moreFood(int foodToAdd) {
        System.out.println("Сколько грамм корма положить в миску?");
        this.food += foodToAdd;


    }


}
