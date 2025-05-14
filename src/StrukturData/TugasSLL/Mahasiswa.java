package StrukturData.TugasSLL;
import java.util.Scanner;

class InsertMahasiswa {
    Node head;
    // Tambah di awal
    public void TambahAwal(String nama, Long NIM) {
        Node newNode = new Node(nama, NIM);
        newNode.next = head;
        head = newNode;
        System.out.println("Node berhasil ditambahkan diawal.");
    }

    // Tambah secara spesifik setelah node dengan key NIM tertentu
    public void Spesifik(String nama, Long NIM, Long key) {
        Node newNode = new Node(nama, NIM);
        if (head == null) {
            System.out.println("List masih kosong, menambahkan di awal.");
            head = newNode;
            return;
        }
        Node current = head;
        while (current != null && !current.NIM.equals(key)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + key + " tidak ditemukan.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
        System.out.println("Node berhasil disisipkan setelah NIM " + key);
    }

    // Tambah di akhir
    public void TambahAkhir(String nama, Long NIM) {
        Node newNode = new Node(nama, NIM);
        if (head == null) {
            System.out.println("List masih kosong, menambahkan di awal.");
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        System.out.println("Node berhasil ditambahkan diakhir.");
    }

    // Hapus node di awal
    public void HapusDiawal() {
        if (head == null) {
            System.out.println("List kosong, tidak ada data untuk dihapus.");
            return;
        }
        head = head.next;
        System.out.println("Node pertama berhasil dihapus.");
    }

    // Hapus node secara spesifik berdasarkan NIM
    public void HapusSpesifik(Long key) {
        if (head == null) {
            System.out.println("List kosong, tidak ada data untuk dihapus.");
            return;
        }
        if (head.NIM.equals(key)) {
            head = head.next;
            System.out.println("Node dengan NIM " + key + " berhasil dihapus.");
            return;
        }
        Node current = head;
        while (current.next != null && !current.next.NIM.equals(key)) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Node dengan NIM " + key + " tidak ditemukan.");
            return;
        }
        current.next = current.next.next;
        System.out.println("Node dengan NIM " + key + " berhasil dihapus.");
    }

    // Hapus node di akhir
    public void HapusDiakhir() {
        if (head == null) {
            System.out.println("List kosong, tidak ada data untuk dihapus.");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Node pertama berhasil dihapus.");
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        System.out.println("Node terakhir berhasil dihapus.");
    }

    // Menampilkan data linked list
    public void Display() {
        if (head == null) {
            System.out.println("List kosong.");
            return;
        }
        Node newNode = head;
        int count = 0;
        while (newNode != null) {
            System.out.println("Index ke-" + count);
            System.out.println("Nama : " + newNode.nama);
            System.out.println("NIM : " + newNode.NIM);
            System.out.println("===========>");
            newNode = newNode.next;
            count++;
        }
        System.out.println("null");
    }
}

public class Mahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InsertMahasiswa list = new InsertMahasiswa();
        boolean running = true;

        while (running) {
            System.out.println("\n=== Menu Input Mahasiswa ===");
            System.out.println("1. Tambah Awal");
            System.out.println("2. Tambah Spesifik");
            System.out.println("3. Tambah Akhir");
            System.out.println("4. Hapus Awal");
            System.out.println("5. Hapus Spesifik");
            System.out.println("6. Hapus Akhir");
            System.out.println("7. Tampilkan Data");
            System.out.println("8. Keluar");
            System.out.print("Pilih opsi (1-8): ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1: // Tambah Awal
                    System.out.print("Masukkan nama mahasiswa: ");
                    String namaAwal = input.nextLine();
                    System.out.print("Masukkan NIM mahasiswa: ");
                    long nimAwal = input.nextLong();
                    input.nextLine();
                    list.TambahAwal(namaAwal, nimAwal);
                    break;

                case 2: // Tambah Spesifik
                    System.out.print("Masukkan nama mahasiswa: ");
                    String namaSpesifik = input.nextLine();
                    System.out.print("Masukkan NIM mahasiswa: ");
                    long nimSpesifik = input.nextLong();
                    System.out.print("Masukkan key untuk posisi spesifik: ");
                    Long key = input.nextLong();
                    input.nextLine();
                    list.Spesifik(namaSpesifik, nimSpesifik, key);
                    break;

                case 3: // Tambah Akhir
                    System.out.print("Masukkan nama mahasiswa: ");
                    String namaAkhir = input.nextLine();
                    System.out.print("Masukkan NIM mahasiswa: ");
                    long nimAkhir = input.nextLong();
                    input.nextLine();
                    list.TambahAkhir(namaAkhir, nimAkhir);
                    break;

                case 4: // Hapus Awal
                    list.HapusDiawal();
                    break;

                case 5: // Hapus Spesifik
                    System.out.print("Masukkan NIM mahasiswa yang ingin dihapus: ");
                    Long NimHapusSpesifik = Long.parseLong(input.nextLine());
                    list.HapusSpesifik(NimHapusSpesifik);
                    break;

                case 6: // Hapus Akhir
                    list.HapusDiakhir();
                    break;

                case 7: // Tampilkan Data
                    list.Display();
                    break;

                case 8: // Keluar
                    running = false;
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
        input.close();
    }
}