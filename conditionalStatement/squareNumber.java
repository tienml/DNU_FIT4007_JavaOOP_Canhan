import java.util.Scanner;

public class squareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương N: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương lớn hơn 0.");
        } else {
            double base = Math.sqrt(number);
            int intergerPart = (int) base;
            if (base == intergerPart) {
                System.out.println(number + " là số chính phương.");
            } else {
                System.out.println(number + " không phải là số chính phương.");
            }
        }

        sc.close();
    }
}
