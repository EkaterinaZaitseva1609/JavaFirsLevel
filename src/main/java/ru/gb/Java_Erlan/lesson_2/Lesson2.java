package ru.gb.Java_Erlan.lesson_2;

public class Lesson2 {
    /*  public static void printHello() {
          System.out.println("hello");
      }

      public static String getMyName() {
          return "Katya";
      }

      public static boolean isLessThanTen(int value) {
          System.out.println("Got" + value);
          return value < 10;
      }

      public static int culculate(int a, int b, int c, int d) {
          return a + b - (c / d);
      }

      public static void main(String[] args) {
          printHello();
          //  String res = getMyName();
          System.out.println(getMyName());
          System.out.println(isLessThanTen(10));
          System.out.println(culculate(1, 2, 3, 4));
      }

     */
//switch конструкция
    /*
    public static void main(String[] args) {
        int age = 10;
        System.out.println(checAge(age));
    }

    public static String checAge(int age) {

        switch (age) {
            case 6:
                return "garden";
            case 10:
                return "school";
            case 18:
                return "university";
            default:
                return "mistake";
        }
    }

     */
//циклы
// public static void main(String[] args) {

     /* for (int i = 0, j = 10; i<= j; i++, j--) {
          System.out.println("i = " + i + ", j = " + j);
      }
String[] array = {"Ivan", "kirill", "Petr"};
      for (String s : array) {
          System.out.println("Name = " + s);
      }
      */
// вложенные циклы (больше трех циклов обычно не делают, каждый цикл увеличивает по времени работу программы в 10 раз)
     /* for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 10; j++) {
              System.out.println("класс №" + i + " ученик №" + j);
          }
      }

      */
// неопределенные циклы (while)
     /* int age = 10;
      while (age >= 0) {
          System.out.println("age = " + age);
          age--;
      }
      */
// неопределенные циклы (do-while)
    /*  int a = 10;
      do {
          System.out.println("a = " + a);
      } while (a > 100);
*/
//массивы
// тип[] имя_массива = new тип [размер];
// int[] array = new int[3];
// тип имя_массива[] = new тип [размер];
// int array2[] = new int[3];
// тип[][] имя_массива = new тип [размер] [размер];
// тип[] имя_массива = {..., ..., ...};

// int[] array = new int[5];
// [0, 0, 0, 0, 0] = index 0, 1, 2, 3, 4
      /*  for (int index = 1; index <= 5; index++) {
            array[index - 1] = index + 1;
        }
        System.out.println(Arrays.toString(array));

       */
        /*
        int[] array = new int[] {70,10,2,38,7};
        for (int i : array) {
            System.out.println(" элемент массива = " + i );
        }

        String[] strArray = {"One", "two", "three"};
        for (String str : strArray) {
            System.out.println(" we have: " + str);
            }
         */

// двумерный массив

//  boolean[][] matrix = new boolean[4][3];
// [
// [false,  false,  false],  0
// [false,  false,  false],  1
// [false,  false,  false],  2
// [false,  false,  false],  3
// ]
//   matrix[0][2] = true;

//  int[][] matrix = new int[4][3];
//   matrix[1][2] = 1;

//y
//| 0, 0, 0
//| 0, 0, 0
//| 0, 0, 0
//| 0, 0, 0
//------------> x
// matrix [y][x]

//вывод массива в консоль
/*
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                System.out.print(matrix[y][x] + " ");
            }
            System.out.println();
            
        }
        

      /*  char[] charArray = {'b', 'c', 'd'};
        int length = charArray.length;


    }
}
*/


// Домашнее задание

    public static void getMinAndMax(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент массива = " + min + ". Максимальный элемент массива = " + max);
    }

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    // граница показана символами ||, эти символы в массив не входят.

    public static boolean checkBalance (int[] array) {
        for (int i = 0; i < array.length; i++) {
            int rhs = 0, lhs = 0;
            for (int k = 0; k < array.length; k++) {
                if (k > i) {
                    lhs += array[k];
                } else {
                    rhs += array[k];
                }
            }
            if (rhs == lhs) {
                return true;
            }
        }
        return false;
    }


   // 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен
    // сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Вариант №1 [1, 2, 3, 4, 5, 6]  сместить на 2 -> [5, 6, 1, 2, 3, 4]
    //Вариант №2 [5, 6, 7] сместить на -5 -> [7, 5, 6]






        public static void main (String[]args){

           // int[] arr = {1, 1, 1, 1};
            //boolean res = checkBalance(arr);
            //System.out.println(res);


            // int[] array = {3, 4, 8, 2, 5};
            //getMinAndMax(array);

        /*
     int[] mass = {0, 1, 1, 0, 0, 0};
        for (int i = 0; i < mass.length; i++) {
           if (mass[i] == 0) {
               mass [i] = 1;
           } else {
               mass [i] = 0;
           }
            System.out.println(mass[i]);
        }
         */
        /*
         int[] array = new int [8];
        for (int i = 0; i < array.length; i++) {
            array [i] = (int)(Math.random()*10)+1;
            System.out.println(array[i]);
        }

         */
/*
int [] mass = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 6) {
                mass[i] *= 2;
            }
            System.out.println(mass[i]);
        }

 */

           // int[][] mass = new int[4][4];
        /*
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                if (i == j) {
                    mass[i][j] = 1;
                }
                System.out.print(mass[i][j] + " ");
            }
        }
        System.out.println();
    }

         */
        /*
        for (int i = 0; i < mass.length; i++) {
            mass[i][i] = 1;
            mass[i][mass.length - i - 1] = 1;
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

         */

            //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        /*
        int[] array = {3, 4, 8, 2, 5};
        int max = array [0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min + ", " + max);

         */

        }

    }

