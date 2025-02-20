import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String nama;
    String nim;

    public Student(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void display() {
        System.out.println("Nama: " + nama + "\nNIM: " + nim +"\n");
    }
}

public class PSD_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> Students = new ArrayList<>();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Nama Mahasiswa ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan NIM Mahasiswa ke-" + (i + 1) + ": ");
            String nim = scanner.nextLine();

            Students.add(new Student(nama, nim));
        }

        System.out.println("\nDaftar Mahasiswa:");
        for (Student student : Students) {
            student.display();
        }

        scanner.close();
    }
}
