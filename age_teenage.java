import java.util.*;

public class age_teenage {
    public static String getstatus(int age) {
        if (age <= 5)
            return " 0-5 range";
        else if (age > 5 && age <= 10)
            return "5-10 range";
        else if (age > 10 && age <= 15)
            return "10-15 range";
        else
            return "out of range";
    }

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        System.out.println(getstatus(age));
    }
}
