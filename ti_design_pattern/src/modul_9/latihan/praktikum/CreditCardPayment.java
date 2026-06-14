package modul_9.latihan.praktikum;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran sebesar Rp" + amount +
                " menggunakan Kartu Kredit berhasil.");
    }
}
