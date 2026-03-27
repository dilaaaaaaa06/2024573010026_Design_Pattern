# Laporan Praktikum 2: Review 4 Pillar OOP Menggunakan Java
**Mata Kuliah:** Praktikum Design Pattern  
**Nama:** Nurul Fadila  
**NIM:** 2024573010026  
**Kelas:** TI 2A

---

## 1. Abstrak
Praktikum ini bertujuan untuk memahami konsep dasar Object-Oriented Programming (OOP) menggunakan Java, yang meliputi enkapsulasi, inheritance, polimorfisme, dan abstraksi. Setiap konsep diimplementasikan melalui pembuatan class dan method sesuai fungsinya. Hasil praktikum menunjukkan bahwa penerapan keempat pilar OOP dapat membuat program lebih terstruktur, modular, dan mudah dikembangkan.

---
## 2. Praktikum
### Praktikum 1 - Pengenalan OOP dan Class-Object
#### Dasar Teori
OOP (Object-Oriented Programming) adalah paradigma pemrograman yang menggunakan "objek" untuk merepresentasikan data dan metode yang beroperasi pada data tersebut. Konsep dasar OOP:

1. Class: Blueprint atau template untuk membuat objek.
2. Object: Instance dari class yang memiliki atribut dan metode.

#### Langkah Praktikum
1. Buka project pada praktikum sebelumnya menggunakan intellij IDEA
2. Buat sebuah package baru di dalam folder src dengan cara klik kanan pada folder src kemudian pilih New -> Package. Beri nama modul_3.
3. Buat Sebuah package baru lagi didalam package modul_3 dengan cara klik kanan dan pilih New -> Package. Beri nama bagian_1
4. Kemudian buat sebuah class baru dengan nama Mahasiswa dan isikan kode berikut:
  
          public class Mahasiswa {
          String nama;
          int umur;

           // Metode
          void displayInfo() {
          System.out.println("Nama: " + nama);
          System.out.println("Umur: " + umur);
          }
          }
5. Selanjutnya, buat sebuah class baru dengan nama Main dan isikan kode berikut:

            public class Main {
         public static void main(String[] args) {
          // Membuat objek
         Mahasiswa mhs1 = new Mahasiswa();
          mhs1.nama = "Budi";
          mhs1.umur = 20;

        // Memanggil metode
        mhs1.displayInfo();
         }

          }

#### Screenshoot Hasil
![Bagian 1 - Pengenalan OOP dan Class-Object.png](gambar/Bagian%201%20-%20Pengenalan%20OOP%20dan%20Class-Object.png)

#### Analisa dan Pembahasan
1. Analisa Class Mahasiswa

Class Mahasiswa merupakan sebuah blueprint yang digunakan untuk merepresentasikan objek mahasiswa. Di dalam class ini terdapat dua atribut, yaitu nama bertipe String dan umur bertipe int, yang berfungsi untuk menyimpan data mahasiswa.

Selain itu, terdapat method displayInfo() yang digunakan untuk menampilkan nilai dari atribut nama dan umur ke layar. Method ini memanfaatkan perintah System.out.println() untuk mencetak output.

2. Analisa Class Main

Class Main berfungsi sebagai class utama yang berisi method main() sebagai titik awal eksekusi program. Pada class ini dilakukan pembuatan objek dari class Mahasiswa dengan nama mhs1.

Setelah objek dibuat, nilai atribut diisi secara langsung, yaitu nama diisi dengan "Budi" dan umur diisi dengan nilai 20. Selanjutnya, method displayInfo() dipanggil untuk menampilkan data mahasiswa tersebut.

3. Konsep OOP yang Digunakan

Kode ini telah menerapkan beberapa konsep dasar Object-Oriented Programming, yaitu:

Class dan Object: Class Mahasiswa sebagai cetak biru, dan objek mhs1 sebagai implementasinya.
Atribut: Variabel nama dan umur sebagai penyimpan data.
Method: Method displayInfo() untuk menampilkan data.

### Praktikum 2 - Encapsulation (Enkapsulasi)
#### Dasar Teori
Encapsulation adalah konsep menyembunyikan detail internal objek dan hanya mengekspos fungsionalitas yang diperlukan. Ini dilakukan dengan menggunakan access modifier (private, public, protected) dan getter-setter.

#### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package modul_3 dengan cara klik kanan dan pilih New -> Package. Beri nama bagian_2
2. Kemudian buat sebuah class baru dengan nama Mahasiswa dan isikan kode berikut:

            public class Mahasiswa {
         private String nama;
         private int umur;

         // Getter dan Setter
         public String getNama() {
         return nama;
          }

          public void setNama(String nama) {
          this.nama = nama;
          }

         public int getUmur() {
         return umur;
         }

          public void setUmur(int umur) {
         this.umur = umur;
          }
          }

3. Kemudian buat sebuah class baru dengan nama Main dan isikan kode berikut:

         public class Main {
         public static void main(String[] args) {
          Mahasiswa mhs1 = new Mahasiswa();
         mhs1.setNama("Budi");
         mhs1.setUmur(20);

        System.out.println("Nama : " + mhs1.getNama());
        System.out.println("Umur : " + mhs1.getUmur());
         }
         }
4. Jalankan program untuk melihat hasilnya.

#### Screenshoot Hasil
![Bagian 2 - Encapsulation (Enkapsulasi).png](gambar/Bagian%202%20-%20Encapsulation%20%28Enkapsulasi%29.png)

#### Analisa dan Pembahasan
1. Analisa Class Mahasiswa

Class Mahasiswa digunakan untuk merepresentasikan data seorang mahasiswa. Pada class ini terdapat dua atribut, yaitu nama bertipe String dan umur bertipe int. Kedua atribut tersebut diberi access modifier private, yang berarti tidak dapat diakses secara langsung dari luar class.

