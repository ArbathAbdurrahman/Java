package StrukturData.Stack;

public class tugasStack {

    // Stack
    static class Stack {
        private String[] data;
        private int top;
        private int size;

        public Stack(int capacity) {
            data = new String[capacity];
            top = -1;
            size = capacity;
        }

        public void push(String value) {
            if (top < size - 1) {
                top++;
                data[top] = value;
            } else {
                System.out.println("Stack penuh!");
            }
        }

        public String pop() {
            if (isEmpty()) {
                return null;
            } else {
                String value = data[top];
                top--;
                return value;
            }
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    // Fungsi utama untuk membalikkan kalimat
    public static void main(String[] args) {
        String kalimat = "saya sedang belajar stack";
        String[] kataArray = kalimat.split(" ");

        // Buat stack manual
        Stack stack = new Stack(kataArray.length);

        // Masukkan kata ke dalam stack
        for (String kata : kataArray) {
            stack.push(kata);
        }

        // Ambil dari stack untuk membalik urutan
        System.out.println("Kalimat sebelum dibalik:");
        System.out.println(kalimat);
        System.out.println("Kalimat setelah dibalik:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
