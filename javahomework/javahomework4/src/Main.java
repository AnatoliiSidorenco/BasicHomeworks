public class Main {
    public static void main(String[] args) {
        long a = 9000000000000000000l + 1000000000000000000l;
        System.out.println(a);

        short b;
        float c;
        c = 35.58888888888f;
        b = (short)c;
        System.out.println(b);

        b = 15;
        c = b;
        System.out.println(c);


        Stringa stringa = new Stringa("Hi over there!");

        stringa.strOut();

        stringa.printUp();

        stringa.printLength();
    }
}