Untuk mengakses dan mengubah nilai atribut, disediakan method getter dan setter, yaitu:

getNama() dan setNama() untuk atribut nama
getUmur() dan setUmur() untuk atribut umur

Getter digunakan untuk mengambil nilai atribut, sedangkan setter digunakan untuk mengubah nilai atribut. Dengan cara ini, data dalam class lebih terlindungi dan terkontrol.

2. Analisa Class Main

Class Main berfungsi sebagai class utama yang menjalankan program melalui method main(). Pada bagian ini dilakukan pembuatan objek Mahasiswa dengan nama mhs1.

Nilai atribut tidak diisi secara langsung, melainkan melalui method setter:

setNama("Budi") untuk mengisi nama
setUmur(20) untuk mengisi umur

Selanjutnya, nilai atribut ditampilkan menggunakan method getter, yaitu getNama() dan getUmur(), yang kemudian dicetak menggunakan System.out.println().

3. Konsep OOP yang Digunakan

Kode ini menerapkan konsep enkapsulasi, yaitu menyembunyikan data dengan menggunakan access modifier private serta menyediakan akses melalui method getter dan setter. Dengan demikian, data menjadi lebih aman dan tidak dapat diubah secara sembarangan dari luar class.

Selain itu, kode juga menerapkan konsep dasar OOP lainnya, seperti:

Class dan Object: Class Mahasiswa dan objek mhs1
Atribut: nama dan umur
Method: Getter dan setter sebagai pengelola data


### Praktikum 3 - Inheritance (Pewarisan) dan Composition (Komposisi)
#### Dasar Teori Inheritance (Pewarisan)
Dalam pemrograman berorientasi objek (OOP), Inheritance dan Composition adalah dua konsep penting yang digunakan untuk membangun hubungan antara class. Meskipun keduanya memiliki tujuan yang sama, yaitu mempromosikan reuseability (penggunaan kembali kode) dan modularitas, mereka memiliki pendekatan yang berbeda. Berikut adalah penjelasan lengkap tentang Composition dan perbandingannya dengan Inheritance.

Inheritance (Pewarisan)
Inheritance adalah mekanisme di mana sebuah class (subclass/child class) mewarisi atribut dan metode dari class lain (superclass/parent class). Inheritance menggambarkan hubungan "is-a" (adalah). Misalnya, Kucing adalah Hewan.

Ciri-Ciri Inheritance:
- Menggunakan keyword extends.
- Subclass mewarisi semua atribut dan metode dari superclass (kecuali yang private).
- Subclass dapat menambahkan atribut dan metode baru, atau meng-override metode yang ada.
- Mendukung hierarki class (class dapat mewarisi dari satu superclass).

#### Langkah Praktikum Inheritance (Pewarisan)
1. Buat Sebuah package baru lagi didalam package modul_3 dengan cara klik kanan dan pilih New -> Package. Beri nama bagian_3
2. Buat package baru di dalam bagian_3 dan beri nama pewarisan
3. Kemudian buat sebuah class baru dengan nama Kendaraan dan isikan kode berikut:

          public class Kendaraan {
         String merk;
         int tahun;

         void displayInfo() {
         System.out.println("Merk : " + merk);
         System.out.println("Tahun :" + tahun);
         }
         }

4. Kemudian buat sebuah class baru dengan nama Mobil dan isikan kode berikut:
   
         public class Mobil extends Kendaraan {
         int jumlahPintu;

         void displayInfoMobil() {
         displayInfo();
         System.out.println("Jumlah Pntu: " + jumlahPintu);
          }
          }

5. Kemudian buat sebuah class baru dengan nama Main dan isikan kode berikut:

         public class Mobil extends Kendaraan {
          int jumlahPintu;

          void displayInfoMobil() {
        displayInfo();
        System.out.println("Jumlah Pntu: " + jumlahPintu);
       }
          }
6. Jalankan program dan lihat hasilnya.

#### Screenshoot Hasil
![Bagian 3 - Inheritance (Pewarisan).png](gambar/Bagian%203%20-%20Inheritance%20%28Pewarisan%29.png)

#### Analisa dan Pembahasan
1. Analisa Class Kendaraan

Class Kendaraan merupakan class induk (superclass) yang digunakan untuk merepresentasikan data umum sebuah kendaraan. Class ini memiliki dua atribut, yaitu merk bertipe String dan tahun bertipe int.

Selain itu, terdapat method displayInfo() yang berfungsi untuk menampilkan informasi kendaraan, yaitu merk dan tahun. Method ini dapat digunakan kembali oleh class turunan.

2. Analisa Class Mobil

Class Mobil merupakan class turunan (subclass) dari class Kendaraan, yang ditunjukkan dengan penggunaan kata kunci extends. Dengan adanya inheritance ini, class Mobil dapat mewarisi atribut dan method dari class Kendaraan.

Class Mobil memiliki atribut tambahan yaitu jumlahPintu yang bertipe int. Selain itu, terdapat method displayInfoMobil() yang berfungsi untuk menampilkan informasi lengkap mobil.

Di dalam method tersebut, method displayInfo() dari class induk dipanggil untuk menampilkan merk dan tahun, kemudian ditambahkan informasi jumlah pintu.

3. Analisa Class Main

Pada bagian yang diberikan, terdapat kesalahan penulisan karena class Main tidak dibuat, melainkan terjadi duplikasi class Mobil. Hal ini akan menyebabkan error karena dalam satu file tidak boleh terdapat dua class dengan nama yang sama.

Seharusnya, class Main digunakan sebagai class utama yang berisi method main() untuk menjalankan program dan menguji class Mobil.

