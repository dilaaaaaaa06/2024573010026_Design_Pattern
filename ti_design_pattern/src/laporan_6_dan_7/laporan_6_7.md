# Laporan Praktikum 6: SOLID Principle : Liskov Subtitution Principle (LSP)
**Mata Kuliah:** Praktikum Design Pattern  
**Nama:** Nurul Fadila  
**NIM:** 2024573010026  
**Kelas:** TI 2A

---

## 1. Abstrak
Praktikum ini bertujuan untuk memahami dan menerapkan salah satu prinsip dalam SOLID, yaitu Liskov Substitution Principle (LSP), pada pengembangan perangkat lunak berorientasi objek. LSP menyatakan bahwa objek dari kelas turunan harus dapat menggantikan objek dari kelas induknya tanpa mengubah kebenaran atau perilaku program. Dalam praktikum ini dilakukan analisis terhadap desain kelas yang melanggar prinsip LSP serta perbaikan desain agar sesuai dengan prinsip tersebut. Implementasi dilakukan menggunakan bahasa pemrograman Java dengan memanfaatkan konsep pewarisan (inheritance), abstraksi, dan polimorfisme.

Hasil praktikum menunjukkan bahwa pelanggaran terhadap LSP dapat menyebabkan perilaku program yang tidak konsisten dan berpotensi menimbulkan kesalahan saat objek turunan digunakan sebagai pengganti objek induk. Dengan menerapkan LSP, struktur program menjadi lebih fleksibel, mudah dipelihara, dan mendukung pengembangan sistem yang lebih baik. Selain itu, penerapan prinsip ini juga membantu meningkatkan kualitas desain perangkat lunak karena setiap kelas memiliki hubungan pewarisan yang sesuai dengan perilaku yang diharapkan.

#### Dasar Teori
SOLID adalah lima prinsip desain dalam pemrograman berorientasi objek (OOP) yang membantu dalam menciptakan perangkat lunak yang mudah dipelihara dan dikembangkan. SOLID terdiri dari:

1. Single Responsibility Principle (SRP)
2. Open-Closed Principle (OCP)
3. Liskov Substitution Principle (LSP)
4. Interface Segregation Principle (ISP)
5. Dependency Inversion Principle (DIP)

Liskov Substitution Principle adalah salah satu prinsip dalam SOLID principles yang pertama kali diperkenalkan oleh Barbara Liskov pada tahun 1987. Prinsip ini menyatakan:

"Jika S adalah subtype dari T, maka objek-objek dari tipe T dalam program harus dapat digantikan dengan objek-objek dari tipe S tanpa mengubah sifat-sifat dari program."

Dalam konteks pemrograman berorientasi objek, ini berarti kelas turunan (subclass) harus bisa digunakan sebagai pengganti kelas induknya (superclass) tanpa menyebabkan kesalahan atau perubahan perilaku yang tidak diinginkan. Objek dari kelas turunan bisa digunakan di mana pun objek dari kelas induknya digunakan tanpa merusak atau mengubah perilaku program yang sudah berjalan dengan benar.

Tujuan utama dari LSP adalah untuk menjaga keandalan dan kestabilan program saat melakukan substitusi objek. Artinya, ketika kita menggunakan objek dari kelas turunan, program tetap bekerja seperti ketika menggunakan objek dari kelas induknya.

---
### Langkah Praktikum Liskov Subtitution Principle (LSP)

### Praktikum 1 : Rectangle-Square Problem
~ Kode yang melanggar aturan LSP
1. Buat sebuah package baru di dalam Praktikum_6 dan beri nama bagian_1
2. Buat sebuah package baru di dalam praktikum_1 dan beri nama tanpa_lsp
3. Buat class baru di dalam tanpa_lsp dengan nama Rectangle dan isikan kode seperti berikut:

            package Praktikum_6.bagian_1.tanpa_lsp;
            
         public class Rectangle {
          protected int width;
          protected int height;
            
          public void setWidth(int width) {
              this.width = width;
          }
            
          public void setHeight(int height) {
              this.height = height;
          }
            
          public int calculateArea() {
              return width * height;
          }
         }
