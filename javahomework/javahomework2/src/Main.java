public class Main {
    public static void main(String[] args) {
        name("Tolik");

        System.out.println(mult(13.5, 15.14));

        Family family = new Family("Tolik", "Inna", "Daniel");
        System.out.println("we are family of three : " + "\n" + " 1: " + family.getFather() + " 2: " + family.getMother() + " 3: " + family.getChild());

    }

    static void name(String person){
        System.out.println("имя : " + person);
    }

    static double mult(double x, double y){
        return x*y;
    }
}

