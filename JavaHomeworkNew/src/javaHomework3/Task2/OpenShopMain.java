package javaHomework3.Task2;

/*Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
 Реализует логический метод canBuy,, возвращающий true ** Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
 Отобразите строку «Я могу купить еду, это ……» и значение.*/

public class OpenShopMain {
    public static void main(String[] args) {
        OpenShopDemo isOpen = new OpenShopDemo();
        boolean isEdekaOpen = true;
        boolean isReweOpen = true;
        isOpen.canBuy(isEdekaOpen,isReweOpen);


        isOpen.printOut ("Я могу купить еду, это …… " , isOpen.canBuy(isEdekaOpen,isReweOpen));


    }
}