4. Buat class Square dan isikan kode berikut:

        package Praktikum_6.bagian_1.tanpa_lsp;
        
        public class Square extends Rectangle {
        
            @Override
            public void setWidth(int width) {
                super.setWidth(width);
                super.setHeight(width); // Violation: Merubah property height
            }
        
            @Override
            public void setHeight(int height) {
                super.setHeight(height);
                super.setWidth(height); // Violation: Merubah property width
            }
        }
5. Buat class Main dan isikan kode berikut:

               package Praktikum_6.bagian_1.tanpa_lsp;
            
         public class Main {
            
             public static void testRectangle(Rectangle r) {
                 r.setWidth(5);
                 r.setHeight(4);
                 System.out.println("Hasil yang diharapkan: 20, Hasil output: " + r.calculateArea());
             }
            
             public static void main(String[] args) {
                 Rectangle rect = new Rectangle();
                 testRectangle(rect); // Hasilnya benar
            
                 Rectangle square = new Square();
                 testRectangle(square); // Gagal! Nilai yang di outputkan 16, seharusnya 20
             }
         }
6. Jalankan dan lihat hasilnya.
![Screenshot 2026-06-14 073948.png](gambar/Screenshot%202026-06-14%20073948.png)
   

~ Refactor kode di atas untuk mematuhi aturan LSP

1. Buat sebuah package baru di dalam praktikum_1 dan beri nama dengan_lsp
2. Buat sebuah interface dengan nama Shape dan isikan kode berikut:

        package Praktikum_6.bagian_1.dengan_lsp;
        
        public interface Shape {
        int calculateArea();
        }
3. Buat sebuah class dengan nama Rectangle dan isikan kode berikut:

        package Praktikum_6.bagian_1.dengan_lsp;
        
        public class Rectangle implements Shape{
        private int width;
        private int height;
        
            public Rectangle(int width, int height) {
                this.width =width;
                this.height = height;
            }
        
            @Override
            public int calculateArea() {
                return width * height;
            }
        }
4. Buat sebuah class dengan nama Square dan isikan kode berikut:

        package Praktikum_6.bagian_1.dengan_lsp;
        
        public class Square implements Shape{
        private int side;
        
            public Square(int side) {
                this.side = side;
            }
        
            @Override
            public int calculateArea() {
                return side * side;
            }
        }
5. Buat sebuah class Main dan isikan kode berikut:

        package Praktikum_6.bagian_1.dengan_lsp;
        
        public class Main {
        public static void printArea(Shape shape) {
        System.out.println("Luas: " + shape.calculateArea());
        }
        
            public static void main(String[] args) {
                Shape rectangle = new Rectangle(5, 4);
                Shape square = new Square(4);
        
                printArea(rectangle);
                printArea(square);
        
            }
        }
6. Jalankan dan lihat hasilnya.
![Screenshot 2026-06-14 073514.png](gambar/Screenshot%202026-06-14%20073514.png)




## Praktikum 2 : Sistem Posting Media Sosial

### Langkah praktikum

~ Kode yang melanggar aturan OCP
1. Buat sebuah package baru di dalam modul_6 dan beri nama praktikum_2
2. Buat sebuah package baru di dalam praktikum_2 dan beri nama tanpa_lsp
3. Buat class baru di dalam tanpa_lsp dengan nama SocialMediaPost dan isikan kode seperti berikut:

        package Praktikum_6.bagian_2.tanpa_lsp;
        
        public class SocialMediaPost {
        protected String content;
        
            public SocialMediaPost(String content){
                this.content = content;
        
            }
        
            public void publish() {
                System.out.println("Publishing post: " + content);
            }
        
            public int calculateMaxCharacters() {
                return 1000;
            }
        }
