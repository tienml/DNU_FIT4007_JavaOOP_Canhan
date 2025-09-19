import java.util.Scanner;
public class bai6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên N: ");
        int N = scanner.nextInt();
        System.out.println("Chữ số cuối cùng của số nguyên N là: " + (N%10));
        scanner.close();
    }
}