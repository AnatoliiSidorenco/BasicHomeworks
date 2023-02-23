package javaHomework4;

public class DemoArrayTasks {   // Общий метод для создания массива


    int[] createArray(int arraySize) {
        int[] createdArray = new int[arraySize];
        return createdArray;
    }

    public void randomArray(int[] createdArray, int min, int max) { // метод заполнения массива случайными числами(Task-1)


        for (int i = 0; i < createdArray.length; i++) {
            createdArray[i] = (int) (Math.random() * (max - min + 1) + 1);

        }
    }

    public void arrayOfPairs(int[] createdArray) {// метод  Замены каждого элемента с нечётным индексом на ноль
        for (int i = 0; i < createdArray.length; i++) {
            if (createdArray[i] % 2 != 0) {
                createdArray[i] = 0;
            }
        }
    }

}


