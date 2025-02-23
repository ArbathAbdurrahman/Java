package OOP.belajar.data;

public class ProductApp {
    public static void main(String[] args) {
        var produk1 = new Product("Sabun", 5000);
        produk1.setQuantity(3);
        System.out.println(produk1.name);
        System.out.println(produk1.price);
        // System.out.println(produk1.quantity); // tidak bisa karena quantity bersifat private
        System.out.println(produk1.getQuantity());
    }
}
