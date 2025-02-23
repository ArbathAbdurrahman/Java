package OOP.belajar.pack;

import OOP.belajar.data.Product;

public class impor {
    public static void main(String[] args) {
        var produk2 = new Product("Sampo", 2000);
        produk2.setQuantity(5);
        System.out.println(produk2.name);
        // System.out.println(produk2.price); // eror karena field price protected
        System.out.println(produk2.getQuantity());
    }

}
