//import java.lang.reflect.Method;

public class method_question {
    static void sayHello() {
        System.out.println("Hello");
        // return "Hello";
    }

    static String evem_odd(int num) {
        int result = num % 2;
        if (result == 0)
            return "Even";
        return "odd";
    }

    static void even_odd(int num) {
        int result = num % 2;
        if (result == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        sayHello();
        method_question.sayHello();

        System.out.println(evem_odd(3));
        even_odd(40);

    }
}
