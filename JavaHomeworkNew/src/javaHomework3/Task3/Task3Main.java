package javaHomework3.Task3;

/*Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно, если температура первой колбы выше 100 градусов,
а температура второй колбы меньше 100 градусов. Вы должны написать метод, который проверяет это устройство.
Ваша программа должна иметь переменные Temperature1 и Temperature2. В результате он выводит сообщение true или false.
 */

public class Task3Main {
    public static void main(String[] args) {

        Task3Demo device = new Task3Demo(101,99);

        System.out.println("------1-----");
        System.out.println(device.workGood());

        System.out.println("------2-----");

        device.setTemperature1(99);
        device.setTemperature2(101);
        System.out.println(device.workGood());

        System.out.println("------3------");

        device.temperature1 = 110;
        device.temperature2 = 0;
        System.out.println(device.workGood());
    }
}
