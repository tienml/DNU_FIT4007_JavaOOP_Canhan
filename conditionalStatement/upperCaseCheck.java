import java.util.Scanner;

public class upperCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean allLowercase = true;
        System.out.print("Enter a character: ");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch < 'A' || ch > 'Z') {
                allLowercase = false;
            }
        }
        if (allLowercase) {
            System.out.println(input + " characters are uppercase letters.");
        } else {
            System.out.println(input + " not characters are uppercase letters.");
        }
        sc.close();
    }
}
