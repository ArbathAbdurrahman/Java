package StrukturData.TugasSLL;

public class Node {
    String nama;
    Long NIM;
    Node next;

    public Node(String nama, Long NIM) {
        this.nama = nama;
        this.NIM = NIM;
        this.next = null;
    }
}
