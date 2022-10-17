package ru.gb.Java_Erlan.lesson_8;

public class Programmers extends Employees {

    protected int grade;


    public Programmers(String impName, int impIdNumb, int impGrade, boolean isMarriedImp, boolean isImpPortfolio, String ImpPhrase) {
        super(impName, 150000, impIdNumb, isMarriedImp, isImpPortfolio, ImpPhrase);

    }

    @Override
    public void getNewSalary(boolean isImpPortfolio) {
        int resultSalary = 0;
        if (isImpPortfolio) {
            resultSalary =  super.salary + 50000;
            System.out.println(this.name + " поздравляем вас с повышением заработной платы, теперь она составляет = " + resultSalary + "р. с учетом налогов. Служба персонала.");
        } else {
            System.out.println(this.name + " ждем ссылку на ваш репозиторий. Служба персонала.");
        }
    }
    @Override
    public void sayFavoritePhrase() {
        System.out.println("Дизайнеры, вперед!" );
    }

}
