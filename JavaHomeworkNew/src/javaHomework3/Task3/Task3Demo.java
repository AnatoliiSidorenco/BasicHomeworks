package javaHomework3.Task3;

/*этот метод связан с Task3Main*/

public class Task3Demo {

    int temperature1;
    int temperature2;

    public Task3Demo(int temperature1, int temperature2) {
        this.temperature1 = temperature1;
        this.temperature2 = temperature2;
    }

    public boolean workGood() {
        if (temperature1 > 100 && temperature2 < 100) {
            return true;
        } else {
            return false;
        }
    }
    public void setTemperature1(int temperature1) {
        this.temperature1 = temperature1;
    }

    public void setTemperature2(int temperature2) {
        this.temperature2 = temperature2;
    }
}
