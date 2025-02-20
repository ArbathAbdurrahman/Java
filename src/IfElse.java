public class IfElse {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        if (a > b) {
            System.out.println("a lebih besar dari b");
        } else if (a == b) {
            System.out.println("a sama dengan b");
        } else {
            System.out.println("a lebih kecil dari b");
        }

        String result = (a > b) ? "a lebih besar dari b" : "a tidak sama dengan b";
        System.out.println(result);
    }
}
