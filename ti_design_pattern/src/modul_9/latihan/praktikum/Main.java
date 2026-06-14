package modul_9.latihan.praktikum;

public class Main {
    public static void main(String[] args) {

        Checkout checkout = new Checkout();

        // Kartu Kredit
        checkout.setPaymentStrategy(new CreditCardPayment());
        checkout.processPayment(500000);

        // E-Wallet
        checkout.setPaymentStrategy(new EWalletPayment());
        checkout.processPayment(250000);

        // Transfer Bank
        checkout.setPaymentStrategy(new BankTransferPayment());
        checkout.processPayment(1000000);
    }
}