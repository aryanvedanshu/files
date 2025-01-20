import java.util.*;
//import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int salary = 500;
        System.out.println("Salary: " + salary);
        char Gender = 'M';
        System.out.println("Gender: " + Gender);
        // boolean eligible = false;

        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Please enter age: ");
        age = sc.nextInt();
        if (age < 18) {
            int leftage = 18 - age;
            System.out.println("Reject as you are only " + age + " years old. come back after " + leftage + " years.");
        } else {
            System.out.println("You are " + age + " years old hence accepted");
        }
        sc.close();
    }
}