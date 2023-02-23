package javahomework2;

public class Pizza {
    public static void main(String[] args) {

        double d =24; // я могу просто указать double d и тогда прописывать самому значение в скобках.
                        // И в методе я пишу простую переменную например double d, а подставляю в нее любое значение,
                         // и необизательно создавать через new два экземпляра, а просто создать две переменные
                          // в которые я запишу в одну значение с d1 а во вторую d2 так как метод уневерсален,
                        // а я ищу два значения для одного результата перебор калорий.
        /* Тоисть можно создать екземпляр один, создать переменную а и в, а = екземпляр.метод(double d1, int minSquare)
         и  в = екземпляр.метод(double d2, int minSquare). А в переменную с = екземпляр.последний метод (переменная а, переменная в)
         */
        double d1 = 28;
        int minSquare;
        double P;

        PizzaMethod first = new PizzaMethod();
        double resultPizza1Square = first.squarePizza(d,3.14);
        System.out.println(resultPizza1Square);

        double resultCalories1 = first.calories(resultPizza1Square,40);
        System.out.println(resultCalories1);

        PizzaMethod second = new PizzaMethod();
        double resultPizza2Square = second.squarePizza(d1,3.14);
        System.out.println(resultPizza2Square);

        double resultCalories2 = second.calories(resultPizza2Square,40);
        System.out.println(resultCalories2);

        PizzaMethod tooManyCalories = new PizzaMethod();
        double resultTooManyCalories = tooManyCalories.differenceCalories(resultCalories2,resultCalories1);
        Math.round(resultTooManyCalories);
        System.out.println("Your bust in calories is : " + Math.round(resultTooManyCalories));




        }

}
