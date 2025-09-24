package class_oop;
import java.util.Scanner;
public class Product {
   private int idProduct;
   private String nameProduct;
   private String descriptionProduct;
   private float priceProduct;
   private String categoryProduct;
   private String colorProduct;
   private int weightProduct;
   private String brandProduct;
   private int quantityProduct;
   private String manufactureDateProduct;

    public Product(int idProduct, String nameProduct, String descriptionProduct, float priceProduct, String categoryProduct, String colorProduct, int weightProduct, String brandProduct, int quantityProduct, String manufactureDateProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.priceProduct = priceProduct;
        this.categoryProduct = categoryProduct;
        this.colorProduct = colorProduct;
        this.weightProduct = weightProduct;
        this.brandProduct = brandProduct;
        this.quantityProduct = quantityProduct;
        this.manufactureDateProduct = manufactureDateProduct;
    }

    public void showInfoProduct(){
        System.out.println("ID: " + idProduct);
        System.out.println("Name: " + nameProduct);
        System.out.println("Description: " + descriptionProduct);
        System.out.println("Price: " + priceProduct);
        System.out.println("Category: " + categoryProduct);
        System.out.println("Color: " + colorProduct);
        System.out.println("Weight: " + weightProduct);
        System.out.println("Brand: " + brandProduct);
        System.out.println("Quantity: " + quantityProduct);
        System.out.println("manufactureDate: " + manufactureDateProduct);
    }
}