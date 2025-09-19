import java.util.Scanner;
public class bai9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ nhất: ");
        int Number_one = scanner.nextInt();
        System.out.println("Nhập số nguyên thứ hai: ");
        int Number_two = scanner.nextInt();
        float Number1 = Number_one;
        float Number2 = Number_two;
        System.out.println("Kết quả a/b là: " + (Number1/Number2));
        scanner.close();
    }
}