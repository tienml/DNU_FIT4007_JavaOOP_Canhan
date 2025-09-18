import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        int a = sc.nextInt();

        System.out.print("Nhập cạnh b: ");
        int b = sc.nextInt();

        if (a > 0 && b > 0) {
            if (a == b) {
                System.out.println("Hình chữ nhật với cạnh " + a + " và " + b + " là hình vuông.");
            } else {
                System.out.println("Hình chữ nhật với cạnh " + a + " và " + b + " không phải là hình vuông.");
            }
        } else {
            System.out.println("Cạnh của hình chữ nhật phải là số dương.");
        }
        sc.close();
    }
}