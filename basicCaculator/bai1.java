package basicCaculator;

import java.util.Scanner;
public class bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        int b = scanner.nextInt();
        System.out.println("Tổng a và b là: " + (a+b));
        System.out.println("Hiệu a và b là: " + (a-b));
        System.out.println("Tích a và b là: " + (a*b));
        System.out.println("Thương a và b là: " + (a/b));
        scanner.close();
    }
}