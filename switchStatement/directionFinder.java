import java.util.Scanner;

public class directionFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a direction character (N, S, E, W): ");
        char ch = sc.next().charAt(0);
        String direction;
        switch (ch) {
            case 'N':
                direction = "Bắc";
                break;
            case 'S':
                direction = "Nam";
                break;
            case 'E':
                direction = "Tây";
                break;
            case 'W':
                direction = "Đông";
                break;
            default:
                direction = "Ký tự không hợp lệ. Vui lòng nhập N, S, E hoặc W.";
        }
        System.out.println(direction);
        sc.close();
    }
}
