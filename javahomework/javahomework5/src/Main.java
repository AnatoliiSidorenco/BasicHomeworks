import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] forest = new int[10];
       plantTree(forest);
    }

    public static void plantTree (int [] forest){
        for (int i = 0; i < forest.length; i++){
            forest[i] = i;
            System.out.println(forest[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for ( ; ; ) {
            int num = scanner.nextInt();
            sum += num;
            System.out.println("our sum is : " + sum);

//
            if (num == 0) {
                break;
            }


        }

    }

}