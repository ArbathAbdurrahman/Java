package StrukturData;

class SingleLinkedList {
    Node head; // Pointer ke node pertama

    // Tambah node di akhir
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Menampilkan linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteMiddle(int key) {
        if (head == null) return; // List kosong

        Node temp = head;
        Node prev = null;

        // Cari node dengan nilai yang akan dihapus
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return; // Node tidak ditemukan

        prev.next = temp.next; // Hubungkan ulang linked list
        temp = null; // Hapus node dari memori
    }


    public void deleteLast() {
        if (head == null) return; // List kosong

        if (head.next == null) {
            head = null; // Jika hanya ada satu node
            return;
        }

        Node temp = head;
        while (temp.next.next != null) { // Berhenti di node sebelum terakhir
            temp = temp.next;
        }

        temp.next = null; // Hapus node terakhir
    }
}

