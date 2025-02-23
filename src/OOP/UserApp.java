package OOP;

public class UserApp {
    public static void main(String[] args) {
        var user1 = new User("Ucup","Wonogiri");
//        user1.nama = "Ucup";
//        user1.asal = "Wonogiri";
        User.universitas = "UIN Sunan Kalijaga"; // mengubah universitas dari Universitas Java
        System.out.println(user1.nama);
        System.out.println(user1.asal);
        user1.getUniv();
        System.out.println(user1.negara);

        user1.sayHello("Budi");

        var user2 = new User("Bambang");
        System.out.println(user2.nama);
        user2.sayHello("Andi");

        var user3 = new User();
        System.out.println(user3.asal);
        user3.sayHello("Septo");

        // inheritance class
        var user4 = new Person();
        user4.nama = "Budi";
        user4.asal = "Temanggung";
        System.out.println(user4.asal);
        user4.sayHello("Sugeng");
        user4.sayHello("Tutu");
    }
}
