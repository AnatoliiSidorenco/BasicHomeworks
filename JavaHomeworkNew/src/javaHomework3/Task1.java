package javaHomework3;

/* Создайте две переменные isWeekend и isRain. Создайте переменную canWalk, значение которой должно быть истинным,
если это выходной день (isWeekend=true) и не идет дождь (isRain=false).*/


public class Task1 {
    public static void main(String[] args) {

       boolean isWeekend = true;
       boolean isRain = false;

       if (isWeekend && !isRain) {
           boolean canWalk = true;
           System.out.println(canWalk);
       }

    }

}