4. Konsep OOP yang Digunakan

Kode ini menerapkan konsep inheritance (pewarisan), yaitu class Mobil mewarisi atribut dan method dari class Kendaraan. Dengan konsep ini, kode menjadi lebih efisien karena tidak perlu menuliskan ulang atribut dan method yang sama.

Selain itu, terdapat juga penggunaan:

Class dan Object sebagai dasar OOP
Method reuse, yaitu penggunaan kembali method displayInfo() pada subclass

#### Dasar Teori Composition (Komposisi)
Composition adalah mekanisme di mana sebuah class terdiri dari objek-objek dari class lain. Ini menggambarkan hubungan "has-a" (memiliki). Misalnya, Mobil memiliki Mesin. Composition memungkinkan kita untuk membangun class yang kompleks dengan menggabungkan objek-objek yang lebih sederhana.

Ciri-Ciri Composition:
Menggunakan instance variabel dari class lain.
Tidak ada keyword khusus, hanya menggunakan objek sebagai atribut.
Lebih fleksibel daripada inheritance karena tidak terikat pada hierarki class.
Mendukung reuseability tanpa perlu mewarisi class.
Langkah Praktikum

#### Langkah Praktikum Composition (Komposisi)
1. Buat package baru di dalam bagian_3 dan beri nama komposisi
2. Kemudian buat sebuah class baru dengan nama Mesin dan isikan kode berikut:

        public class Mesin {
         void hidupkan() {
         System.out.println("Mesin menyala. ");
         }
          void matikan() {
         System.out.println("Mesin dimatikan. ");
         }
         }

3. Kemudian buat sebuah class baru dengan nama Mobil dan isikan kode berikut:

        public class Mobil {
         private final Mesin mesin;

         public Mobil() {
         this.mesin = new Mesin();
         }

         void mulai() {
         mesin.hidupkan();
         System.out.println("Mobil siap digunakan.");
         }

         void berhenti() {
         mesin.matikan();
         System.out.println("Mobil berhenti.");
         }
         }

4. Kemudian buat sebuah class baru dengan nama Main dan isikan kode berikut:

         public class Main {
          public static void main (String[] args) {
       Mobil mobil = new Mobil();
          mobil.mulai();
          mobil.berhenti();
          }
          }

#### Screenshoot Hasil
![Bagian 3 - Composition (Komposisi).png](gambar/Bagian%203%20-%20Composition%20%28Komposisi%29.png)

#### Analisa dan Pembahasan
1. Analisa Class Mesin

Class Mesin merupakan class yang merepresentasikan komponen mesin pada sebuah mobil. Di dalam class ini terdapat dua method, yaitu hidupkan() dan matikan().

Method hidupkan() digunakan untuk menampilkan pesan bahwa mesin sedang dinyalakan.
Method matikan() digunakan untuk menampilkan pesan bahwa mesin dimatikan.

Class ini berfungsi sebagai komponen pendukung yang akan digunakan oleh class lain.

2. Analisa Class Mobil

Class Mobil merupakan class yang merepresentasikan sebuah mobil. Pada class ini terdapat atribut mesin yang bertipe Mesin dan diberi access modifier private final.

private menunjukkan bahwa atribut hanya dapat diakses di dalam class Mobil.
final menunjukkan bahwa objek mesin tidak dapat diubah setelah diinisialisasi.

Pada constructor Mobil(), dilakukan inisialisasi objek mesin dengan membuat instance baru dari class Mesin. Hal ini menunjukkan bahwa setiap objek Mobil pasti memiliki satu objek Mesin.

Class Mobil memiliki dua method, yaitu:

mulai(), yang memanggil method hidupkan() dari objek mesin dan menampilkan pesan bahwa mobil siap digunakan.
berhenti(), yang memanggil method matikan() dari objek mesin dan menampilkan pesan bahwa mobil berhenti.
3. Analisa Class Main

Class Main berfungsi sebagai class utama yang menjalankan program. Pada method main(), dibuat sebuah objek Mobil.

Selanjutnya, method mulai() dan berhenti() dipanggil untuk mensimulasikan proses menyalakan dan mematikan mobil. Output yang dihasilkan menunjukkan interaksi antara class Mobil dan Mesin.

4. Konsep OOP yang Digunakan

Kode ini menerapkan konsep composition, yaitu hubungan "has-a", di mana class Mobil memiliki objek Mesin sebagai bagian dari komponennya.

Selain itu, terdapat juga penerapan:

Encapsulation, melalui penggunaan access modifier private pada atribut mesin
Class dan Object, sebagai dasar dari OOP
Constructor, untuk inisialisasi objek

#### Langkah Praktikum Kombinasi inheritance dengan composition
Di dalam package bagian_3, buat sebuah class baru dan beri nama Main dan isikan kode berikut:

        // Class untuk Composition
        class Mesin {
        void hidupkan() {
    System.out.println("Mesin menyala.");
        }

    void matikan() {
        System.out.println("Mesin dimatikan.");
    }
    }

        // Superclass untuk Inheritance
        class Kendaraan {
        void bergerak() {
        System.out.println("Kendaraan sedang bergerak.");
        }
        }

        // Subclass yang menggunakan Composition dan Inheritance
        class Mobil extends Kendaraan {
        private Mesin mesin; // Composition

    public Mobil() {
        this.mesin = new Mesin(); // Membuat objek Mesin
    }

    void mulai() {
        mesin.hidupkan();
        System.out.println("Mobil siap digunakan.");
    }

    void berhenti() {
        mesin.matikan();
        System.out.println("Mobil berhenti.");
    }
    }

    // Main class (hanya satu!)
        public class Main {
        public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.mulai();     // Composition
        mobil.bergerak();  // Inheritance
        mobil.berhenti();  // Composition
        }
        }

