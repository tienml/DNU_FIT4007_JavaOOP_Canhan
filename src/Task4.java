import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm của bạn: ");
        int point = scanner.nextInt();
        if(point < 5){
            System.out.println("Bạn đã rớt");
        }
        else{
            System.out.println("Bạn đã đỗ");
        }
        scanner.close();
    }
}