package javaHomework5;

public class Task2Explanation {
    public static void main(String[] args) {

        int[] arr = {1, 5, 7, 1}; // n-раз = 4
//        int arr[] = {1, 1, 1, 1};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Вывод элемента после первого  прохождения по массиву  -------  " + arr[i]);
            System.out.println("---------------------------------------" );
            for (int j = i +1 ; j < arr.length; j++) {
                System.out.println(arr[j] + " ----- arr[j]   "); // где n-раз количество элементов массива после первого прохождения
//               arr[j] -- элементы всего массива сразу
                System.out.println(arr[i] + " -- arr[i] ");
//               arr[i] -- 1 (каждый) элемент массива n-раз при условии что j = 0; но проблема что пар больше, надо отсекать

 //             j = i + 1 -- все элементы сразу с каждым элементом массива по отдельности / кроме первого элемента arr[j], я его сразу отсек
//                 получилось 3 проверки
//            при j = i -- 4 проверки

                if (arr[i] + arr[j] == 6){ // 6 -- это К сума двух чисел
                    count++;
                }

            }
        }

        System.out.println(" Количество --------- " + count);
    }
}

