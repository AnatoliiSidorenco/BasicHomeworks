public class Stringa {
    String str ;

    public Stringa(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
    public void strOut(){
        System.out.println(str);
    }
    public void printUp(){
        System.out.println(str.toUpperCase());
    }

    public void printLength(){
        System.out.println(str.length());
    }
}


