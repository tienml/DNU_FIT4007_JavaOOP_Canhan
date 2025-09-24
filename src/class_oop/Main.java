package class_oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*Person p = new Person("John", 30);*/
        /*p.setName("John");
        p.setAge(18);*/
        /*System.out.println(p.getName() + " is " + p.getAge() + " year old ");*/

        /*Person[] peoples = new Person[5];
        peoples[0] = new Person("John1", 29);
        peoples[1] = new Person("Mina", 18);
        peoples[0].showInfo();
        peoples[1].showInfo();*/

        /*Product[] Products = new Product[5];

        Products[0] = new Product(1, "Coca", "Drink", 10.5f, "Beverage", "Red", 300, "Coca-Cola", 50, "2023-05-01");
        Products[1] = new Product(2, "Pessi", "Drink", 9.8f, "Beverage", "Blue", 330, "Pepsi", 40, "2023-06-01");
        Products[2] = new Product(3, "Snack", "Food", 5.5f, "Snack", "Yellow", 100, "Oishi", 100, "2023-07-15");
        Products[3] = new Product(4, "Socola", "Food", 15.0f, "Candy", "Brown", 200, "KitKat", 70, "2023-08-20");
        Products[4] = new Product(5, "Sting", "Drink", 8.0f, "Energy Drink", "Red", 330, "Sting", 60, "2023-09-10");

        for (int i = 0; i < Products.length; i++) {
            Products[i].showInfoProduct();
        }*/
        /*System.out.print("Nhập số lượng sản phẩm: ");
        int n = Integer.parseInt(sc.nextLine());

        Product[] Products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin sản phẩm thứ " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Tên: ");
            String name = sc.nextLine();

            System.out.print("Mô tả: ");
            String desc = sc.nextLine();

            System.out.print("Giá: ");
            float price = Float.parseFloat(sc.nextLine());

            System.out.print("Danh mục: ");
            String category = sc.nextLine();

            System.out.print("Màu sắc: ");
            String color = sc.nextLine();

            System.out.print("Cân nặng: ");
            int weight = Integer.parseInt(sc.nextLine());

            System.out.print("Thương hiệu: ");
            String brand = sc.nextLine();

            System.out.print("Số lượng: ");
            int quantity = Integer.parseInt(sc.nextLine());

            System.out.print("Ngày sản xuất (yyyy-MM-dd): ");
            String mfgDate = sc.nextLine();

            Products[i] = new Product(id, name, desc, price, category, color, weight, brand, quantity, mfgDate);
        }

        System.out.println("\n=== Danh sách sản phẩm ===");
        for (Product p : Products) {
            p.showInfoProduct();
        }*/
        BankAccount account = new BankAccount("123456", 1000);

        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500);

        System.out.println("Số dư hiện tại: " + account.getBalance());
        sc.close();
    }
}