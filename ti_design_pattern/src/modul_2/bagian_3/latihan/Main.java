package modul_2.bagian_3.latihan;

public class Main {
    public static void main(String[] args) {

        AkunBank akun = new AkunBank(1000000);

        // Akses melalui method (benar)
        akun.tampilkanSaldo();

        // Coba akses langsung (akan error)
        System.out.println(akun.getSaldo());
    }
}