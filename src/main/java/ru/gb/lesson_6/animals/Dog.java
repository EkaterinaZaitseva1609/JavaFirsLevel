package ru.gb.lesson_6.animals;


public class Dog extends Animal {

        public Dog (String animalName, int animalAge) {
            super(animalName, animalAge, 500, 10);
        }

    @Override
    public void run(int dist) {
        if (dist > super.distRun) {
            System.out.println("Слишком большая дистанция ");
        } else {
            System.out.println("Собака " + super.name + " пробежал " + dist + " метров");
        }
    }

    @Override
    public void swim(int distWater) {
        if (distWater > super.distSwim) {
            System.out.println("Слишком большая дистанция ");
        } else {
            System.out.println("Собака " + name + " проплыла " + distWater + " метров");
        }
    }

}