#### Screenshoot Hasil
![Bagian 3 - Kombinasi Inheritance dan Komposisi.png](gambar/Bagian%203%20-%20Kombinasi%20Inheritance%20dan%20Komposisi.png)

#### Analisa dan Pembahasan
1. Analisa Class Mesin

Class Mesin merupakan class yang digunakan sebagai komponen dalam sistem. Class ini memiliki dua method, yaitu hidupkan() dan matikan(), yang berfungsi untuk mensimulasikan kondisi mesin saat dinyalakan dan dimatikan. Class ini tidak berdiri sendiri, melainkan digunakan oleh class lain sebagai bagian dari objek yang lebih kompleks.

2. Analisa Class Kendaraan

Class Kendaraan merupakan superclass yang mendefinisikan perilaku umum kendaraan, yaitu method bergerak(). Method ini digunakan untuk menampilkan bahwa kendaraan sedang bergerak. Class ini berperan sebagai induk yang dapat diwarisi oleh class lain.

3. Analisa Class Mobil

Class Mobil merupakan subclass dari Kendaraan, yang ditandai dengan penggunaan kata kunci extends. Dengan demikian, class Mobil mewarisi method bergerak() dari class Kendaraan.

Selain itu, class Mobil juga memiliki atribut mesin bertipe Mesin, yang menunjukkan adanya hubungan composition. Objek Mesin dibuat di dalam constructor Mobil, sehingga setiap objek Mobil pasti memiliki sebuah mesin.

Class Mobil memiliki beberapa method:

mulai(), yang memanggil method hidupkan() dari objek mesin dan menampilkan bahwa mobil siap digunakan.
berhenti(), yang memanggil method matikan() dari objek mesin dan menampilkan bahwa mobil berhenti.

Dengan demikian, class Mobil menggabungkan dua konsep, yaitu inheritance dan composition.

4. Analisa Class Main

Class Main merupakan class utama yang menjalankan program. Pada method main(), dibuat objek Mobil, kemudian beberapa method dipanggil untuk menunjukkan perilaku objek tersebut.

Method mulai() menunjukkan penggunaan composition, karena memanggil method dari objek Mesin.
Method bergerak() menunjukkan penggunaan inheritance, karena merupakan method yang diwarisi dari class Kendaraan.
Method berhenti() kembali menunjukkan penggunaan composition.
5. Konsep OOP yang Digunakan

Program ini menerapkan beberapa konsep Object-Oriented Programming, yaitu:

Inheritance (pewarisan): Class Mobil mewarisi method dari class Kendaraan.
Composition: Class Mobil memiliki objek Mesin sebagai bagian dari komponennya.
Encapsulation: Atribut mesin dibuat private untuk membatasi akses langsung dari luar class.
Class dan Object: Digunakan sebagai dasar dalam pembuatan program.

### Praktikum 5 - Polymorphism (Polimorfisme)
#### Dasar Teori Method Overriding
Polymorphism memungkinkan objek untuk memiliki banyak bentuk. Ini dapat dicapai melalui method overriding (mengganti metode di subclass) dan method overloading (beberapa metode dengan nama sama tetapi parameter berbeda).

Method Overriding
Method overriding terjadi ketika subclass (class anak) menyediakan implementasi spesifik untuk method yang sudah didefinisikan di superclass (class induk). Method overriding digunakan untuk mengubah atau memperluas perilaku method yang diwarisi dari superclass. Method yang di-override harus memiliki nama, parameter, dan return type yang sama dengan method di superclass.

Aturan Method Overriding:
Method harus memiliki nama dan parameter yang sama dengan method di superclass.
Return type harus sama atau subtype dari return type di superclass.
Access modifier tidak boleh lebih restriktif daripada method di superclass (misalnya, jika method di superclass protected, method di subclass bisa protected atau public).
Method tidak bisa di-override jika di superclass dideklarasikan sebagai final.

#### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package modul_3 dengan cara klik kanan dan pilih New -> Package. Beri nama bagian_4
2. Kemudian buat sebuah package baru di dalam bagian_4 dan beri nama overriding
3. Kemudian buat sebuah class baru dengan nama Hewan dan isikan kode berikut:

        class Hewan {
         void bersuara() {
          System.out.println("Hewan bersuara.");
             }
             }

4. Kemudian buat sebuah class baru dengan nama Kucing dan isikan kode berikut:

         class Kucing extends Hewan {
         @Override
         void bersuara() {
         System.out.println("Meong!");
         }
         }

5. Kemudian buat sebuah class baru dengan nama Anjing dan isikan kode berikut:

        class Anjing extends Hewan {
             @Override
         void bersuara() {
         System.out.println("Guk-Guk!");
         }
         }

6. Kemudian buat sebuah class baru dengan nama Main dan isikan kode berikut:

        public class Main {
         public static void main(String[] args) {
         Hewan hewan1 = new Kucing(); // Polymorphism
         Hewan hewan2 = new Anjing(); // Polymorphism

        hewan1.bersuara(); // Output: Meong!
        hewan2.bersuara(); // Output: Guk Guk!
         }
         }

7. Jalankan program untuk melihat hasilnya.

#### Screenshoot Hasil
![Bagian 4 - Polymorphism (Polimorfisme) overriding.png](gambar/Bagian%204%20-%20Polymorphism%20%28Polimorfisme%29%20overriding.png)

#### Analisa dan Pembahasan
1. Analisa Class Hewan

Class Hewan merupakan superclass yang digunakan sebagai dasar untuk merepresentasikan berbagai jenis hewan. Class ini memiliki method bersuara() yang menampilkan output umum, yaitu "Hewan bersuara.". Method ini nantinya akan dioverride oleh subclass.

