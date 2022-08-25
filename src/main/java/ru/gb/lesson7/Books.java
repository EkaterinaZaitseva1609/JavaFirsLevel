package ru.gb.lesson7;

public class Books {

    protected final String name;

    protected final int page;
    protected final String author;
    protected final String country;
    protected String language;
    protected int price;

    public Books (String bookName, int bookPage, String bookAuthor, String bookCountry, String bookLanguage, int bookPrice) {
        this.name = bookName;
        this.page = bookPage;
        this.author = bookAuthor;
        this.country = bookCountry;
        this.language = bookLanguage;
        this.price = bookPrice;
    }
    public void getSale(int page, int price) {
        System.out.println("Не поддерживаемый метод");
    }


}