4. Buat class TwitterPost dan isikan kode berikut:

        package Praktikum_6.bagian_2.tanpa_lsp;
        
        public class TwitterPost extends SocialMediaPost{
        public TwitterPost(String content) {
        super(content);
        }
        @Override
        public int calculateMaxCharacters() {
        return 280;
        }
        
            @Override
            public void publish() {
                if (content.length() > calculateMaxCharacters()) {
                    throw new IllegalArgumentException("Tweer melebihi batas karakter!");
                }
                System.out.println("Posting tweet: " + content);
            }
        }
5. Buat class BlogPost dan isikan kode berikut:

        package Praktikum_6.bagian_2.tanpa_lsp;
        
        public class BlogPost extends SocialMediaPost{
        private boolean isDraft;
        
            public BlogPost(String content) {
                super(content);
                this.isDraft = true;
                }
                @Override
            public void publish() {
                if (!isDraft) {
                    throw new IllegalStateException("Blog ini sudah di publish!");
                }
                isDraft = false;
                super.publish();
            }
            public void editContent(String newContent) {
                if (!isDraft) {
                    throw new IllegalStateException("Blog yang sudah di publish tidak bisa diedit!");
                }
                this.content = newContent;
            }
        }
6. Buat class Main dan isikan kode berikut:

        package Praktikum_6.bagian_2.tanpa_lsp;
        
        public class Main {
        
            public static void sharePost(SocialMediaPost post) {
                try {
                    post.publish();
                    System.out.println("Maksimum karakter: " + post.calculateMaxCharacters());
                } catch (Exception e) {
                    System.out.println("Gagal membagi: " + e.getMessage());
                }
            }
        
            public static void main(String[] args) {
                SocialMediaPost tweet = new TwitterPost("Halo Twitter!");
                SocialMediaPost longTweet = new TwitterPost("Tweet ini sangat panjang, dan melebihi batas karakter... repeat(10)");
        
                SocialMediaPost blog = new BlogPost("Modul 6 - Liskov Substitution Principle");
        
                System.out.println("Memposting tweet yang valid:");
                sharePost(tweet);
        
                System.out.println("\nMemposting tweet yang tidak valid:");
                sharePost(longTweet); // Throws exception
        
                System.out.println("\nMemposting blog:");
                sharePost(blog);
        
                System.out.println("\nMemposting blog sekali lagi:");
                sharePost(blog); // Throws different exception
            }
        }
7. Jalankan dan lihat hasilnya.

![Screenshot 2026-06-14 074158.png](gambar/Screenshot%202026-06-14%20074158.png)

~ Refactor kode di atas untuk mematuhi aturan OCP
1. Buat sebuah package baru di dalam praktikum_2 dan beri nama dengan_lsp
2. Buat sebuah interface dengan nama Publishable dan isikan kode berikut:

        package Praktikum_6.bagian_2.dengan_lsp;
        
        public interface Publishable {
        void publish();
        boolean canPublish();
        int getMaxContentLength();
        }
3. Buat sebuah class dengan nama SocialPost dan isikan kode berikut:

        package Praktikum_6.bagian_2.dengan_lsp;
        
        public class SocialPost implements Publishable {
        protected String content;
        
            public SocialPost(String content) {
                this.content = content;
            }
        
            @Override
            public void publish() {
                System.out.println("Publishing: " + content);
            }
        
            @Override
            public boolean canPublish() {
                return content.length() <= getMaxContentLength();
            }
        
            @Override
            public int getMaxContentLength() {
                return 1000;
            }
        }
4. Buat sebuah class dengan nama TwitterPost dan isikan kode berikut:

        package Praktikum_6.bagian_2.dengan_lsp;
        
        public class TwitterPost implements Publishable {
        
            private static final int MAX_LENGTH = 200;
            private String content;
        
            public TwitterPost(String content) {
                this.content = content;
            }
        
            @Override
            public void publish() {
                if (!canPublish()) {
                    throw new IllegalArgumentException(
                            "Tweet exceeds " + MAX_LENGTH + " characters"
                    );
                }
                System.out.println("Posting tweet: " + content);
            }
        
            @Override
            public boolean canPublish() {
                return content.length() <= MAX_LENGTH;
            }
        
            @Override
            public int getMaxContentLength() {
                return MAX_LENGTH;
            }
        }
