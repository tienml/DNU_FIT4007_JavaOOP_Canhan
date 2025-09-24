import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngày trong tuần: ");
        int day = scanner.nextInt();
        if (day == 2) {
            System.out.println("Thứ Hai");
        } else if (day == 3) {
            System.out.println("Thứ Ba");
        } else if (day == 4) {
            System.out.println("Thứ Tư");
        } else if (day == 5) {
            System.out.println("Thứ Năm");
        } else if (day == 6) {
            System.out.println("Thứ Sáu");
        } else if (day == 7) {
            System.out.println("Thứ Bảy");
        } else if (day == 7) {
            System.out.println("Thứ Bảy");
        } else {
            System.out.println("Số không hợp lệ");
        }
        scanner.close();
    }
}