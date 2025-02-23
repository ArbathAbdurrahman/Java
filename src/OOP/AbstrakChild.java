package OOP;

public class AbstrakChild extends Abstrak {
    // abstract method memaksa menggunakan method run()
    @Override
    public void run() {
        System.out.println("Abstrak run " + nama);
    }
    AbstrakChild(String nama) {
        this.nama = nama;
    }
}
