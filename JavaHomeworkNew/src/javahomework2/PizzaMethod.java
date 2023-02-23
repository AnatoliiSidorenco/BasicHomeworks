package javahomework2;

public class PizzaMethod {

    public double squarePizza(double d, double P) {
        double resultSquare = (Math.pow(d, 2) * P) / 4;
        return resultSquare;
    }

    public double calories(double resultSquare, int minS) {
        double resultCalories = resultSquare * minS;
        return resultCalories;
    }

    public  double differenceCalories(double resultCalories2, double resultCalories1){
        double resultOver = resultCalories2 - resultCalories1;
        return resultOver;
    }

}
