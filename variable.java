public class variable {
    static int a = 10;
    int b;

    public static int add_and_even(int a, int b) {
        int sum = a + b;
        int result = sum % 2;
        return result;
    }

    public static void main(String[] args) {
        int nresult = 38;
        System.err.println(nresult);
        float result = 392;
        System.err.println(result);
        double result2 = 39.202;
        System.out.println(result2);
        int even = add_and_even(2, 3);
        if (even == 0)
            System.out.println("even");
        System.out.println("odd");

        variable vr = new variable();
        vr.b = 20;
        System.out.println(vr.b);
        System.out.println(a);
    }
}
