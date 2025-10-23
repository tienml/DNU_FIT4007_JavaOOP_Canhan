import java.util.Scanner;
public class multiplesAndDivisors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int a = sc.nextInt();
        System.out.print("Enter number two: ");
        int b = sc.nextInt();
        System.out.print("Enter number three: ");
        int c = sc.nextInt();
        if (a%b==0 && b%c==0){
            System.out.print("Number two both a multiple and a divisor !");
        }
        else {
            System.out.print("Number two not both a multiple and a divisor !");
        }
        sc.close();
    }
}
