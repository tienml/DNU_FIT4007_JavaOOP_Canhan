package basicCaculator;

import java.util.Scanner;
public class bai5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tuoi: ");
        int age = scanner.nextInt();
        System.out.println("Bạn sinh năm: " + (2023-age));
        scanner.close();
    }
}