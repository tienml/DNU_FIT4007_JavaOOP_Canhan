import java.util.Scanner;
public class bai11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ nhất: ");
        int Number_one = scanner.nextInt();
        System.out.println("Nhập số nguyên thứ hai: ");
        int Number_two = scanner.nextInt();
        int temp = Number_one;
        Number_one = Number_two;
        Number_two = temp;
        System.out.println(Number_one);
        System.out.println(Number_two);
        scanner.close();
    }
}