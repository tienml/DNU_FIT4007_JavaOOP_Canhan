import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int length = scanner.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int width = scanner.nextInt();
        System.out.println("Diện tích hình chữ nhật là: " + length * width);
        scanner.close();
    }
}
