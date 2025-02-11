import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] angka;  // Deklarasi array
        angka = new int[5];  // Alokasi memori untuk 5 elemen
        System.out.println(angka[0]);
        angka[0] = 12; // Mengubah index ke 0 sebuah array

        int[] angkaw = {1, 4, 3, 2, 5}; // Array dengan 5 elemen
        int[] copy = Arrays.copyOf(angkaw, angkaw.length); // menyalin array
        System.out.println(Arrays.toString(copy));
        Arrays.sort(angkaw); // mengurutkan array
        System.out.println(Arrays.toString(angkaw));

        String[] nama = {"Bambang", "Ucup", "Sugeng"}; // Array String

        System.out.println(angka[0]);
        System.out.println(angkaw[3]);
        System.out.println(nama[2]);
        System.out.println("Panjang array: " + angka.length);

        // Matriks array
        int[][] matriks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(matriks[0][0]);
        System.out.println(matriks[1][2]);
        System.out.println(matriks[2][2]);
        System.out.println("Panjang matriks: " + matriks.length);
        System.out.println("Panjang elemen matriks: " + matriks[0].length);

    }
}
