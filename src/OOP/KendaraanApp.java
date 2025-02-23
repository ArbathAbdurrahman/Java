package OOP;

public class KendaraanApp {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan motor = new Motor();

        mobil.maju();
        motor.maju();
    }

}
