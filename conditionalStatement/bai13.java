import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int Number = sc.nextInt();

        if (Number >= 0) {
            System.out.println(Number + " là số tự nhiên.");
        } else {
            System.out.println(Number + " không phải là số tự nhiên.");
        }

        sc.close();
    }
}
