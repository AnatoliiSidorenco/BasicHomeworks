package javaHomework1;

import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // todo----------------Task # 2------------------------

        String string = new String("I study Basic Java");

        takeString(string);

        int stringLength = string.length();
        System.out.println(stringLength);

        char lastSymbol = string.charAt(17);
        System.out.println(lastSymbol);

        String string2 = "Java";
        boolean stringContains = string.contains(string2);
        System.out.println(stringContains);

        String stringReplace = string.replace('a', 'o');
        System.out.println(stringReplace);

        String stringtoUp = string.toUpperCase();
        System.out.println(stringtoUp);

        String stringtoLow = string.toLowerCase();
        System.out.println(stringtoLow);

        String stringCut = string.substring(14, 18);
        System.out.println(stringCut);

        // todo ------------------Task # 3----------------------


        System.out.println("input first word : ");
        String textInputFirst = scanner.nextLine();
        System.out.println("your word is : " + textInputFirst);


        System.out.println("input Second word : ");
        String textInputSecond = scanner.nextLine();
        System.out.println("your word is : " + textInputSecond);


        int stringLengthFirst = textInputFirst.length();
        int stringLengthSecond = textInputSecond.length();

        System.out.println(stringLengthFirst);
        System.out.println(stringLengthSecond);

        String halfWordFirst = textInputFirst.substring(0, 3);
        String halfWordSecond = textInputSecond.substring(3, 6);
        System.out.println("your new word is : " + halfWordFirst + halfWordSecond);


        // todo------------------task # 4 ------------------------------

        System.out.println("your result of summary is : " + sumNumbers());
        System.out.println("your result of difference is : " + diffNumbers());
        System.out.println("your result of multiplication is : " + multNumbers());
        System.out.println("your result of division is : " + divNumbers());

        System.out.println(numNum(5,3));


    }

    public static void takeString(String string) {
        System.out.println(string);

    }

    public static int sumNumbers() {  // Ниже 4 метода только для вычесление, в будущем я не планирую
                                        // изпользовать эти значения, поэтому ввод чисел я описал здесь!
                                    // В ином случае ввод чисел я записал бы в другом месте(todo single responsibility principle)
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        return sum;

    }

    public static int diffNumbers() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int minus = a - b;
        return minus;
    }

    public static int multNumbers() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int mult = a * b;
        return mult;
    }

    public static double divNumbers() {
        double a = scanner.nextInt();
        int b = scanner.nextInt();
        double div = a / b;
        return div;
    }
    public static double numNum(double x,int y){
        return x/y;
    }
}