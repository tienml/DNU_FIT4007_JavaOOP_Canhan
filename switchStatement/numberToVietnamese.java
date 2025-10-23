import java.util.Scanner;

public class numberToVietnamese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single-digit natural number (0–9): ");
        int n = sc.nextInt();
        String result;
        switch (n) {
            case 0:
                result = "Không";
                break;
            case 1:
                result = "Một";
                break;
            case 2:
                result = "Hai";
                break;
            case 3:
                result = "Ba";
                break;
            case 4:
                result = "Bốn";
                break;
            case 5:
                result = "Năm";
                break;
            case 6:
                result = "Sáu";
                break;
            case 7:
                result = "Bảy";
                break;
            case 8:
                result = "Tám";
                break;
            case 9:
                result = "Chín";
                break;
            default:
                result = "Invalid input. Please enter a number from 0 to 9.";
        }
        System.out.println(result);
        sc.close();
    }
}
