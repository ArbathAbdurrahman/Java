package OOP.belajar.data;

public class Product {
    public String name;
    protected int price; // melindungi sehingga hanya dapat diakses pada 1 package
    private int quantity;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    // Getter
    public int getQuantity() {
        return quantity;
    }
    // Setter
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
