package modul_2.bagian_3.latihan;

class AkunBank {
    private double saldo;

    public AkunBank(double saldo) {
        this.saldo = saldo;
    }

    public void tampilkanSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