5. Buat sebuah class dengan nama BlogPost dan isikan kode berikut:

        package Praktikum_6.bagian_2.dengan_lsp;
        
        public class BlogPost implements Publishable{
        private String content;
        private boolean isPublished;
        
            public BlogPost(String content) {
                this.content = content;
                this.isPublished = false;
            }
        
            @Override
            public void publish() {
                if (isPublished) {
                    return; // Idempotent operation
                }
                isPublished = true;
                System.out.println("Publishing blog: " + content);
            }
        
            @Override
            public boolean canPublish() {
                return !isPublished;
            }
        
            @Override
            public int getMaxContentLength() {
                return Integer.MAX_VALUE; // No practical limit
            }
        
            public void editContent(String newContent) {
                if (isPublished) {
                    System.out.println("Adding update to published blog");
                }
                this.content = newContent;
            }
        }
6. Buat sebuah class Main dan isikan kode berikut:

        package Praktikum_6.bagian_2.dengan_lsp;
        
        public class Main {
        public static void sharePost(Publishable post) {
        if (post.canPublish()) {
        post.publish();
        System.out.println("Max length: " + post.getMaxContentLength());
        } else {
        System.out.println("Cannot publish this post now");
        }
        }
        
            public static void main(String[] args) {
                Publishable tweet = new TwitterPost("Hello Twitter!");
                Publishable longTweet = new TwitterPost("This is way too long...".repeat(20));
                Publishable blog = new BlogPost("My thoughts on clean code");
        
                System.out.println("Sharing valid tweet:");
                sharePost(tweet);
        
                System.out.println("\nSharing invalid tweet:");
                sharePost(longTweet);
        
                System.out.println("\nSharing blog post:");
                sharePost(blog);
        
                System.out.println("\nSharing blog post again:");
                sharePost(blog); // Now handles gracefully
        
                System.out.println("\nEditing published blog:");
                ((BlogPost) blog).editContent("Updated thoughts on clean code");
            }
        }
7. Jalankan dan lihat hasilnya.

![Screenshot 2026-06-14 074319.png](gambar/Screenshot%202026-06-14%20074319.png)


## LATIHAN LSP

1. Membuat file Interface baru bernama Navigable.java
2. isikan kode berikut:

        package Praktikum_6.Latihan;
        
        public interface Navigable {
        void navigateTo(String destination);
        }
3. Membuat Class Vehicle, isikan kode berikut:

        package Praktikum_6.Latihan;
        
        public class Vehicle {
        
            public void startEngine() {
                System.out.println("Engine started");
            }
        }
4. Membuat Class Car, isikan kode berikut:

        package Praktikum_6.Latihan;
        
        public class Car extends Vehicle implements Navigable {
        
            @Override
            public void navigateTo(String destination) {
                System.out.println("Calculating car route to " + destination);
            }
        }
5. Membuat Class Bicycle, isikan kode berikut:

        package Praktikum_6.Latihan;
        
        public class Bicycle extends Vehicle {
        
            @Override
            public void startEngine() {
                System.out.println("Bicycle does not require an engine");
            }
        }
6. Membuat Class Main, isikan kode berikut:

        package Praktikum_6.Latihan;
        
        public class Main {
        
            public static void beginTrip(
                    Vehicle vehicle,
                    String destination) {
        
                vehicle.startEngine();
        
                if (vehicle instanceof Navigable) {
                    ((Navigable) vehicle).navigateTo(destination);
                } else {
                    System.out.println(
                            "Manual navigation to "
                                    + destination);
                }
            }
        
            public static void main(String[] args) {
        
                Vehicle car = new Car();
                Vehicle bike = new Bicycle();
        
                System.out.println("=== CAR ===");
                beginTrip(car, "Central Park");
        
                System.out.println();
        
                System.out.println("=== BICYCLE ===");
                beginTrip(bike, "Central Park");
            }
        }
