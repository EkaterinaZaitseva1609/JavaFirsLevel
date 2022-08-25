package ru.gb.lesson7;

import ru.gb.lesson_6.animals.Animal;

public class ScienceFiction extends Books {


    public ScienceFiction(String bookName, String bookAuthor) {
        super(bookName,  500, bookAuthor, "America", "english", 4000);
    }

    @Override
    public void getSale(int page, int price) {
        int finalPrice = 0;
        if (super.page < 300) {
            finalPrice = price / 2;
            System.out.println(finalPrice + " р. Финальная цена со скидкой 50%");
        } else {
            System.out.println("книга " + name + " продается без скидки. На данный момент цена составляет " + price + " р.");
        }
    }
}
