package ru.gb.Java_Erlan.lesson_3;

public class Lesson_continue {
    public static void main(String[] args) {
        /*
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomInt = random.nextInt(10);
            System.out.println("следующее случайное число = " + randomInt);
        }
         */
        //   printData(32, "Катя", 200000);
        /*
        String myFullName = "Kate Zaitseva";
        System.out.println(myFullName);

        String name = "Kate";
        String lastName = "Zaitseva";
        String newName = name + " " + lastName;
        System.out.println(newName);

         if (myFullName.equals(newName)) {   // String и большие числа через == нельзя сравнивать
             System.out.println("идентично"); // нужно использовать метод .equals(в параметр передаем вторую переменную)
         }else {                               // (всегда при сравнении объектных типов)
             System.out.println("Ошибка");
         }

         */
/*
        printData (32, "Kate", 205.89);
        printData (36, "Andrey", 300.56);
        printData(16, "Maks", 108.89 );

 */

        String name = "Katya";

        char c = name.charAt(3); // Нахождение симыола в строке по индексу
        System.out.println(c);
    }


    public static void printData(int age, String name, double averageSalary) {
        //  System.out.println("Возраст: " + age + " , Имя: " + name + ", Средняя зп:" + averageSalary);
        System.out.printf(" возраст %5d, Имя %10s, зп %10f\n", age, name, averageSalary);
    }


}
