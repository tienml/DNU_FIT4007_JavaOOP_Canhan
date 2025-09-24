import java.util.Scanner;

public class checkTheTriangleSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int Number_one = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int Number_two = sc.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int Number_three = sc.nextInt();
        if (Number_one >=0 && Number_two >=0 && Number_three >=0) {
            if(Number_one+Number_two>Number_three || Number_one+Number_three>Number_two || Number_two+Number_three>Number_one){
                System.out.println("Số " + Number_one + " " + Number_two + " " +Number_three + " là cạnh của một tam giác");
            }
            else{
                System.out.println("Số " + Number_one + " " + Number_two + " " +Number_three + " không là cạnh của một tam giác");
            }
        } else {
            System.out.println("Số " + Number_one + " " + Number_two + " " +Number_three + " không là cạnh của một tam giác");
        }
        sc.close();
    }
}
