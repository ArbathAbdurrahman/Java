package OOP;

public class AbstrakApp {
    public static void main(String[] args) {
        var abstrak1 = new AbstrakChild("Ucup");
        System.out.println(abstrak1.nama);
        abstrak1.run();
    }
}
