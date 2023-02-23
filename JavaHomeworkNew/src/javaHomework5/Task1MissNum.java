package javaHomework5;
//1. Дан массив размера  N-1  , который должен содержать только целые числа в диапазоне от  1 до N .
// Каждое число представлено в одном экземпляре, кроме одного числа.  Найдите недостающий элемент.

//Пример 1:
//Вход:
//N = 5
//А[] = {1,2,3,5}
//Ответ: 4
//Пример 2:
//Вход:
//N = 10
//А[] = {6,1,2,8,3,4,7,10,5}
//Ответ: 9
public class Task1MissNum {
    public static void main(String[] args) {
        int[] createdArray = {1, 3, 5, 2};
        System.out.println(findMissingElement(createdArray,5));
    }



    public static int findMissingElement(int[] array, int n) {
        int myNumber = 0;
        int sumOfAllNumbers = (n * (n + 1)) / 2;  //по формуле  Гаусса n*(n+1)/2
        int sumOfArrayNumbers = 0;

        for (int i = 0; i < array.length; i++) {
            sumOfArrayNumbers = sumOfArrayNumbers + array[i];
//            System.out.println(sumOfArrayNumbers); //проверка сумы чисел  1+3+5+2 = 11
        }

        myNumber = sumOfAllNumbers - sumOfArrayNumbers;

        return myNumber;
    }
}
