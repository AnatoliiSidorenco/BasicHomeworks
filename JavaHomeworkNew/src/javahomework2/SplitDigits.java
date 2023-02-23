package javahomework2;

public class SplitDigits {
    public static void main(String[] args) {

        // Сколько раз помещаеться 1000 в 200 235 ( 200235 % 1000)  ----- 200 000 раз. 2000235 - 200 000 = 235 -- остаток(num % 1000 = 235 остаток от деления).
        // мне надо выделить число 2 из 235 -- оно находиться в сотих, делю на 100 ((num % 1000)/100) результат в выводе 2 (d)(int обрезает хвост)

        int num = 200345;
        int a = num / 100000;
        int b = (num % 100000) / 10000;
        int c = (num % 10000) / 1000;
        int d = (num % 1000) / 100;
        int e = (num % 100) / 10;
        int f = (num % 10);

        System.out.println("The digits of the number 200345 are: " + a + ", " + b + ", " + c + ", " + d + ", " + e + " ," + f);


    }
}
