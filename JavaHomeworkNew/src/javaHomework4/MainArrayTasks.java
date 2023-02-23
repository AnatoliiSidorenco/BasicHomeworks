package javaHomework4;

//Task - 1   Создайте массив из 8 случайных целых чисел из интервала [1;50]
//     Выведите массив на экран в строку
//     Замените каждый элемент с нечётным индексом на ноль
//     Снова выведете массив на экран на отдельной строке
//Task - 2   Создайте массив из 5 случайных целых чисел из интервала [10;99]
//    Выведите его на экран в строку.
//    Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.

import java.util.Arrays;

public class MainArrayTasks {
    public static void main(String[] args) {
        DemoArrayTasks demoArray = new DemoArrayTasks();
        ArrayTask2 newArray = new ArrayTask2();


        int[] myFirstArray = demoArray.createArray(8);
//        System.out.println(Arrays.toString(myFirstArray));  проверка или создает массив(все элементы ноль)

        demoArray.randomArray(myFirstArray, 1, 50);
        System.out.println("Task1 -- Первый масив из случайных чисел   :  " + Arrays.toString(myFirstArray));

        demoArray.arrayOfPairs(myFirstArray);
        System.out.println("Task1 -- Изменённый массив   :   " + Arrays.toString(myFirstArray));

        System.out.println("---------------------------------------------------------------");

        int[] mySecondArray = demoArray.createArray(5);
        demoArray.randomArray(mySecondArray, 10, 99);
        System.out.println("Task2 --  " + Arrays.toString(mySecondArray));

        newArray.arrayOfGrewUp(mySecondArray);
        newArray.compare(mySecondArray);

        System.out.println("\n ------------Проверка---------------- \n");

        int[] myThirdArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(myThirdArray));

        newArray.arrayOfGrewUp(myThirdArray);
        newArray.compare(myThirdArray);


    }

}
