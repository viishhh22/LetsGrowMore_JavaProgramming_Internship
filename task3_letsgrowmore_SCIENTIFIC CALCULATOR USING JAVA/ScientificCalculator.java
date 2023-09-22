import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Square Root (√)");
            System.out.println("6. Exponentiation (^)");
            System.out.println("7. Quit");

            System.out.print("Enter your choice (1-7): ");
            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Goodbye!");
                break;
            }

            double result = 0.0;

            switch (choice) {
                case 1:
                    result = performAddition(scanner);
                    break;
                case 2:
                    result = performSubtraction(scanner);
                    break;
                case 3:
                    result = performMultiplication(scanner);
                    break;
                case 4:
                    result = performDivision(scanner);
                    break;
                case 5:
                    result = performSquareRoot(scanner);
                    break;
                case 6:
                    result = performExponentiation(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    private static double performAddition(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    private static double performSubtraction(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    private static double performMultiplication(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    private static double performDivision(Scanner scanner) {
        System.out.print("Enter the numerator: ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter the denominator: ");
        double denominator = scanner.nextDouble();
        if (denominator != 0) {
            return numerator / denominator;
        } else {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;
        }
    }

    private static double performSquareRoot(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Square root of a negative number is not allowed.");
            return Double.NaN;
        }
    }

    private static double performExponentiation(Scanner scanner) {
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        return Math.pow(base, exponent);
    }
}
