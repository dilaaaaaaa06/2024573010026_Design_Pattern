package modul_6.latihan;

public class Bicycle extends Vehicle {

    @Override
    public void navigateTo(String destination) {
        System.out.println("Calculating BIKE route to: " + destination);
        System.out.println("Cycling to: " + destination);
    }
}
