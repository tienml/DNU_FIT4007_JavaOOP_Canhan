import java.util.Scanner;

public class magnitudeThreeOfTheTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int Number_one = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int Number_two = sc.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int Number_three = sc.nextInt();
        if (Number_one + Number_two + Number_three == 180 && Number_one >=0 && Number_two >=0 && Number_three >=0){
            System.out.print("Ba số " + Number_one + " " + Number_two + " " + Number_three + " là độ lớn 3 góc của 1 tam giác");
        }
        else{
            System.out.print("Ba số " + Number_one + " " + Number_two + " " + Number_three + " không là độ lớn 3 góc của 1 tam giác");
        }
    }
}
