package ru.gb.Java_Erlan.lesson_8;

public abstract class Employees {

    protected String name;
    protected final int salary;
    protected final int idNumb;
    protected boolean isMarried;
    protected boolean isPortfolio;
    protected String phrase;

    public Employees(String impName, int impSalary, int impIdNumb, boolean isMarriedImp, boolean isImpPortfolio, String ImpPhrase) {
        this.name = impName;
        this.salary = impSalary;
        this.idNumb = impIdNumb;
        this.isMarried = isMarriedImp;
        this.isPortfolio = isImpPortfolio;
        this.phrase = ImpPhrase;

    }
   public abstract void getNewSalary(boolean isPortfolio);

    public abstract void sayFavoritePhrase();

}
