package OOP;

// Inheritance Child Person mewarisi Parent User
public class Person extends User{
    // Method Override menulis ulang method yang ada di parent class
    void sayHello(String teman) {
        System.out.println("Hello " + teman + " Saya " + this.nama);
    }
}
