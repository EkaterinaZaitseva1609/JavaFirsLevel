package ru.gb.Java_Erlan.lesson_9;

public class Cat extends Animals {

    public Cat(String animalName, int animalAppetite) {
        super(animalName, animalAppetite, 0);
    }

    public void eat(Plate p) {
        p.decreaseFood(this);
    }


    public void iswWllFed() {
        if (super.appetite > super.wellFed) {
            System.out.println(super.name + " поел");
        }
        else if (super.appetite < super.wellFed) {
            System.out.println(super.name + " переел");
        } else{
            System.out.println(super.name + " я не поел");
        }
    }

}
