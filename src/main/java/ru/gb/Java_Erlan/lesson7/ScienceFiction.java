package ru.gb.Java_Erlan.lesson7;

public class ScienceFiction extends Books {

    protected String bootType;

    public ScienceFiction(String bookName, String bookAuthor, boolean isSC) {
        super(bookName,  500, bookAuthor, "America", "english", 4000);
        if(isSC==true){
            this.bootType = "sc";
        } else {
            this.bootType = "";
        }

    }

    @Override
    public void getSale(int myBookPage, int price) {
        int finalPrice = 0;
        if (myBookPage < 300) {
            finalPrice = price / 2;
            System.out.println(finalPrice + " р. Финальная цена со скидкой 50%");
        } else {
            System.out.println("книга " + name + " продается без скидки. На данный момент цена составляет " + price + " р.");
        }
    }
}
