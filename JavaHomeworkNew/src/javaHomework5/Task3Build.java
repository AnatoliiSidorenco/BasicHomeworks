package javaHomework5;

// Дано два числа, например 3 и 56, значение которых хранятся в переменных.
//a)Необходимо составить следующие текстовые строки:
//3 + 56 = 59
//3 – 56 = -53
//3 * 56 = 168.
//Используйте метод StringBuilder.append().
//b)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
//c)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

public class Task3Build {
    public static void main(String[] args) {

        StringBuilder stringFirst = new StringBuilder();

        stringFirst.append(3);
        stringFirst.append("+");
        stringFirst.append(56);
        stringFirst.append("=");
        stringFirst.append(59);


        System.out.println(stringFirst);

        stringFirst.deleteCharAt(4);

        stringFirst.insert(4," равно ");
        System.out.println(stringFirst);

        System.out.println("-------------------------");

        StringBuilder stringSecond = new StringBuilder();

        stringSecond.append(3);
        stringSecond.append("-");
        stringSecond.append(56);
        stringSecond.append("=");
        stringSecond.append("-");
        stringSecond.append(53);


        System.out.println(stringSecond);

        stringSecond.replace(stringSecond.indexOf("="), stringSecond.indexOf("=") + 1, " равно ");
        System.out.println(stringSecond);

        System.out.println("--------------------------");

        StringBuilder stringThird = new StringBuilder();

        stringThird.append(3);
        stringThird.append("*");
        stringThird.append(56);
        stringThird.append("=");
        stringThird.append(168);

        System.out.println(stringThird);

        //Method 1


//        stringThird.deleteCharAt(stringThird.length() - 1);
//        stringThird.insert(stringThird.length(), " equals");

//Method 2
//        stringThird.replace(stringThird.length() - 1, stringThird.length(), " equals");

//        System.out.println(stringThird);


    }
}

