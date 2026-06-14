package modul_6.latihan;

public abstract class Vehicle {

    public void navigateTo(String destination) {
        System.out.println("Calculating route to: " + destination);
        System.out.println("Following route to: " + destination);
    }
}
