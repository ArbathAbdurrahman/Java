package OOP;

// Interface
interface Kendaraan {
    void maju();
    void berhenti();

    // gunakan default agar tidak menulis ulang method di class lain
    default boolean layak(){
        return true;
    }
}
