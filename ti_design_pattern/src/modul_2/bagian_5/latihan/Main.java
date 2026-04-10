package modul_2.bagian_5.latihan;

public class Main {
    public static void main(String[] args) {

        // Object dengan default constructor
        Barang barang1 = new Barang();

        // Object dengan parameterized constructor
        Barang barang2 = new Barang("Laptop", 7500000);

        // Menampilkan hasil
        System.out.println("Barang 1:");
        System.out.println("Nama: " + barang1.namaBarang);
        System.out.println("Harga: " + barang1.harga);

        System.out.println();

        System.out.println("Barang 2:");
        System.out.println("Nama: " + barang2.namaBarang);
        System.out.println("Harga: " + barang2.harga);
    }
}