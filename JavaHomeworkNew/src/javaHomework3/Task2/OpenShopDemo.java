package javaHomework3.Task2;

/*этот метод связан с OpenShopMain*/


public class OpenShopDemo {

    public boolean canBuy(boolean isEdekaOpen, boolean isReweOpen){
        if ( isEdekaOpen ||  isReweOpen){

            boolean result;
            return result = true;
        } else {
            boolean result;
            return result = false;
        }
    }

    public void printOut(String text, boolean answer){
        String message;
        if (answer){
            System.out.println(message = text + answer);
        }else {
            System.out.println(answer);
        }

    }

}
