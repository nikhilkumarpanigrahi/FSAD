import java.util.*;
public class calculator {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result = add(a, b);
        int subResult = subtract(a, b); 
        System.out.println("Sum: " + result);
        System.out.println("Difference: " + subResult);
        result = multiply(a, b);
        System.out.println("Product: " + result);
        result = divide(a, b);
        System.out.println("Quotient: " + result);}
}
