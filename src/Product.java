public class Product {
    private int proId;
    private String proName;
    private double price;
    public Product(int proId, String proName, double price) {
        this.proId = proId;
        this.proName = proName;
        this.price = price;
    }
    public void display() {
        System.out.println("Product ID: " + proId);
        System.out.println("Product Name: " + proName);
        System.out.println("Product Price: " + price);
    System.out.println("------------------------");
    }
}
