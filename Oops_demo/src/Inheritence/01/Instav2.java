package Inheritence;

public class Instav2 extends Instav1 {
    public static void main(String[] args) {
        Instav2 instagram = new Instav2();

        // keval location of message chnge hoga

        instagram.messageLocation = "left";
        System.out.println(instagram.messageLocation);
        instagram.searchBar();
    }
}
