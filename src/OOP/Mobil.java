package OOP;

// Kelas Mobil mengimplementasikan interface Kendaraan
class Mobil implements Kendaraan {
    @Override
    public void maju() {
        System.out.println("Mobil maju...");
    }

    @Override
    public void berhenti() {
        System.out.println("Mobil berhenti.");
    }
}

// Kelas Motor juga mengimplementasikan interface Kendaraan
class Motor implements Kendaraan {
    @Override
    public void maju() {
        System.out.println("Motor melaju...");
    }

    @Override
    public void berhenti() {
        System.out.println("Motor berhenti.");
    }
}
