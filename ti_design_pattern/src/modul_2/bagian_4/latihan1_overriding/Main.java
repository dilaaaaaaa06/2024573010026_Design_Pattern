package modul_2.bagian_4.latihan1_overriding;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(4);
        Lingkaran lingkaran = new Lingkaran(7);

        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
    }
}