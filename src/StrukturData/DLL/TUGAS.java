package StrukturData.DLL;
import java.util.Scanner;

class Mahasiswa {
    String nim, nama;
    Mahasiswa prev, next;

    Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Mahasiswa head = null, tail = null;

    void insertAtBeginning(String nim, String nama) {
        Mahasiswa baru = new Mahasiswa(nim, nama);
        if (head == null) {
            head = tail = baru;
        } else {
            baru.next = head;
            head.prev = baru;
            head = baru;
        }
    }

    void insertAtEnd(String nim, String nama) {
        Mahasiswa baru = new Mahasiswa(nim, nama);
        if (tail == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    void insertAtPosition(String nim, String nama, int posisi) {
        if (posisi <= 1) {
            insertAtBeginning(nim, nama);
            return;
        }

        Mahasiswa baru = new Mahasiswa(nim, nama);
        Mahasiswa current = head;
        int index = 1;

        while (current != null && index < posisi - 1) {
            current = current.next;
            index++;
        }

        if (current == null || current.next == null) {
            insertAtEnd(nim, nama);
        } else {
            baru.next = current.next;
            baru.prev = current;
            current.next.prev = baru;
            current.next = baru;
        }
    }

    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("Data kosong!");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void deleteAtEnd() {
        if (tail == null) {
            System.out.println("Data kosong!");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void deleteAtPosition(int posisi) {
        if (posisi <= 1) {
            deleteAtBeginning();
            return;
        }

        Mahasiswa current = head;
        int index = 1;

        while (current != null && index < posisi) {
            current = current.next;
            index++;
        }

        if (current == null) {
            System.out.println("Posisi tidak ditemukan!");
            return;
        }

        if (current == tail) {
            deleteAtEnd();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    void tampilDariDepan() {
        Mahasiswa current = head;
        if (current == null) {
            System.out.println("Data kosong!");
            return;
        }
        while (current != null) {
            System.out.println("NIM: " + current.nim + ", Nama: " + current.nama);
            current = current.next;
        }
    }

    void tampilDariBelakang() {
        Mahasiswa current = tail;
        if (current == null) {
            System.out.println("Data kosong!");
            return;
        }
        while (current != null) {
            System.out.println("NIM: " + current.nim + ", Nama: " + current.nama);
            current = current.prev;
        }
    }
}

public class TUGAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        int mainChoice, subChoice, posisi;
        String nim, nama;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. INSERTION");
            System.out.println("2. DELETION");
            System.out.println("3. SHOW DATA");
            System.out.println("4. EXIT");
            System.out.print("Pilih menu utama: ");
            mainChoice = sc.nextInt();

            switch (mainChoice) {
                case 1:
                    System.out.println("1.1 INSERTION AT THE BEGINNING");
                    System.out.println("1.2 INSERTION AT SPECIFIC POSITION");
                    System.out.println("1.3 INSERTION AT THE END");
                    System.out.print("Pilih sub-menu: ");
                    subChoice = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Masukkan NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    nama = sc.nextLine();

                    if (subChoice == 1) {
                        dll.insertAtBeginning(nim, nama);
                    } else if (subChoice == 2) {
                        System.out.print("Masukkan posisi: ");
                        posisi = sc.nextInt();
                        dll.insertAtPosition(nim, nama, posisi);
                    } else if (subChoice == 3) {
                        dll.insertAtEnd(nim, nama);
                    }
                    break;

                case 2:
                    System.out.println("2.1 DELETION AT THE BEGINNING");
                    System.out.println("2.2 DELETION AT SPECIFIC POSITION");
                    System.out.println("2.3 DELETION AT THE END");
                    System.out.print("Pilih sub-menu: ");
                    subChoice = sc.nextInt();

                    if (subChoice == 1) {
                        dll.deleteAtBeginning();
                    } else if (subChoice == 2) {
                        System.out.print("Masukkan posisi: ");
                        posisi = sc.nextInt();
                        dll.deleteAtPosition(posisi);
                    } else if (subChoice == 3) {
                        dll.deleteAtEnd();
                    }
                    break;

                case 3:
                    System.out.println("3.1 DARI DEPAN");
                    System.out.println("3.2 DARI BELAKANG");
                    System.out.print("Pilih sub-menu: ");
                    subChoice = sc.nextInt();

                    if (subChoice == 1) {
                        dll.tampilDariDepan();
                    } else if (subChoice == 2) {
                        dll.tampilDariBelakang();
                    }
                    break;

                case 4:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (mainChoice != 4);
        sc.close();
    }
}

