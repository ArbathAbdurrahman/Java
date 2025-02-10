public class TipeDataString {
    public static void main(String[] args) {
        String firstName = "Ucup";
        String lastName = "Kurniawan";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(firstName.concat(lastName));
        System.out.println(fullName.length());
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.indexOf("Ucup"));

        String kata = "Ucup sedang jum'atan dengan \"Khusyuk\" bersama dengan \n Andi \\ Bambang";
        System.out.println(kata);
    }
}
