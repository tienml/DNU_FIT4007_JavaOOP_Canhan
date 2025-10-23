import java.util.Scanner;

public class lowerCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean allLowercase = true;
        System.out.print("Enter a character: ");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch < 'a' || ch > 'z') {
                allLowercase = false;
            }
        }
        if (allLowercase) {
            System.out.println(input + " characters are lowercase letters.");
        } else {
            System.out.println(input + " not characters are lowercase letters.");
        }
        sc.close();
    }
}
