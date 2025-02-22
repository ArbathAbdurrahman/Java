public class Method {
    public static void main(String[] args) {
        sayHello(); // ini memanggil method
        sayHello(); // ini memanggil method
        sayHello("Ucup"); // ini memanggil method dengan parameter
        namaku("Ucup", "Subroto");
        namaku("Asep", "Subrotod");
        var jum1 = jumlahkan(45,73);
        System.out.println(jum1);
        var jum2 = jumlahkan(4,7);
        System.out.println(jum2);
        var jumlah = hitung(4,"+",5);
        System.out.println(jumlah);

        // mainstreem
        int[] values = {1,2,3,4,5,6,7,8,9,100};
        selamat("Ucup",values);
        // lebih baik
        selamatOke("Asep",89,94,67,89);

        System.out.println(factorial(8));
        System.out.println(factorialRecursive(8));
    }

    // ini method
    static void sayHello() {
        System.out.println("Hello World!");
    }
    // method overloading harus ada perbedaan
    static void sayHello(String nama){// perbedaan dengan parameter
        System.out.println("Hello "+nama);
    }

    // method dengan parameter
    static void namaku(String firstname, String lastname) {
        System.out.println(firstname + " " + lastname);
    }

    // method dengan return
    static int jumlahkan(int a,int b) {
        var total = a + b;
        return total;
    }

    static int hitung(int a, String operasi, int b) {
        switch (operasi){
            case "+":
                return a + b;
                case "-":
                    return a - b;
                    case "*":
                        return a * b;
                        case "/":
                            return a / b;
                            default:
                                return 0;
        }
    }

    // Method variable argument
    static void selamat(String name, int[] values){
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total/values.length;
        if (finalValue >= 75){
            System.out.println("Selamat " + name + " Anda lulus");
        }else {
            System.out.println("Maaf " + name + " Anda tidak lulus");
        }
    }
    static void selamatOke(String name, int... values){
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total/values.length;
        if (finalValue >= 75){
            System.out.println("Selamat " + name + " Anda lulus");
        }else {
            System.out.println("Maaf " + name + " Anda tidak lulus");
        }
    }

    // Method Recursive memanggil method itu sendiri
    // Biasa
    static int factorial(int n){
        var result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    // Recursive Method
    static int factorialRecursive(int n){
        if (n == 1){
            return 1;
        }else {
            return n * factorialRecursive(n-1);
        }
    }
}