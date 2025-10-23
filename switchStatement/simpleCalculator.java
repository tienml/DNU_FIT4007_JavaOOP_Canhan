import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer a: ");
        int a = sc.nextInt();
        System.out.print("Enter integer b: ");
        int b = sc.nextInt();
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);
        int result = 0;
        boolean valid = true;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero!");
                    valid = false;
                }
                break;
            case '%':
                if (b != 0) {
                    result = a % b;
                } else {
                    System.out.println("Error: Modulo by zero!");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                valid = false;
        }
        if (valid) {
            System.out.println(a + " " + op + " " + b + " = " + result);
        }
        sc.close();
    }
}
