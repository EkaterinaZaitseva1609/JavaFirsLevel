package ru.gb.Java_Erlan.lesson_8;

public class Designers extends Employees {

    protected int grade;
    protected boolean isPortfolio;

    public Designers(String impName, int impIdNumb, int impGrade, boolean isMarriedImp, boolean isImpPortfolio, String ImpPhrase) {
        super(impName, 130000, impIdNumb, isMarriedImp, isImpPortfolio, ImpPhrase);



    }
@Override
    public void getNewSalary(boolean isImpPortfolio) {
        int resultSalary = 0;
        if (isImpPortfolio) {
            resultSalary =  super.salary + 30000;
            System.out.println(this.name + " поздравляем вас с повышением заработной платы, теперь она составляет = " + resultSalary + "р. с учетом налогов. Служба персонала.");
        } else {
            System.out.println(this.name + " ждем ваше обновленное партфолио. Служба персонала.");
        }
    }
    @Override
public void sayFavoritePhrase() {
        System.out.println("Hello, World!" );
}


}


