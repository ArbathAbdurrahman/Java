public class While {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("Perulangan ke-" + i);
            i++;
        }

        System.out.println("=====================================");

        int kondisi = 0;
        do {
            System.out.println("Perulangan ke-" + kondisi);
            kondisi++;
        } while (kondisi <= 10);

        System.out.println("=====================================");
        int countdown = 10;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("DUARRR");
    }
}
