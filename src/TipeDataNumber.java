public class TipeDataNumber {
    public static void main(String[] args) {
        byte a = 127; // 1 byte
        short b = 32_767; // 2 byte boleh dipisah menggunakan "_"
        int c = 2_147_483_647; // 4 byte
        long d = 9_223_372_036_854_775_807L; // 8 byte
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        float e = 3.14159265358979323846f; // 4 byte
        double f = 3.14159265358979323846; // 8 byte
        System.out.println(e);
        System.out.println(f);

        int decimalInt = 123;
        int hexInt = 0x7B;
        int binaryInt = 0b01111011;
        System.out.println(decimalInt);
        System.out.println(hexInt);
        System.out.println(binaryInt);

        // KONVERSI TIPE DATA NUMBER

        // Widening Casting (Otomatis) = byte -> short -> int -> long -> float -> double
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        // Narrowing Casting (Manual)  = double ->  float -> long -> int -> short -> byte
        double iniDouble2 = 10.5;
        float iniFloat2 = (float)iniDouble2;
        long iniLong2 = (long)iniFloat2;
        int iniInt2 = (int)iniLong2;
        short iniShort2 = (short)iniInt2;
        byte iniByte2 = (byte)iniShort2;
    }
}
