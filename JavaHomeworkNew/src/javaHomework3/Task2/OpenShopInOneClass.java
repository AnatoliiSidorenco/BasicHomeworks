package javaHomework3.Task2;

/*Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
 Реализует логический метод canBuy,, возвращающий true ** Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
 Отобразите строку «Я могу купить еду, это ……» и значение.*/


public class OpenShopInOneClass {
    public static void main(String[] args) {

        boolean isEdekaOpen = false;
        boolean isReweOpen = false;



        System.out.println("I can buy food, this is " + canBuy(isEdekaOpen,isReweOpen));

    }

  static   public boolean canBuy(boolean isEdekaOpen, boolean isReweOpen){

        if (isEdekaOpen || isReweOpen) {

            return   true;
        }
        else {

            return false;
        }

    }

}
