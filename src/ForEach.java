public class ForEach {
    public static void main(String[] args) {

        String[] nama = {
                "Ucup", "Bambang", "Sugeng"
        };

        // Akses Array dengan for biasa
        for (var i = 0; i < nama.length; i++) {
            System.out.println(nama[i]);
        }

        // Akses Array dengan ForEach
        for (var value : nama) {
            System.out.println(value);
        }
    }
}
