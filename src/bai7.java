import java.util.Scanner;
public class bai7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên N: ");
        int N = scanner.nextInt();
        int absN = Math.abs(N);
        int ganCuoi = (absN / 10) % 10;
        System.out.println("Chữ số gần cuối là: " + ganCuoi);
        scanner.close();
    }
}