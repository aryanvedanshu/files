public class Exep {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 55, 65 };

        int x = 23;
        int y = 0;

        try {
            int result = x / y;
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("irrespective of exception it will run");
        }
        try {
            System.out.println(arr[-1]);
        }

        catch (Exception e) {
            // System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}