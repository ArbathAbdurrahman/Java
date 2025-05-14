package StrukturData;

public class DeleteLL {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display(); // Output: 10 -> 20 -> 30 -> 40 -> null

        list.deleteMiddle(20); // Hapus node di tengah
        list.display(); // Output: 10 -> 30 -> 40 -> null

        list.deleteLast(); // Hapus node terakhir
        list.display(); // Output: 10 -> 30 -> null
    }
}
