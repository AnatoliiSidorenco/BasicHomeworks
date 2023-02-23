package javaHomework1;

import java.util.Scanner;

public class CurrencyConverterMain {
    public static void main(String[] args) {

        CurrencyConverterTest currencyConverterTest = new CurrencyConverterTest();

        Scanner scanner = new Scanner(System.in);

        System.out.println("input currency : ");

        double inputCurrency = scanner.nextDouble();
        double resultDollar = currencyConverterTest.currencyConverter(inputCurrency);

        System.out.println("your result is : " + resultDollar);


        currencyConverterTest.currencyEuro = scanner.nextDouble();
        double resultDollar1 = currencyConverterTest.currencyConverter();

        System.out.println("your result is : " + resultDollar1);



    }

}
