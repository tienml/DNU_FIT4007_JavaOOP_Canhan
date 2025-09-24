import java.util.Scanner;
public class bai8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String Name = scanner.nextLine();
        System.out.println("Độ dài của tên bạn là: " + Name.length());
        scanner.close();
    }
}