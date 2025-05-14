package StrukturData.Queue;

import java.util.LinkedList;
import java.util.Scanner;

public class tugasQueue {
    private LinkedList<String> queue = new LinkedList<>();

    public void tambahAntrian(String nama) {
        queue.addLast(nama);
        System.out.println(nama + " telah ditambahkan ke dalam antrian.");
    }

    public void panggilAntrian() {
        if (queue.isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            String nama = queue.removeFirst();
            System.out.println(nama + " SILAKAN MENUJU LOKET");
        }
    }

    public void cetakAntrian() {
        if (queue.isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian:");
            System.out.println(String.join("-", queue));
        }
    }

    public static void main(String[] args) {
        tugasQueue antrian = new tugasQueue();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. TAMBAH ANTRIAN");
            System.out.println("2. PANGGIL ANTRIAN");
            System.out.println("3. CETAK ANTRIAN");
            System.out.println("4. EXIT");
            System.out.print("PILIHAN ANDA: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    System.out.print("MASUKAN NAMA PENGANTRI: ");
                    String nama = scanner.nextLine();
                    antrian.tambahAntrian(nama);
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.cetakAntrian();
                    break;
                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
