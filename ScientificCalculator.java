import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;
        boolean exitFlag = false;

        while (!exitFlag) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Sine");
            System.out.println("7. Cosine");
            System.out.println("8. Logarithm");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    result = num1 + num2;
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                        continue;
                    }
                    break;

                case 5:
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                    } else {
                        System.out.println("Error: Cannot calculate square root of a negative number.");
                        continue;
                    }
                    break;

                case 6:
                    System.out.print("Enter the angle in degrees: ");
                    num1 = scanner.nextDouble();
                    result = Math.sin(Math.toRadians(num1));
                    break;

                case 7:
                    System.out.print("Enter the angle in degrees: ");
                    num1 = scanner.nextDouble();
                    result = Math.cos(Math.toRadians(num1));
                    break;

                case 8:
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    if (num1 > 0) {
                        result = Math.log(num1);
                    } else {
                        System.out.println("Error: Cannot calculate logarithm of a non-positive number.");
                        continue;
                    }
                    break;

                case 9:
                    exitFlag = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println("Result: " + result);
            System.out.println();
        }

        scanner.close();
    }
}

