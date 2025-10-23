import java.util.Scanner;

public class genderIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gender code (0 = Male, 1 = Female, 2 = Other): ");
        int gender = sc.nextInt();
        String result;
        switch (gender) {
            case 0:
                result = "Nam";
                break;
            case 1:
                result = "Nữ";
                break;
            case 2:
                result = "Khác";
                break;
            default:
                result = "Giá trị không hợp lệ. Vui lòng nhập 0, 1 hoặc 2.";
        }
        System.out.println(result);
        sc.close();
    }
}
