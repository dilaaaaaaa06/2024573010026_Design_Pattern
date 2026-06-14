1. Strategy Pattern sangat cocok digunakan dalam kasus pembayaran e-commerce karena sistem biasanya mendukung berbagai metode pembayaran yang memiliki proses berbeda, seperti kartu kredit, e-wallet, transfer bank, QRIS, atau metode lainnya.

Dengan Strategy Pattern, setiap metode pembayaran diimplementasikan dalam kelas terpisah yang memiliki interface yang sama (PaymentStrategy). Hal ini memungkinkan sistem memilih metode pembayaran yang digunakan saat runtime tanpa mengubah kode utama pada proses checkout.

Beberapa alasan utama:

1. Fleksibel
- Pengguna dapat memilih metode pembayaran yang berbeda tanpa mengubah logika checkout.
- Sistem dapat mengganti strategi pembayaran secara dinamis sesuai pilihan pengguna.

2. Mudah Dikembangkan
- Jika ingin menambahkan metode pembayaran baru, misalnya QRIS atau PayLater, cukup membuat kelas baru yang mengimplementasikan PaymentStrategy.
- Tidak perlu memodifikasi kode pada kelas Checkout.

3. Mengurangi Percabangan
- Tanpa Strategy Pattern, program biasanya menggunakan banyak if-else atau switch-case untuk menentukan metode pembayaran.
- Strategy Pattern membuat kode lebih rapi dan mudah dipahami.

4. Mematuhi Prinsip OOP
- Mendukung Open/Closed Principle (OCP), yaitu sistem terbuka untuk pengembangan tetapi tertutup untuk modifikasi.
- Setiap metode pembayaran memiliki tanggung jawab masing-masing (Single Responsibility Principle).

5. Mudah Dipelihara dan Diuji
- Setiap strategi pembayaran dapat diuji secara terpisah.
- Perubahan pada satu metode pembayaran tidak memengaruhi metode pembayaran lainnya.

Strategy Pattern cocok untuk pembayaran e-commerce karena menyediakan cara yang fleksibel, terstruktur, dan mudah dikembangkan untuk menangani berbagai metode pembayaran yang memiliki perilaku berbeda tanpa mengubah logika utama sistem checkout.

2. Bagaimana jika ingin menambahkan metode pembayaran QRIS?

Cukup membuat kelas baru yang mengimplementasikan PaymentStrategy tanpa mengubah kelas Checkout.

Contoh:

    public class QRISPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran sebesar Rp" + amount +
                           " menggunakan QRIS berhasil.");
    }
    }

Penggunaan:

    checkout.setPaymentStrategy(new QRISPayment());
    checkout.processPayment(75000);


