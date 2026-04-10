package modul_3.bagian_4.latihan2_overloading;

public class Main {
    public static void main(String[] args) {
        Matematika m = new Matematika();

        System.out.println("Hasil 1: " + m.tambah(5, 10));       // 15
        System.out.println("Hasil 2: " + m.tambah(5, 10, 15));   // 30
        System.out.println("Hasil 3: " + m.tambah(2.5, 3.5));    // 6.0
    }
}