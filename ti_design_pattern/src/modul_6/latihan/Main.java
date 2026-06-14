package modul_6.latihan;

public class Main {

    public static void beginTrip(Vehicle vehicle, String destination) {

        if (vehicle instanceof EnginePowered) {
            ((EnginePowered) vehicle).startEngine();
        }

        vehicle.navigateTo(destination);
    }

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bicycle();

        System.out.println("Car trip:");
        beginTrip(car, "Central Park");

        System.out.println("\nBike trip:");
        beginTrip(bike, "Central Park");
    }
}
