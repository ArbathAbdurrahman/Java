public class Operators {
    public static void main(String[] args) {
        int penjumlahan = 10 + 20;
        int pengurangan = 10 - 20;
        int perkalian = 10 * 20;
        int pembagian = 10 / 20;
        int modulus = 10 % 20;
        System.out.println("Penjumlahan = " + penjumlahan);
        System.out.println("Pengurangan = " + pengurangan);
        System.out.println("Perkalian = " + perkalian);
        System.out.println("Pembagian = " + pembagian);
        System.out.println("Modulus = " + modulus);

        int increment = 10;
        increment++;
        System.out.println(increment);

        int decrement = 10;
        decrement--;
        System.out.println(decrement);

        int x = 10;
        System.out.println(x);
        x += 5;
        System.out.println(x);
        x -= 5;
        System.out.println(x);
        x *= 5;
        System.out.println(x);
        x /= 5;
        System.out.println(x);
        x %= 5;
        System.out.println(x);
        x &= 5;
        System.out.println(x);
        x |= 5;
        System.out.println(x);
        x ^= 5;
        System.out.println(x);
        x >>= 5;
        System.out.println(x);
        int y = 10;
        y <<= 5;
        System.out.println(y);

    }
}
