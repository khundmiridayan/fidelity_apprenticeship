import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];
        products[0] = new Product(101, "Laptop",88500);
        products[1] = new Product(102, "Smartphone", 24500);
        products[2] = new Product(103, "Tablet", 44500);
        products[3] = new Product(104, "Smartwatch", 4500);
        products[4] = new Product(105, "Headphones", 2500);
        System.out.println("Product Details:");
        for (Product product : products) {
            product.display();
        }

    }
}