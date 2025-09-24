package basicCaculator;

import java.util.Scanner;
public class bai4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        int edge_a = scanner.nextInt();
        System.out.println("Nhập cạnh b: ");
        int edge_b = scanner.nextInt();
        System.out.println("Nhập cạnh c: ");
        int edge_c = scanner.nextInt();
        System.out.println("Chu vi tam giác là: " + (edge_a+edge_b+edge_c));
        int half = (edge_a+edge_b+edge_c)/2;
        System.out.println("Diện tích tam giác là: " + Math.sqrt(half*(half-edge_a)*(half-edge_b)*(half-edge_c)));
        scanner.close();
    }
}