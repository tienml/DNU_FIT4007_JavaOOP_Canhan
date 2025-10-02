import java.util.Scanner;

public class checkRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số thực: ");
        float number = sc.nextFloat();
        int intergerPart = (int) number;
        if (number == intergerPart) {
            System.out.println(number + " là số nguyên.");
        } else {
            System.out.println(number + " không phải là số nguyên.");
        }

        sc.close();
    }
}