7. Jalankan dan lihat hasilnya.

![Screenshot 2026-06-14 074440.png](gambar/Screenshot%202026-06-14%20074440.png)

## SOLUSI

1. Interface Navigable dibuat untuk menampung fitur navigasi.
2. Class Car mengimplementasikan Navigable karena mobil memiliki kemampuan navigasi.
3. Class Bicycle tidak mengimplementasikan Navigable karena sepeda tidak memiliki fitur tersebut.
4. Method beginTrip() hanya menerima objek bertipe Navigable.
5. Dengan demikian tidak ada lagi exception saat program dijalankan dan desain program telah memenuhi prinsip Liskov Substitution Principle (LSP).


## Laporan Praktikum 7: Strategy Pattern

### Praktikum1: Program Navigasi Sederhana

### Langkah Praktikum

1. Buat sebuah package baru di dalam Praktikum_7 dan beri nama bagian_1
2. Kemudian buat sebuah interface RouteStrategy dan isikan kode berikut:

        package Praktikum_7.bagian_1;
        
        // Strategy Interface
        interface RouteStrategy {
        void buildRoute(String from, String to);
        }
3. Buat class WalkingRoute dan isikan kode berikut:

        package Praktikum_7.bagian_1;
        
        // Strategy
        public class WalkingRoute implements RouteStrategy {
        
            public void buildRoute(String from, String to) {
                System.out.println("Membuat rute jalan kaki dari " + from + " ke " + to);
            }
        }
4. Buat class DrivingRoute dan isikan kode berikut:

        package Praktikum_7.bagian_1;
        
        // Strategy
        public class DrivingRoute implements RouteStrategy {
        
            public void buildRoute(String from, String to) {
                System.out.println("Membuat rute berkendara dari " + from + " ke " + to);
            }
        }
5. Buat class PublicTransportRoute dan isikan kode berikut:

        package Praktikum_7.bagian_1;
        
        // Strategy
        public class PublictransportRoute implements RouteStrategy {
        
            public void buildRoute(String from, String to) {
                System.out.println("Membuat rute transportasi umum dari " + from + " ke " + to);
            }
        }
6. Buat class Navigator dan isikan kode berikut:

        package Praktikum_7.bagian_1;
        
        // Context
        public class Navigator {
        
            private RouteStrategy strategy;
        
            public Navigator() {}
        
            public void setStrategy(RouteStrategy strategy) {
                this.strategy = strategy;
            }
        
            public void navigate(String from, String to) {
                strategy.buildRoute(from, to);
            }
        }
7. Buat class Main dan isikan kode berikut:

        package Praktikum_7.bagian_1;
        
        
        public class Main {
        
            public static void main(String[] args) {
        
                Navigator nav = new Navigator();
        
                nav.setStrategy(new WalkingRoute());
                nav.navigate("Kampus", "Kos");
        
                nav.setStrategy(new DrivingRoute());
                nav.navigate("Kampus", "Mall");
        
                nav.setStrategy(new PublictransportRoute());
                nav.navigate("Kampus", "Stasiun");
            }
        }
8. Jalankan dan lihat hasilnya

![Screenshot 2026-06-14 074656.png](gambar/Screenshot%202026-06-14%20074656.png)

### Praktikum 2 : Program Filter Foto Sederhana

### Langkah Praktikum

1. Buat sebuah package baru di dalam modul_9 dan beri nama praktikum_2
2. Kemudian buat sebuah interface FilterStrategy dan isikan kode berikut:

        package Praktikum_7.bagian_2;
        
        public interface FilterStrategy {
        void apply(String fileName);
        }
