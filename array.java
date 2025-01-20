public class array {
    public static void main(String[] args) {
        // Static Declarations
        int[] array = { 100, 200, 300, 5000, 400 };
        System.out.println(array.hashCode());
        // int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (max < array[i]) {
                max = array[i];
            } else {
                System.out.println("lol");
            }

            if (min > array[i]) {
                min = array[i];
            }

        }

        System.out.println(min);
        System.out.println(max);
    }
}
