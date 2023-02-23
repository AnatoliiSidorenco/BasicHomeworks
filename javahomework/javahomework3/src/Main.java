import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);   /* TODO на практическом уроке вашу задачу с * мы разобрали, я ее понял  но заслуга не моя!!! */

    /*  todo Первые две задачи по д/з зделал сам!!!*/
    public static void main(String[] args) {

        input();

        System.out.println("Result = " + sumOfThree());


        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("My result = " + diffNumbers(firstNumber, secondNumber));
    }

    static void input(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(" a = " + a + " b = " + b);
    }

    static int sumOfThree(){
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        return c + d + e;
    }

    static int diffNumbers(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

}