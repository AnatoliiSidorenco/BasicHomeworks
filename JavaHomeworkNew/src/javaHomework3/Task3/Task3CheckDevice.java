package javaHomework3.Task3;

/*Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно, если температура первой колбы выше 100 градусов,
а температура второй колбы меньше 100 градусов. Вы должны написать метод, который проверяет это устройство.
Ваша программа должна иметь переменные Temperature1 и Temperature2. В результате он выводит сообщение true или false.
 */

public class Task3CheckDevice {
    public static void main(String[] args) {

        int temperature1 = 0;
        int temperature2 = 0;
        boolean workGood;

        if (temperature1 > 100 && temperature2 < 100 ){
            workGood = true;
         }
         else { workGood = false;
         }
        System.out.println("-------A-------");

        System.out.println(workGood);

        System.out.println("-------B------");

        System.out.println(checkDevice(163,97));
    }

    public static boolean checkDevice(int temper1, int temper2){
        if (temper1>100 && temper2<100) {
            return true;
        }else {
            return false;
        }
    }

}