2. Analisa Class Kucing

Class Kucing merupakan subclass dari Hewan yang ditandai dengan penggunaan kata kunci extends. Pada class ini, method bersuara() dioverride untuk menampilkan suara khas kucing, yaitu "Meong!".

Penggunaan anotasi @Override menunjukkan bahwa method tersebut merupakan implementasi ulang dari method yang ada pada superclass.

3. Analisa Class Anjing

Class Anjing juga merupakan subclass dari Hewan. Sama seperti class Kucing, class ini melakukan override terhadap method bersuara(), tetapi dengan output yang berbeda, yaitu "Guk-Guk!".

Hal ini menunjukkan bahwa setiap subclass dapat memiliki perilaku yang berbeda meskipun berasal dari method yang sama.

4. Analisa Class Main

Class Main merupakan class utama yang menjalankan program. Pada method main(), dibuat dua objek dengan tipe Hewan, namun masing-masing diinisialisasi dengan objek dari class Kucing dan Anjing.

Hewan hewan1 = new Kucing();
Hewan hewan2 = new Anjing();

Pendeklarasian seperti ini menunjukkan penerapan polimorfisme, di mana satu tipe referensi (Hewan) dapat digunakan untuk merepresentasikan berbagai objek yang berbeda.

Ketika method bersuara() dipanggil, program akan mengeksekusi method sesuai dengan objek sebenarnya (Kucing atau Anjing), bukan berdasarkan tipe referensi.

5. Konsep OOP yang Digunakan

Program ini menerapkan beberapa konsep Object-Oriented Programming, yaitu:

Inheritance (pewarisan): Class Kucing dan Anjing mewarisi class Hewan
Polymorphism (polimorfisme): Satu tipe referensi digunakan untuk objek yang berbeda
Method Overriding: Method bersuara() dioverride di setiap subclass
Dynamic Binding: Pemanggilan method ditentukan saat runtime berdasarkan objek sebenarnya

#### Dasar Teori Method Overloading
Method overloading terjadi ketika sebuah class memiliki beberapa method dengan nama yang sama tetapi parameter yang berbeda (baik jumlah atau tipe parameternya). Method overloading digunakan untuk meningkatkan fleksibilitas dengan menyediakan beberapa cara untuk memanggil method yang sama.

Aturan Method Overloading:
Method harus memiliki nama yang sama.
Parameter harus berbeda (jumlah atau tipe).
Return type bisa sama atau berbeda (tidak mempengaruhi overloading).
Access modifier bisa sama atau berbeda.

#### Langkah Praktikum
1. Buat sebuah package baru di dalam bagian_4 dan beri nama overloading
2. Kemudian buat sebuah class baru dengan nama Kalkulator dan isikan kode berikut:

        public class Kalkulator {
         // Method overloading: penjumlahan dua bilangan bulat
         int tambah(int a, int b) {
         return a + b;
         }

         // Method overloading: penjumlahan tiga bilangan bulat
         int tambah(int a, int b, int c) {
          return a + b + c;
         }

         // Method overloading: penjumlahan dua bilangan desimal
          double tambah(double a, double b) {
          return a + b;
          }
          }

3. Kemudian buat sebuah class baru dengan nama Main dan isikan kode berikut:

         public class Main {
         public static void main(String[] args) {
         Kalkulator kalkulator = new Kalkulator();

        System.out.println("Hasil 1: " + kalkulator.tambah(5, 10)); // Output: 15
        System.out.println("Hasil 2: " + kalkulator.tambah(5, 10, 15)); // Output: 30
        System.out.println("Hasil 3: " + kalkulator.tambah(3.5, 2.5)); // Output: 6.0
         }
         }

4. Jalankan program untuk melihat hasilnya.

#### Screenshoot Hasil
![Bagian 4 - Polymorphism (Polimorfisme) overloading.png](gambar/Bagian%204%20-%20Polymorphism%20%28Polimorfisme%29%20overloading.png)

#### Analisa dan Pembahasan
1. Analisa Class Kalkulator

Class Kalkulator merupakan class yang digunakan untuk melakukan operasi penjumlahan. Pada class ini terdapat beberapa method dengan nama yang sama, yaitu tambah(), namun memiliki parameter yang berbeda.

Terdapat tiga method tambah() yang diimplementasikan, yaitu:

tambah(int a, int b) untuk menjumlahkan dua bilangan bulat
tambah(int a, int b, int c) untuk menjumlahkan tiga bilangan bulat
tambah(double a, double b) untuk menjumlahkan dua bilangan desimal

Perbedaan jumlah dan tipe parameter inilah yang membedakan setiap method meskipun memiliki nama yang sama.

2. Analisa Class Main

Class Main berfungsi sebagai class utama yang menjalankan program. Pada method main(), dibuat objek dari class Kalkulator.

Selanjutnya, method tambah() dipanggil dengan parameter yang berbeda:

Dua parameter bertipe int
Tiga parameter bertipe int
Dua parameter bertipe double

Hasil dari setiap pemanggilan method ditampilkan menggunakan System.out.println().

3. Konsep OOP yang Digunakan

Program ini menerapkan konsep polymorphism, khususnya method overloading, yaitu penggunaan nama method yang sama dengan parameter yang berbeda dalam satu class.

Dengan method overloading, program dapat:

Menggunakan satu nama method untuk berbagai operasi serupa
Meningkatkan fleksibilitas dan keterbacaan kode

