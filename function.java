public class function {
    public static int checkage(int age) {
        if (age > 18)
            return 1;
        return -1;
    }

    void sum() {
        System.out.println("add" + (4 + 2));
    }

    public static void main(String[] args) {
        int age = 19;
        int m_number = 999999999;
        System.out.println(m_number + "is mobile ");
        int result = checkage(age);
        System.out.println(result);
    }
}
