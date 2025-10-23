import java.util.Scanner;

public class nextMinute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour (0 <= h < 24): ");
        int h = sc.nextInt();
        System.out.print("Enter minute (0 <= m < 60): ");
        int m = sc.nextInt();
        m++;
        if (m == 60) {
            m = 0;
            h++;
            if (h == 24) {
                h = 0;
            }
        }
        System.out.printf("Time after one minute: %02d:%02d%n", h, m);
        sc.close();
    }
}
