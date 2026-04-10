package modul_2.bagian_4.latihan;

public class Main {
    public static void main(String[] args) {

        // Membuat object
        Mahasiswa mhs = new Mahasiswa();

        // Mengisi nilai menggunakan setter
        mhs.setNama("Nurul Fadila");
        mhs.setNim("12345678");

        // Menampilkan menggunakan getter
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIM: " + mhs.getNim());
    }
}
