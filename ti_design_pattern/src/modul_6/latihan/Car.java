package modul_6.latihan;

import modul_6.praktikum_2.tanpa_lsp.Publishable;

public class Car extends Vehicle implements EnginePowered {

    @Override
    public void startEngine() {
        System.out.println("Car starts engine");
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("Calculating CAR route to: " + destination);
        System.out.println("Driving to: " + destination);
    }
}
