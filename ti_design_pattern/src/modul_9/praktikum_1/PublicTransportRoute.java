package modul_9.praktikum_1;

public class PublicTransportRoute implements RouteStrategy {

    public void buildRoute(String from, String to) {
        System.out.println("Membuat rute transportasi umum dari " + from + " ke " + to);
    }
}
