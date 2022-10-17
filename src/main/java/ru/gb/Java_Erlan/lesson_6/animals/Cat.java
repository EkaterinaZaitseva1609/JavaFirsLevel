package ru.gb.Java_Erlan.lesson_6.animals;

public class Cat extends Animal {

    public Cat(String animalName, int animalAge) {
        super(animalName, animalAge, 200, 0);
    }

    @Override
    public void run(int dist) {
        if (dist > super.distRun) {
            System.out.println("Слишком большая дистанция");
        } else {
            System.out.println("Кот " + super.name + " пробежал " + dist + " метров");
        }
    }

    @Override
    public void swim(int distWater) {
        System.out.println("Кот не умеет плавать");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
