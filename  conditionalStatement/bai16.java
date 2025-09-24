import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int Number_one = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int Number_two = sc.nextInt();
        if (Number_one > Number_two) {
            System.out.println("Số lớn hơn là " + Number_one);
        } else {
            System.out.println("Số lớn hơn là " + Number_two);
        }
        sc.close();
    }
}