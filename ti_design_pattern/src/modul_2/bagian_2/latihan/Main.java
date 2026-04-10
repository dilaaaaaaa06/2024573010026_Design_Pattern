package modul_2.bagian_2.latihan;

public class Main {
    public static void main(String[] args) {

        // Membuat object
        Lingkaran lingkaran1 = new Lingkaran();

        // Mengisi nilai jari-jari
        lingkaran1.jariJari = 7;

        // Memanggil method hitungLuas()
        double luas = lingkaran1.hitungLuas();

        // Menampilkan hasil
        System.out.println("Luas lingkaran: " + luas);
    }
}
