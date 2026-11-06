import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int add = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;

        System.out.println("\nSum: " + add);
        System.out.println("Difference: " + subtract);
        System.out.println("Product: " + multiply);

        if(num2 != 0) {
            int divide = num1 / num2;
            System.out.println("Quotient: " + divide);
        }
        else {
            System.out.println("Quotient: " + "You cannot divide by zero");
        }

        if(num2 != 0) {
            int modulus = num1 % num2;
            System.out.println("Remainder: " + modulus);
        }
        else {
            System.out.println("Remainder: " + "You cannot divide by zero");
        }

        scanner.close();

    }
}
