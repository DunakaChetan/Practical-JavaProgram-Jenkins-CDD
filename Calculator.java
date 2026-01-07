/**
 * Basic Calculator Program
 * Demonstrates addition, subtraction, multiplication, and division
 */
public class Calculator {

    public static void main(String[] args) {
        int a = 20;
        int b = 5;

        System.out.println("================================");
        System.out.println("   BASIC CALCULATOR PROGRAM");
        System.out.println("================================");
        System.out.println();
        System.out.println("Number 1: " + a);
        System.out.println("Number 2: " + b);
        System.out.println();
        System.out.println("--- Results ---");
        System.out.println("Addition:       " + a + " + " + b + " = " + add(a, b));
        System.out.println("Subtraction:    " + a + " - " + b + " = " + subtract(a, b));
        System.out.println("Multiplication: " + a + " x " + b + " = " + multiply(a, b));
        System.out.println("Division:       " + a + " / " + b + " = " + divide(a, b));
        System.out.println();
        System.out.println("================================");
        System.out.println("   BUILD SUCCESSFUL!");
        System.out.println("================================");
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }
}
