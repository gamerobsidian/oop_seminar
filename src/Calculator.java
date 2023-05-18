import java.util.Scanner;

public class Calculator {
    private final int precision;

    public Calculator(int precision) {
        this.precision = precision;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        double scale = Math.pow(10.0, precision);
        return Math.round(result * scale) / scale;
    }

    public double div(double a, double b) {
        double result = a / b;
        if (b == 0) {
            return result;
        } else {
            double scale = Math.pow(10.0, precision);
            return Math.round(result * scale) / scale;
        }
    }

    public void calculateNumbers(){
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator(2);
        System.out.println("Enter the first number: ");
        double inputFirstNumber = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double inputSecondNumber = scanner.nextDouble();
        System.out.println("Enter operator (+, -, *, /):");
        char operation = scanner.next().charAt(0);
        while (true){
            switch (operation){
                case '+':
                    System.out.println("Result: " + calculator.add(inputFirstNumber, inputSecondNumber));
                    break;
                case '-':
                    System.out.println("Result: " + calculator.subtract(inputFirstNumber, inputSecondNumber));
                    break;
                case '*':
                    System.out.println("Result: " + calculator.multiply(inputFirstNumber, inputSecondNumber));
                    break;
                case '/':
                    System.out.println("Result: " + calculator.div(inputFirstNumber, inputSecondNumber));
                    break;
                default:
                    System.out.println("Not a correct character");
            }
            System.out.println("Do you want to continue? (Y/N)");
        }
    }
}