package modul_2.bagian_5.latihan;

class Barang {
    String namaBarang;
    double harga;

    // Default constructor
    Barang() {
        namaBarang = "Tidak diketahui";
        harga = 0;
    }

    // Parameterized constructor
    Barang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }
}