### Praktikum 5 - Abstraction (Abstraksi) | Abstract Class dan Interface
#### Dasar Teori Abstract Class
Pada konsep OOP (Object-Oriented Programming), Abstraction adalah salah satu dari empat pilar utama (bersama Encapsulation, Inheritance, dan Polymorphism). Abstraction memungkinkan kita untuk menyembunyikan detail implementasi dan hanya menampilkan fungsionalitas yang diperlukan kepada pengguna. Di Java, abstraction dapat diimplementasikan menggunakan Abstract Class dan Interface.

Abstract Class
Abstract class adalah class yang tidak dapat diinstansiasi (tidak bisa dibuat objeknya langsung). Abstract class dapat memiliki method abstrak (tanpa implementasi) dan method konkret (dengan implementasi). Abstract class digunakan ketika kita ingin membuat blueprint untuk class-class lain yang memiliki perilaku serupa tetapi dengan implementasi yang berbeda.

Ciri-Ciri Abstract Class:
Dideklarasikan dengan keyword abstract.
Dapat memiliki atribut, method konkret, dan method abstrak.
Method abstrak tidak memiliki body (hanya deklarasi).
Subclass yang mewarisi abstract class harus mengimplementasikan semua method abstrak (kecuali subclass tersebut juga abstract).

#### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package modul_3 dengan cara klik kanan dan pilih New -> Package. Beri nama bagian_5
2. Buat sebuah package baru di dalam bagian_5 dan beri nama abstrak.
3. Kemudian buat sebuah class baru di dalam abtrak dengan nama Hewan dan isikan kode berikut:

         abstract class Hewan {
          //atribut
          String nama;

          //Method konkret
          void makan () {
        System.out.println(nama + " sedang makan.");
          }

          //Method abstract
          abstract void bersuara();
       }

4. Kemudian buat sebuah class baru di dalam abtrak dengan nama Kucing dan isikan kode berikut:
   
         class Kucing extends Hewan {
         @Override
         void bersuara() {
         System.out.println("Meong!");
         }
         }

5. Kemudian buat sebuah class baru di dalam abtrak dengan nama Anjing dan isikan kode berikut:
    
        class Anjing extends Hewan {
         @Override
         void bersuara() {
         System.out.println("Guk-Guk!");
         }
         }

6. Kemudian buat sebuah class baru dengan nama Main dan isikan kode berikut:

        public class Main {
         public static void main(String[] args) {
         Hewan kucing = new Kucing();
         kucing.nama = "Kitty";
         kucing.makan(); // Method konkret dari abstract class
          kucing.bersuara(); // Method abstrak yang di-override

        Hewan anjing = new Anjing();
        anjing.nama = "Doggy";
        anjing.makan(); // Method konkret dari abstract class
        anjing.bersuara(); // Method abstrak yang di-override
         }
         }

7. Jalankan program untuk melihat hasilnya.

#### Screenshoot Hasil
![Bagian 5 - Abstraction (Abstraksi)  Abstract Class.png](gambar/Bagian%205%20-%20Abstraction%20%28Abstraksi%29%20%20Abstract%20Class.png)

#### Analisa dan Pembahasan
1. Analisa Class Hewan

Class Hewan merupakan abstract class yang digunakan sebagai dasar untuk merepresentasikan berbagai jenis hewan. Class ini memiliki satu atribut yaitu nama yang digunakan untuk menyimpan nama hewan.

Di dalam class ini terdapat dua jenis method:

Method konkret yaitu makan(), yang sudah memiliki implementasi dan berfungsi untuk menampilkan aktivitas makan hewan.
Method abstrak yaitu bersuara(), yang tidak memiliki implementasi dan harus diimplementasikan oleh subclass.

Penggunaan abstract class memungkinkan pembuatan kerangka dasar yang dapat digunakan kembali oleh class turunan.

2. Analisa Class Kucing

Class Kucing merupakan subclass dari Hewan yang mengimplementasikan method abstrak bersuara(). Pada class ini, method bersuara() dioverride untuk menampilkan suara khas kucing, yaitu "Meong!".

Dengan demikian, class Kucing telah memenuhi kewajiban untuk mengimplementasikan method abstrak dari superclass.

3. Analisa Class Anjing

Class Anjing juga merupakan subclass dari Hewan. Sama seperti class Kucing, class ini mengimplementasikan method bersuara() dengan output yang berbeda, yaitu "Guk-Guk!".

Hal ini menunjukkan bahwa setiap subclass dapat memiliki perilaku yang berbeda meskipun berasal dari abstract class yang sama.

4. Analisa Class Main

Class Main merupakan class utama yang menjalankan program. Pada method main(), dibuat objek dengan tipe Hewan, namun diinisialisasi menggunakan objek dari class Kucing dan Anjing.

Nilai atribut nama diisi secara langsung, kemudian method makan() dan bersuara() dipanggil.

Method makan() berasal dari abstract class dan dapat langsung digunakan oleh subclass.
Method bersuara() merupakan method abstrak yang telah diimplementasikan di masing-masing subclass.
5. Konsep OOP yang Digunakan

Program ini menerapkan beberapa konsep Object-Oriented Programming, yaitu:

Abstraction (abstraksi): Penggunaan abstract class dan method abstrak
Inheritance (pewarisan): Class Kucing dan Anjing mewarisi class Hewan
Polymorphism (polimorfisme): Penggunaan tipe referensi Hewan untuk objek berbeda
Method Overriding: Implementasi ulang method bersuara() pada subclass

#### Dasar Teori Interface
Interface adalah blueprint untuk class yang hanya berisi method abstrak (sebelum Java 8) atau method default/static (mulai Java 8). Interface digunakan untuk mendefinisikan kontrak (contract) yang harus diimplementasikan oleh class-class yang menggunakannya. Sebuah class dapat mengimplementasikan banyak interface (multiple inheritance).

