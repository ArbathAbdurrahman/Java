import java.util.Scanner;

public class PSD_array_non_rectangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah baris
        System.out.print("Masukkan jumlah baris segitiga Pascal: ");
        int n = scanner.nextInt();

        // Deklarasi jagged array
        int[][] pascal = new int[n][];

        // Mengisi array dengan nilai segitiga Pascal
        for (int i = 0; i < n; i++) {
            pascal[i] = new int[i + 1]; // Setiap baris memiliki panjang i+1
            pascal[i][0] = pascal[i][i] = 1; // Elemen pertama dan terakhir selalu 1

            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        // Menampilkan hasil dalam bentuk segitiga
        System.out.println("\nSegitiga Pascal:");
        for (int i = 0; i < n; i++) {
            // Memberikan spasi agar segitiga terlihat rapi
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }

            // Menampilkan nilai segitiga Pascal
            for (int j = 0; j < pascal[i].length; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
