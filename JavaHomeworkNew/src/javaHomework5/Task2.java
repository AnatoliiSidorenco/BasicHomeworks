package javaHomework5;
/*Дан массив из N целых чисел и целое число  K , найдите количество пар элементов в массиве, сумма которых равна K.

Пример 1:
Вход:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Вывод: 2 пары чисел
Объяснение:
arr[0] + arr[1] = 1 + 5 = 6
arr[1] + arr[3] = 5 + 1 = 6.

Пример 2:
Вход:
N = 4, К = 2
arr[] = {1, 1, 1, 1}
Выход: 6 пар чисел

*/

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
//        int arr[] = {1, 1, 1, 1};
        System.out.println("количество пар -- " + countPairs(arr, 6));

    }

    public static int countPairs(int[] array, int k) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == k)
                    count++;

            }
        }

        return count;
    }

}

