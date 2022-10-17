package ru.gb.Java_Erlan.lesson_6.animals;

public class Animal {

    protected String name;

    protected final int age;
    protected final int distRun;
    protected final int distSwim;

    public Animal(String animalName, int animalAge, int finalDistRun, int finalDistSwim) {
        this.name = animalName;
        this.age = animalAge;
        this.distRun = finalDistRun;
        this.distSwim = finalDistSwim;
    }
    public void run(int dist) {

    }

    public void swim(int distWater) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
