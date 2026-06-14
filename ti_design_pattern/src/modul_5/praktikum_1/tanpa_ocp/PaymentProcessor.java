package modul_5.praktikum_1.tanpa_ocp;

public class PaymentProcessor {
    public void processPayment(String paymentType, double amount){
        if (paymentType.equals("Credit Card")) {
            System.out.println("Processing Credit Card Payment of " + amount);
        } else if (paymentType.equals("EWallet")) {
            System.out.println("Processing E-Wallet Payment of " + amount) ;
        } else {
            System.out.println("Invalid payment method");
        }
    }
}
