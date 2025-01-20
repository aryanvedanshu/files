public class method_overloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void chai(int qty) {
        System.out.println("chai req are " + qty);
    }

    public static void chai(int qty, int sugar) {
        System.out.println("chai req are " + qty);
    }

    public static void acc_name(String F_name) {
        System.out.println("Hi " + F_name);
    }

    public static void acc_name(String F_name, String L_name) {
        System.out.println("Hi " + F_name + " " + L_name);
    }

    public static void acc_name(String F_name, String M_name, String L_name) {
        System.out.println("Hi " + F_name + " " + M_name + " " + L_name);
    }

    public static void main(String[] args) {
        sum(43, 34);
        sum(43, 6, 98);
        sum(54, 78, 54, 80);

        chai(3);
        chai(3, 1);

        acc_name("Aryan");
        acc_name("Aryan", "Goel");
        acc_name("Aryan", "Kumar", "Goel");

    }
}
