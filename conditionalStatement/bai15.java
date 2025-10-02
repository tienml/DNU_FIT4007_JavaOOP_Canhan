import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int Number = sc.nextInt();
        if (Number % 2 == 0) {
            System.out.println("Số " + Number + " là số chẵn");
        } else {
            System.out.println("Số " + Number + " là số lẻ");
        }
        sc.close();
    }
}
