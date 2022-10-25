package ru.gb.java_Sergey.lection1GB;

public class seminar_1task2 {
    static int position = 0;
    static int[] storage = new int[11];

    static void clear() {
        position = 0;
        int size = storage.length;
        for (int i = 0; i < size; i++) {
            storage[i] = 0;
        }
    }

    static void print() {
        for (int i = 0; i < storage.length; i++) {
            System.out.print(storage[i] + " ");
        }
        System.out.println();
    }

    static void shift() {
        for (int i = 0; i <= position; i++) {
            storage[i] = storage[i + 1];
        }
        storage[position] = 0;
        position--;
    }

    static void add(int item) {
        if(position>= storage.length)
            return;
        storage[position] = item;
        position++;

    }

    static int remove() {
        int el = storage[0];
        shift();
        return el;
    }

    public static void main(String[] args) {
        print();
        add(1);
        print();
        add(22);
        print();
        System.out.println(remove());
        print();
    }
}
