import java.util.Scanner;

public class compareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String a = sc.nextLine();
        System.out.print("Enter the second string: ");
        String b = sc.nextLine();
        if (a.equals(b)) {
            System.out.println("The two strings are the same.");
        } else {
            System.out.println("The two strings are different.");
        }
        sc.close();
    }
}
