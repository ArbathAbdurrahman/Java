package OOP;

public class User {
    String nama;
    String asal;
    static String universitas = "Universitas Java"; // field yang bisa diubah
    final String negara = "Indonesia"; // field yang tidak bisa diubah

    // Constructor utama
    User(String paramNama, String paramAsal) {
        this.nama = paramNama;
        this.asal = paramAsal;
    }

    // Constructor overloading: Jika hanya mengisi nama, asal diisi default "Tidak Diketahui"
    User(String paramNama) {
        this(paramNama, "Tidak Diketahui");
    }

    // Constructor tanpa parameter: Jika tidak mengisi nama dan asal, maka diisi "Anonim"
    User() {
        this("Anonim", "Tidak Diketahui");
    }

    // Method
    void sayHello(String teman) {
        System.out.println("Hello " + teman + ", namaku " + nama + " berasal dari " + asal);
    }

    void getUniv() {
        System.out.println(universitas);
    }

}
