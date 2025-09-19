import java.util.Scanner;
public class bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        int radius = scanner.nextInt();
        System.out.println("Chu vi hình tròn là: " + (2*Math.PI*radius));
        System.out.println("Diện tích hình tròn là: " + (Math.PI*Math.pow(radius,2)));
        scanner.close();
    }
}
