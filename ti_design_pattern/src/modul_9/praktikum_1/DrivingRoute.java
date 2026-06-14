package modul_9.praktikum_1;

public class DrivingRoute implements RouteStrategy {

    public void buildRoute(String from, String to) {
        System.out.println("Membuat rute berkendara dari " + from + " ke " + to);
    }
}