Ciri-Ciri Interface:
Dideklarasikan dengan keyword interface.
Semua method di interface secara default adalah public dan abstract (tidak perlu menuliskan keyword abstract).
Mulai Java 8, interface dapat memiliki method default (dengan implementasi) dan method static.
Mulai Java 9, interface dapat memiliki method private.
Interface tidak dapat memiliki atribut non-static (hanya konstanta, yaitu public static final).

#### Langkah Praktikum
1. Buat sebuah package baru di dalam bagian_5 dan beri nama antarmuka.
2. Kemudian buat sebuah interface baru di dalam antarmuka dengan nama Bergerak dan isikan kode berikut:

         interface Bergerak {

         // Method abstrak
         void bergerak();

         // Method default (Java 8+)
         default void berhenti() {
        System.out.println("Berhenti bergerak.");
         }

         // Method static (Java 8+)
         static void info() {
        System.out.println("Ini adalah interface Bergerak.");
         }
         }

3. Kemudian buat sebuah class baru di dalam antarmuka dengan nama Mobil dan isikan kode berikut:

            class Mobil implements Bergerak {
         @Override
         public void bergerak() {
         System.out.println("Mobil sedang melaju");
         }
         }

4. Kemudian buat sebuah class baru di dalam antarmuka dengan nama Pesawat dan isikan kode berikut:

         class Pesawat implements Bergerak {
         @Override
         public void bergerak() {
         System.out.println("Pesawat sedang terbang");
         }
         }

5. Kemudian buat sebuah class baru dengan nama Main dan isikan kode berikut:
        
        public class Main {
         public static void main(String[] args) {
         Bergerak mobil = new Mobil();
         mobil.bergerak(); // Method dari interface
         mobil.berhenti(); // Method default dari interface

        Bergerak pesawat = new Pesawat();
        pesawat.bergerak(); // Method dari interface
        pesawat.berhenti(); // Method default dari interface

        Bergerak.info(); // Method static dari interface
         }
         }

6. Jalankan program untuk melihat hasilnya.

#### Screenshoot Hasil
![Bagian 5 - Abstraction (Abstraksi) Interface.png](gambar/Bagian%205%20-%20Abstraction%20%28Abstraksi%29%20Interface.png)

#### Analisa dan Pembahasan
1. Analisa Interface Bergerak

Interface Bergerak merupakan antarmuka yang digunakan untuk mendefinisikan perilaku umum suatu objek yang dapat bergerak. Di dalam interface ini terdapat tiga jenis method:

Method abstrak yaitu bergerak(), yang tidak memiliki implementasi dan wajib diimplementasikan oleh setiap class yang mengimplementasikan interface ini.
Method default yaitu berhenti(), yang sudah memiliki implementasi dan dapat langsung digunakan oleh class yang mengimplementasikan interface tanpa harus mengoverride-nya.
Method static yaitu info(), yang dapat dipanggil langsung melalui nama interface tanpa perlu membuat objek.

Penggunaan method default dan static merupakan fitur yang diperkenalkan pada Java 8 untuk meningkatkan fleksibilitas interface.

2. Analisa Class Mobil

Class Mobil merupakan class yang mengimplementasikan interface Bergerak dengan menggunakan kata kunci implements. Class ini wajib mengimplementasikan method abstrak bergerak().

Pada implementasinya, method bergerak() menampilkan pesan "Mobil sedang melaju", yang menggambarkan perilaku mobil saat bergerak.

3. Analisa Class Pesawat

Class Pesawat juga mengimplementasikan interface Bergerak. Sama seperti class Mobil, class ini mengimplementasikan method bergerak().

Namun, implementasi yang diberikan berbeda, yaitu menampilkan pesan "Pesawat sedang terbang". Hal ini menunjukkan bahwa setiap class dapat memiliki perilaku yang berbeda meskipun menggunakan interface yang sama.

4. Analisa Class Main

Class Main merupakan class utama yang menjalankan program. Pada method main(), dibuat objek dengan tipe Bergerak, namun diinisialisasi dengan objek dari class Mobil dan Pesawat.

Method bergerak() dipanggil sebagai implementasi dari method abstrak interface.
Method berhenti() dipanggil sebagai method default dari interface.
Method info() dipanggil secara langsung melalui nama interface, karena merupakan method static.

Pendeklarasian objek menggunakan tipe interface menunjukkan penerapan polymorphism.

5. Konsep OOP yang Digunakan

Program ini menerapkan beberapa konsep Object-Oriented Programming, yaitu:

Abstraction (abstraksi): Penggunaan interface untuk mendefinisikan perilaku umum
Polymorphism (polimorfisme): Satu tipe referensi (Bergerak) digunakan untuk objek yang berbeda
Inheritance (pewarisan interface): Class Mobil dan Pesawat mengimplementasikan interface Bergerak
Default dan Static Method pada Interface: Menunjukkan fitur tambahan pada Java modern

### Praktikum 6 - Aplikasi Console Pemesanan Tiket Sederhana
#### Dasar Teori
Berikut adalah contoh aplikasi console pemesanan tiket untuk sebuah konferensi yang mengimplementasikan seluruh konsep OOP (Class, Object, Encapsulation, Inheritance, Polymorphism, dan Abstraction). Aplikasi ini memiliki fitur lengkap seperti:

Menampilkan daftar tiket yang tersedia.
Memesan tiket.
Melihat detail pesanan.
Membatalkan pesanan.
Menghitung total harga.
Menerapkan diskon berdasarkan jenis tiket.

#### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package modul_3 dengan cara klik kanan dan pilih New -> Package. Beri nama bagian_6
2. Kemudian buat sebuah class baru dengan nama Tiket dan isikan kode berikut:

         abstract class Tiket {
         private final String jenis;
         private final double harga;

          public Tiket(String jenis, double harga) {
        this.jenis = jenis;
        this.harga = harga;
         }

          public String getJenis() {
        return jenis;
          }

          public double getHarga() {
        return harga;
          }

         // Abstract method untuk menghitung diskon
         public abstract double hitungDiskon();
         }

3. Kemudian buat sebuah class baru dengan nama TiketReguler dan isikan kode berikut:

         class TiketReguler extends Tiket {
         public TiketReguler() {
         super ("Reguler", 100000);
         }
         @Override
         public double hitungDiskon() {
         return 0;
         }
         }

4. Kemudian buat sebuah class baru dengan nama TiketVIP dan isikan kode berikut:

        class TiketVIP extends Tiket {
         public TiketVIP() {
         super ("VIP", 250000);
         }
          @Override
         public double hitungDiskon() {
         return 0.1* getHarga();
         }
         }

5. Kemudian buat sebuah class baru dengan nama Pesanan dan isikan kode berikut:

            class Pesanan {
         private final String namaPemesan;
         private final Tiket tiket;
         private final int jumlah;

         public Pesanan(String namaPemesan, Tiket tiket, int jumlah) {
         this.namaPemesan = namaPemesan;
         this.tiket = tiket;
         this.jumlah = jumlah;
         }

         public String getNamaPemesan() {
         return namaPemesan;
         }

         public Tiket getTiket() {
         return tiket;
         }

         public int getJumlah() {
         return jumlah;
         }

         // Menghitung total harga setelah diskon
         public double hitungTotal() {
         double total = tiket.getHarga() * jumlah;
         double diskon = tiket.hitungDiskon() * jumlah;
         return total - diskon;
         }

         // Menampilkan detail pesanan
         public void displayDetail() {
         System.out.println("\nDetail Pesanan:");
         System.out.println("Nama Pemesan: " + namaPemesan);
         System.out.println("Jenis Tiket: " + tiket.getJenis());
         System.out.println("Jumlah: " + jumlah);
         System.out.println("Total Harga: Rp " + hitungTotal());
         }
          }

6. Kemudian buat sebuah class baru dengan nama KonferensiApp dan isikan kode berikut:
        
        import java.util.ArrayList;
         import java.util.Scanner;

          public class KonferensiApp {
       private static final ArrayList<Pesanan> daftarPesanan = new ArrayList<>();
       private static final Scanner scanner = new Scanner(System.in);

         public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Aplikasi Pemesanan Tiket Konferensi ===");
            System.out.println("1. Lihat Daftar Tiket");
            System.out.println("2. Pesan Tiket");
            System.out.println("3. Lihat Detail Pesanan");
            System.out.println("4. Batalkan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    lihatDaftarTiket();
                    break;
                case 2:
                    pesanTiket();
                    break;
                case 3:
                    lihatDetailPesanan();
                    break;
                case 4:
                    batalkanPesanan();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
         } //  main sudah ditutup dengan benar

         // Method untuk menampilkan daftar tiket
         private static void lihatDaftarTiket() {
        System.out.println("\nDaftar Tiket:");
        System.out.println("1. Tiket Reguler - Rp100.000");
        System.out.println("2. Tiket VIP - Rp250.000 (Diskon 10%)");
         }

         // Method untuk memesan tiket
         private static void pesanTiket() {
        System.out.print("\nMasukkan nama pemesan: ");
        String namaPemesan = scanner.nextLine();

        System.out.print("Pilih jenis tiket (1: Reguler, 2: VIP): ");
        int jenisTiket = scanner.nextInt();

        System.out.print("Masukkan jumlah tiket: ");
        int jumlah = scanner.nextInt();

        Tiket tiket = null;

        switch (jenisTiket) {
            case 1:
                tiket = new TiketReguler();
                break;
            case 2:
                tiket = new TiketVIP();
                break;
            default:
                System.out.println("Jenis tiket tidak valid.");
                return;
        }

        Pesanan pesanan = new Pesanan(namaPemesan, tiket, jumlah);
        daftarPesanan.add(pesanan);
        System.out.println("Pesanan berhasil dibuat!");
        pesanan.displayDetail();
          }

         // Method untuk melihat detail pesanan
         private static void lihatDetailPesanan() {
        if (isNoPesanan()) return;

        System.out.print("Pilih nomor pesanan untuk melihat detail: ");
        int nomorPesanan = scanner.nextInt();

        if (nomorPesanan > 0 && nomorPesanan <= daftarPesanan.size()) {
            daftarPesanan.get(nomorPesanan - 1).displayDetail();
        } else {
            System.out.println("Nomor pesanan tidak valid.");
        }
          }

          private static boolean isNoPesanan() {
        if (daftarPesanan.isEmpty()) {
            System.out.println("\nBelum ada pesanan.");
            return true;
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < daftarPesanan.size(); i++) {
            System.out.println((i + 1) + ". " + daftarPesanan.get(i).getNamaPemesan());
        }
        return false;
          }

         // Method untuk membatalkan pesanan
         private static void batalkanPesanan() {
        if (isNoPesanan()) return;

        System.out.print("Pilih nomor pesanan yang ingin dibatalkan: ");
        int nomorPesanan = scanner.nextInt();

        if (nomorPesanan > 0 && nomorPesanan <= daftarPesanan.size()) {
            daftarPesanan.remove(nomorPesanan - 1);
            System.out.println("Pesanan berhasil dibatalkan.");
        } else {
            System.out.println("Nomor pesanan tidak valid.");
        }
          }
             }  

#### Output Program


## 3. Kesimpulan

---
## 4.Referensi
Modul 1 Review Dasar Pemrograman Java - (https://hackmd.io/@mohdrzu/BkBn4sEcyl)

0