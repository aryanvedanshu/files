public class thro {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age > 18) {
                System.out.println("Go");
            } else {
                throw new IllegalArgumentException("age too low");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}