package modul_3.bagian_3.latihan;

public class Laptop {
    private Processor processor;
    private RAM ram;

    // Constructor (Composition)
    public Laptop() {
        processor = new Processor();
        ram = new RAM();
    }

    public void nyalakanLaptop() {
        System.out.println("Laptop dinyalakan.");
        processor.jalankan();
    }

    public void gunakanRAM() {
        ram.baca();
        ram.tulis();
    }
}