3. Buat class BlackWhiteFilter dan isikan kode berikut:

        package Praktikum_7.bagian_2;
        
        public class BlackWhiteFilter implements FilterStrategy{
        public void apply(String fileName) {
        System.out.println("Menerapkan filter hitam-putih pada " + fileName);
        }
        }
4. Buat class SepiaFilter dan isikan kode berikut:

        package Praktikum_7.bagian_2;
        
        public class SepiaFilter implements FilterStrategy{
        public void apply(String fileName) {
        System.out.println("Menerapkan filter sephia pada " + fileName);
        }
        }
5. Buat class BrightFilter dan isikan kode berikut:

        package Praktikum_7.bagian_2;
        
        public class BrightFilter implements FilterStrategy{
        public void apply(String fileName) {
        System.out.println("Menerapkan filter cerah pada " + fileName);
        }
        }
6. Buat class PhotoEditor dan isikan kode berikut:

        package Praktikum_7.bagian_2;
        
        public class PhotoEditor {
        private FilterStrategy filter;
        
            public PhotoEditor() {}
        
            public void setFilter(FilterStrategy filter) {
                this.filter = filter;
            }
        
            public void applyFilter(String fileName) {
                filter.apply(fileName);
            }
        }
7. Buat class Main dan isikan kode berikut:

        package Praktikum_7.bagian_2;
        
        public class Main {
        public static void main(String[] args) {
        PhotoEditor editor = new PhotoEditor();
        
                editor.setFilter(new BlackWhiteFilter());
                editor.applyFilter("foto1.jpg");
        
                editor.setFilter(new SepiaFilter());
                editor.applyFilter("foto2.jpg");
        
                editor.setFilter(new BrightFilter());
                editor.applyFilter("foto3.jpg");
            }
        }
8. Jalankan dan lihat hasilnya.
![Screenshot 2026-06-14 074941.png](gambar/Screenshot%202026-06-14%20074941.png)


### Praktikum 3 : Program Notifikasi

### Langkah Praktikum
1. Buat sebuah package baru di dalam modul_9 dan beri nama praktikum_3
2. Kemudian buat sebuah interface NotificationStrategy dan isikan kode berikut:

        package Praktikum_7.bagian_3;
        
        public interface NotificationStrategy {
        void send(String message);
        }
3. Buat class EmailNotification dan isikan kode berikut:

        package Praktikum_7.bagian_3;
        
        public class EmailNotification implements NotificationStrategy{
        public void send(String message) {
        System.out.println("Mengirim email: " + message);
        }
        }
4. Buat class SMSNotification dan isikan kode berikut:

        package Praktikum_7.bagian_3;
        
        public class SMSNotification implements NotificationStrategy{
        public void send(String message) {
        System.out.println("Mengirim SMS: " + message);
        }
        }
5. Buat class PushNotificationdan isikan kode berikut:

        package Praktikum_7.bagian_3;
        
        public class PushNotification implements NotificationStrategy{
        public void send(String message) {
        System.out.println("Mengirim notifikasi push: " + message);
        }
        }
6. Buat class NotificationService dan isikan kode berikut:

        package Praktikum_7.bagian_3;
        
        public class NotificationService {
        private NotificationStrategy strategy;
        
            public NotificationService() {}
        
            public void setStrategy(NotificationStrategy strategy) {
                this.strategy = strategy;
            }
        
            public void notifyUser(String message) {
                strategy.send(message);
            }
        }
7. Buat class Main dan isikan kode berikut:

        package Praktikum_7.bagian_3;
        
        public class Main {
        public static void main(String[] args) {
        NotificationService notif = new NotificationService();
        
                notif.setStrategy(new EmailNotification());
                notif.notifyUser("Selamat, akun anda berhasil dibuat!");
        
                notif.setStrategy(new SMSNotification());
                notif.notifyUser("Kode OTP anda: 123456");
        
                notif.setStrategy(new PushNotification());
                notif.notifyUser("Ada promo baru menanti anda! ");
            }
        }
