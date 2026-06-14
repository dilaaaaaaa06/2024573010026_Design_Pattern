package modul_4.latihan;

public class OrderPrinter {
    public void print(Order order, double total) {
        System.out.println("===== STRUK =====");
        System.out.println("Produk: " + order.getProduct());
        System.out.println("Jumlah: " + order.getQuantity());
        System.out.println("Harga: " + order.getPrice());
        System.out.println("Total: " + total);
        System.out.println("=================");
    }
}
