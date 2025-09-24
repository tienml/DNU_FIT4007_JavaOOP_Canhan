import java.util.Scanner;

public class checkTheMatchScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số: ");
        int number = sc.nextInt();
        if (number >= 0 && number <= 10) {
            System.out.println("Số " + number + " hợp lý");
        } else {
            System.out.println("Số " + number + " không hợp lý");
        }
        sc.close();
    }
}