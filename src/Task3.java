import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        int c = a+b;
        System.out.println("Tổng hai số là: " + c);
        scanner.close();
    }
}