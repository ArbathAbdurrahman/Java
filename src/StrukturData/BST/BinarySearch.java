package StrukturData.BST;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class BST {
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) return new Node(data);
        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);
        return root;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();
        Set<Integer> uniqueNumbers = new HashSet<>();
        int choice;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Masukkan 11 data angka antara 10-99 yang berbeda-beda");
            System.out.println("2. Tampilkan data secara urut");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    uniqueNumbers.clear();
                    bst = new BST(); // Reset BST
                    while (uniqueNumbers.size() < 11) {
                        System.out.print("Masukkan angka unik ke-" + (uniqueNumbers.size() + 1) + " (10-99): ");
                        int num = sc.nextInt();
                        if (num < 10 || num > 99) {
                            System.out.println("Angka harus antara 10 hingga 99.");
                        } else if (!uniqueNumbers.add(num)) {
                            System.out.println("Angka sudah dimasukkan, masukkan angka yang berbeda.");
                        } else {
                            bst.insert(num);
                        }
                    }
                    System.out.println("Semua angka berhasil dimasukkan ke BST.");
                    break;
                case 2:
                    System.out.println("Data secara urut (inorder traversal):");
                    bst.inorder();
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 3);
    }
}
