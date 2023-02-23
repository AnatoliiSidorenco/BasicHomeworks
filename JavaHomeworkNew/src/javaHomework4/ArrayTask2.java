package javaHomework4;

public class ArrayTask2 {


    public boolean arrayOfGrewUp(int[] createdArray) { // метод проверки массива  является ли массив строго возрастающей последовательностью или нет (Task-2)
        boolean justice = true;
        for (int i = 0; i < createdArray.length - 1; i++) {
            if (createdArray[i] >= createdArray[i + 1]) {
                justice = false;
            }

        }

        return justice;
    }

    public void compare(int[] createdArray) {  // в зависимости от ответа в методе  arrayOfGrewUp, выводиться сообщение (Task -2)
        if (arrayOfGrewUp(createdArray)) {
            System.out.println(" массив является строго возрастающей последовательностью ");
        } else System.out.println("массив не является строго возрастающей последовательностью");
    }


}