8. Jalankan dan lihat hasilnya.
![Screenshot 2026-06-14 075202.png](gambar/Screenshot%202026-06-14%20075202.png)

###  analisis

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




###  Latihan : Program Pembayaran E-Commerce (Strategy Pattern)

1. Membuat interface PaymentStrategy, isikan kode berikut:

        package Praktikum_7.Latihan.Praktikum;
        
        public interface PaymentStrategy {
        void pay(double amount);
        }
2. Membuat class CreditCardPayment, EWalletPayment, dan BankTransferPayment yang mengimplementasikan interface PaymentStrategy, lalu isikan kode berikut:

        package Praktikum_7.Latihan.Praktikum;
        
        public class CreditCardPayment implements PaymentStrategy {
        
            @Override
            public void pay(double amount) {
                System.out.println(
                        "Pembayaran Rp" + amount +
                                " menggunakan Kartu Kredit");
            }
        }
3. Membuat class Checkout sebagai Context Class, lalu isikan kode berikut:

        package Praktikum_7.Latihan.Praktikum;
        
        public class Checkout {
        
            private PaymentStrategy paymentStrategy;
        
            public void setPaymentStrategy(
                    PaymentStrategy paymentStrategy) {
        
                this.paymentStrategy = paymentStrategy;
            }
        
            public void processPayment(double amount) {
        
                paymentStrategy.pay(amount);
            }
        }
4. Membuat class BankTransferPayment

        package Praktikum_7.Latihan.Praktikum;
        
        public class BankTransferPayment implements PaymentStrategy {
        
            @Override
            public void pay(double amount) {
                System.out.println(
                        "Pembayaran Rp" + amount +
                                " menggunakan Transfer Bank");
            }
        }
6. Membuat class Main untuk menjalankan program, lalu isikan kode berikut:

        package Praktikum_7.Latihan.Praktikum;
        
        public class Main {
        
            public static void main(String[] args) {
        
                Checkout checkout = new Checkout();
        
                checkout.setPaymentStrategy(
                        new CreditCardPayment());
        
                checkout.processPayment(500000);
        
                checkout.setPaymentStrategy(
                        new EWalletPayment());
        
                checkout.processPayment(250000);
        
                checkout.setPaymentStrategy(
                        new BankTransferPayment());
        
                checkout.processPayment(1000000);
            }
        }

7. Jalankan dan lihat hasilnya:

![Screenshot 2026-06-14 075320.png](gambar/Screenshot%202026-06-14%20075320.png)


## 3. Kesimpulan

Berdasarkan hasil praktikum, dapat disimpulkan bahwa penerapan Liskov Substitution Principle (LSP) dan Strategy Pattern membantu dalam membangun perangkat lunak yang lebih fleksibel, terstruktur, dan mudah dikembangkan. LSP memastikan bahwa objek dari kelas turunan dapat menggantikan objek kelas induknya tanpa mengubah perilaku program, sehingga hubungan pewarisan menjadi lebih tepat dan konsisten.

Sementara itu, Strategy Pattern memungkinkan pemisahan berbagai algoritma atau metode ke dalam kelas-kelas yang terpisah sehingga dapat dipilih dan diganti secara dinamis saat program berjalan. Pada kasus sistem pembayaran e-commerce, metode pembayaran seperti Kartu Kredit, E-Wallet, dan Transfer Bank dapat digunakan secara bergantian tanpa perlu mengubah kode utama aplikasi.

Dengan menerapkan kedua konsep tersebut, program menjadi lebih mudah dipelihara, dikembangkan, dan memenuhi prinsip-prinsip pemrograman berorientasi objek yang baik, khususnya dalam meningkatkan fleksibilitas dan mengurangi ketergantungan antar komponen.

## 4. Referensi

1. https://hackmd.io/@mohdrzu/ByhonGtkel
2. https://hackmd.io/@mohdrzu/rJVfsRGflg