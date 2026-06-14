package modul_9.praktikum_3;

public class NotificationService {
    private NotificationStrategy Strategy;

    public NotificationService() {}

    public void setStrategy(NotificationStrategy strategy) {
        this.Strategy = strategy;
    }
    public void notifyUser(String message) {
        Strategy.send(message);
    }

}
