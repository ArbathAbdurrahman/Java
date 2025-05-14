package StrukturData;

import java.util.Stack;

public class Stak {
    public static String balikKalimat(String kalimat) {
        Stack<String> stack = new Stack<>();
        String[] kataKata = kalimat.split(" ");

        for (String kata : kataKata) {
            stack.push(kata);
        }

        StringBuilder hasil = new StringBuilder();
        while (!stack.isEmpty()) {
            hasil.append(stack.pop()).append(" ");
        }

        return hasil.toString().trim();
    }

    public static void main(String[] args) {
        String kalimat = "saya sedang belajar stack";
        System.out.println(balikKalimat(kalimat));
    }
}
