package StrukturData;
import java.util.*;

public class LinkedListVsArray {
    public static void main(String[] args) {
        int dataSize = 100000; // Ukuran data untuk pengujian

        // Menggunakan ArrayList (Implementasi Array)
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // 1. Menguji Penyisipan di Tengah
        System.out.println("=== Penyisipan di Tengah ===");
        measureInsertion(arrayList, linkedList, dataSize);

        // 2. Menguji Akses Elemen Secara Acak
        System.out.println("\n=== Akses Elemen Secara Acak ===");
        measureRandomAccess(arrayList, linkedList, dataSize);

        // 3. Menguji Penghapusan di Tengah
        System.out.println("\n=== Penghapusan di Tengah ===");
        measureDeletion(arrayList, linkedList, dataSize);
    }

    // Fungsi untuk mengukur waktu penyisipan di tengah
    private static void measureInsertion(List<Integer> arrayList, List<Integer> linkedList, int dataSize) {
        // Penyisipan pada ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList (Penyisipan Tengah): " + (endTime - startTime) / 1e6 + " ms");

        // Penyisipan pada LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList (Penyisipan Tengah): " + (endTime - startTime) / 1e6 + " ms");
    }

    // Fungsi untuk mengukur waktu akses elemen secara acak
    private static void measureRandomAccess(List<Integer> arrayList, List<Integer> linkedList, int dataSize) {
        // Mengisi data terlebih dahulu
        for (int i = 0; i < dataSize; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        Random rand = new Random();
        int sum = 0; // Variabel untuk mencegah compiler mengoptimalkan kode

        // Akses acak pada ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sum += arrayList.get(rand.nextInt(dataSize));
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList (Akses Acak): " + (endTime - startTime) / 1e6 + " ms");

        // Akses acak pada LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sum += linkedList.get(rand.nextInt(dataSize));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList (Akses Acak): " + (endTime - startTime) / 1e6 + " ms");
    }

    // Fungsi untuk mengukur waktu penghapusan di tengah
    private static void measureDeletion(List<Integer> arrayList, List<Integer> linkedList, int dataSize) {
        // Mengisi data terlebih dahulu
        for (int i = 0; i < dataSize; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Penghapusan di tengah pada ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < dataSize / 2; i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList (Penghapusan Tengah): " + (endTime - startTime) / 1e6 + " ms");

        // Penghapusan di tengah pada LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < dataSize / 2; i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList (Penghapusan Tengah): " + (endTime - startTime) / 1e6 + " ms");
    }
}

