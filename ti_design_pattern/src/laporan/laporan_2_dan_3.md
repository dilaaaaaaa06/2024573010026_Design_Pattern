# Laporan Praktikum 2: Review Konsep Dasar OOP Menggunakan Java
**Mata Kuliah:** Praktikum Design Pattern  
**Nama:** Nurul Fadila  
**NIM:** 2024573010026  
**Kelas:** TI 2A

---

## 1. Abstrak

Praktikum ini bertujuan untuk memahami konsep dasar pemrograman berorientasi objek (OOP) dalam Java.Mampu membuat dan menggunakan class, object, attribute, dan method. Memahami penggunaan akses modifier (public, private, protected, default). Mampu mengimplementasikan setter dan getter untuk mengakses dan memodifikasi attribute. Memahami dan mengimplementasikan constructor (default, parameterized, dan constructor overloading).

---
## 2. Praktikum
### Praktikum 1 - Class dan Object
#### Dasar Teori
OOP (Object-Oriented Programming) adalah paradigma pemrograman yang menggunakan "objek" untuk merepresentasikan data dan metode yang beroperasi pada data tersebut. Konsep dasar OOP:

1. Class: Blueprint atau template untuk membuat objek.
2. Object: Instance dari class yang memiliki atribut dan metode.

#### Langkah Praktikum
1. Buka project pada praktikum sebelumnya menggunakan intellij IDEA
2. Buat sebuah package baru di dalam folder src dengan cara klik kanan pada folder src kemudian pilih New -> Package. Beri nama modul_2.
3. Buat Sebuah package baru lagi didalam package modul_2 dengan cara klik kanan dan pilih New -> Package. Beri nama bagian_1
4. Kemudian buat sebuah class baru dengan nama Mahasiswa dan isikan kode berikut:

          public class Mahasiswa {
         String nama;
         int umur;
         }
5. Selanjutnya, buat sebuah class baru dengan nama Main dan isikan kode berikut:

            public class Main {
          public static void main (String[] args) {
          Mahasiswa mhs1 = new Mahasiswa();

        mhs1.nama = "Budi";
        mhs1.umur = 20;

        System.out.println("Nama: " + mhs1.nama);
        System.out.println("Umur: " + mhs1.umur);
          }
          }

#### Screenshoot Hasil
![bagian_1.png](gambar/bagian_1.png)

#### Analisa dan Pembahasan
Pada bagian pertama dibuat class Mahasiswa yang berisi dua atribut, yaitu nama bertipe String dan umur bertipe int. Kedua atribut ini tidak menggunakan modifier seperti private atau public, sehingga secara default memiliki akses package-private, artinya masih bisa diakses oleh class lain yang berada dalam package yang sama. Class ini berfungsi sebagai representasi sederhana dari sebuah objek mahasiswa yang memiliki data nama dan umur, tanpa disertai method atau perilaku tambahan.

Kemudian pada bagian kedua dibuat class Main yang memiliki method main sebagai titik awal eksekusi program. Di dalam method ini dilakukan pembuatan objek dari class Mahasiswa dengan perintah Mahasiswa mhs1 = new Mahasiswa();. Proses ini disebut instansiasi, yaitu membuat objek nyata dari sebuah class. Setelah objek berhasil dibuat, atribut nama dan umur diisi langsung menggunakan operator titik, yaitu mhs1.nama = "Budi"; dan mhs1.umur = 20;. Hal ini dimungkinkan karena atribut pada class Mahasiswa tidak bersifat private.

Selanjutnya program menampilkan nilai dari atribut tersebut ke layar menggunakan System.out.println. Output yang dihasilkan adalah nama dan umur yang telah dimasukkan sebelumnya, sehingga membuktikan bahwa objek mhs1 berhasil menyimpan dan menampilkan data.

### Praktikum 2 - Attribute dan Method
#### Dasar Teori
Attribute adalah variabel yang terdapat di dalam sebuah class yang digunakan untuk menyimpan data atau informasi dari objek. Attribute menggambarkan ciri atau sifat dari suatu objek. Misalnya pada class Mahasiswa, attribute bisa berupa nama dan umur. Nilai dari attribute ini bisa berbeda untuk setiap objek, sehingga setiap objek memiliki karakteristik masing-masing.

Sedangkan method adalah fungsi atau prosedur yang terdapat di dalam class yang digunakan untuk melakukan suatu aksi atau operasi terhadap data (attribute). Method menggambarkan perilaku dari suatu objek. Contohnya seperti method untuk menampilkan data, menghitung nilai, atau mengubah isi attribute.

#### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package modul_2 dengan cara klik kanan dan pilih New -> Package. Beri nama bagian_2
2. Kemudian buat sebuah class baru dengan nama Kalkulator dan isikan kode berikut:


    public class Kalkulator {
    int angka1;
    int angka2;

    int tambah() {
        return angka1 + angka2;
    }
    }


3. Kemudian buat sebuah class baru dengan nama Main dan isikan kode berikut:

         public class Main {
        public static void main (String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.angka1 = 5;
        kalkulator.angka2 = 10;

        System.out.println("Hasil penjumlahan: " + kalkulator.tambah());
        }
        }
4. Jalankan program untuk melihat hasilnya.

#### Screenshoot Hasil
![bagian_2.png](gambar/bagian_2.png)

#### Analisa dan Pembahasan
Pada bagian pertama, dibuat sebuah class bernama Kalkulator. Di dalam class ini terdapat dua attribute yaitu angka1 dan angka2 yang bertipe data integer. Attribute ini berfungsi untuk menyimpan nilai yang akan digunakan dalam proses perhitungan. Selain itu, terdapat sebuah method bernama tambah() yang digunakan untuk melakukan operasi penjumlahan antara angka1 dan angka2. Method ini mengembalikan hasil penjumlahan dalam bentuk nilai integer menggunakan perintah return angka1 + angka2;.

Selanjutnya, pada class Main, terdapat method main yang merupakan titik awal eksekusi program. Di dalam method ini dilakukan pembuatan objek dari class Kalkulator dengan perintah Kalkulator kalkulator = new Kalkulator();. Objek ini kemudian digunakan untuk mengakses attribute dan method yang ada di dalam class Kalkulator.

Nilai dari attribute angka1 dan angka2 diisi secara langsung melalui objek, yaitu kalkulator.angka1 = 5; dan kalkulator.angka2 = 10;. Setelah itu, method tambah() dipanggil untuk menghitung hasil penjumlahan dari kedua nilai tersebut. Hasilnya kemudian ditampilkan ke layar menggunakan System.out.println.

Secara keseluruhan, alur kerja program adalah menerima nilai melalui attribute, memprosesnya menggunakan method, dan menampilkan hasilnya sebagai output. Program ini menunjukkan bagaimana data (attribute) dan perilaku (method) bekerja bersama dalam sebuah class.


### Praktikum 3 - Akses Modifier
#### Dasar Teori 
Dalam pemrograman berorientasi objek (Object Oriented Programming/OOP), access modifier digunakan untuk mengatur tingkat akses suatu attribute, method, maupun class. Dengan adanya access modifier, programmer dapat menentukan bagian mana dari program yang boleh diakses oleh class lain dan mana yang harus dilindungi.

Access modifier berperan penting dalam menjaga keamanan data serta mendukung konsep encapsulation, yaitu membungkus data agar tidak dapat diakses secara sembarangan dari luar class.

Dalam bahasa Java, terdapat beberapa jenis access modifier, yaitu public, private, protected, dan default (tanpa modifier).
Jenis akses modifier:
public : Dapat diakses dari mana saja.
private : Hanya dapat diakses dalam class yang sama.
protected : Dapat diakses dalam package yang sama dan subclass.
default : Hanya dapat diakses dalam package yang sama.

#### Langkah Praktikum Inheritance (Pewarisan)
1. Buat Sebuah package baru lagi didalam package modul_2 dengan cara klik kanan dan pilih New -> Package. Beri nama bagian_3
2. Kemudian buat sebuah class baru dengan nama AksesModifier dan isikan kode berikut:

          public class AksesModifier {
         public int publicVar = 1;
         private int privateVar = 2;
         protected int protectedVar = 3;
         int defaultVar = 4;

          public void tampilkan () {
         System.out.println("Public: " + publicVar);
         System.out.println("Private: " + privateVar);
         System.out.println("Protected: " + protectedVar);
         System.out.println("Default: " + defaultVar);

         }

         }


4. Kemudian buat sebuah class baru dengan nama Main dan isikan kode berikut:

         public class Main {
        public static void main(String[] args) {
        AksesModifier contoh = new AksesModifier();
        contoh.tampilkan();
        }
            }



#### Screenshoot Hasil
![bagian_3.png](gambar/bagian_3.png)

#### Analisa dan Pembahasan
Pada class AksesModifier, terdapat empat attribute yang masing-masing menggunakan jenis access modifier yang berbeda, yaitu publicVar, privateVar, protectedVar, dan defaultVar. Attribute publicVar menggunakan modifier public, sehingga dapat diakses dari mana saja, baik dari dalam class yang sama maupun dari class lain. Attribute privateVar menggunakan modifier private, sehingga hanya dapat diakses di dalam class AksesModifier itu sendiri. Attribute protectedVar menggunakan modifier protected, yang berarti dapat diakses dalam class yang sama, dalam package yang sama, serta oleh class turunan. Sedangkan defaultVar tidak menggunakan modifier, sehingga secara otomatis memiliki akses default (package-private), yaitu hanya dapat diakses oleh class dalam package yang sama.

Selain attribute, class AksesModifier juga memiliki sebuah method bernama tampilkan(). Method ini bersifat public dan berfungsi untuk menampilkan nilai dari seluruh attribute ke layar menggunakan System.out.println. Karena method ini berada di dalam class yang sama, maka method tersebut dapat mengakses semua attribute, termasuk yang bersifat private.

Pada class Main, terdapat method main sebagai titik awal eksekusi program. Di dalam method ini dibuat sebuah objek dari class AksesModifier dengan nama contoh. Selanjutnya, method tampilkan() dipanggil melalui objek tersebut. Pemanggilan ini berhasil karena method tampilkan() bersifat public.

Ketika program dijalankan, output yang dihasilkan adalah nilai dari semua attribute, yaitu public, private, protected, dan default. Hal ini dapat terjadi karena akses terhadap attribute dilakukan melalui method yang berada di dalam class yang sama, sehingga tidak melanggar aturan access modifier.


### Praktikum 4 - Setter dan Getter

Dalam pemrograman berorientasi objek (Object Oriented Programming/OOP), setter dan getter adalah method yang digunakan untuk mengakses dan mengubah nilai dari attribute yang bersifat private dalam suatu class. Penggunaan setter dan getter merupakan bagian dari konsep encapsulation, yaitu membungkus data agar tidak dapat diakses secara langsung dari luar class.

Getter adalah method yang digunakan untuk mengambil atau membaca nilai dari suatu attribute. Method ini biasanya memiliki tipe data yang sama dengan attribute yang diambil dan mengembalikan nilai tersebut menggunakan perintah return. Dengan adanya getter, data tetap bisa dibaca dari luar class tanpa harus membuka akses langsung ke attribute.

Sedangkan setter adalah method yang digunakan untuk mengubah atau memberikan nilai baru pada suatu attribute. Method ini biasanya memiliki parameter sesuai dengan tipe data attribute yang akan diubah. Dengan setter, programmer dapat mengontrol bagaimana data diubah, misalnya dengan menambahkan validasi agar nilai yang dimasukkan sesuai dengan aturan tertentu.

#### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package modul_2 dengan cara klik kanan dan pilih New -> Package. Beri nama bagian_4
2. Kemudian buat sebuah class baru dengan nama Mobil dan isikan kode berikut:

         public class Mobil {
         private String merk;

         public void setMerk(String merk) {
        this.merk = merk;
         }

         public String getMerk() {
        return merk;
         }
         }

3. Kemudian buat sebuah class baru dengan nama Main dan isikan kode berikut:

       public class Main {
         public static void main(String[] args) {
         Mobil mobil = new Mobil();
         mobil.setMerk("Toyota");

        System.out.println("Merk Mobil:" + mobil.getMerk());
         }
         }

4. Jalankan program untuk melihat hasilnya.

#### Screenshoot Hasil
![bagian_4.png](gambar/bagian_4.png)

#### Analisa dan Pembahasan
Pada class Mobil, terdapat sebuah attribute bernama merk yang bertipe data String dan bersifat private. Penggunaan modifier private bertujuan untuk membatasi akses langsung terhadap attribute tersebut dari luar class, sehingga data lebih aman dan terkontrol.

Untuk mengakses dan mengubah nilai attribute merk, disediakan dua method yaitu setMerk() dan getMerk(). Method setMerk() berfungsi sebagai setter, yaitu untuk memberikan atau mengubah nilai attribute merk. Di dalam method ini digunakan kata kunci this untuk membedakan antara parameter dan attribute milik class. Sedangkan method getMerk() berfungsi sebagai getter, yaitu untuk mengambil atau mengembalikan nilai dari attribute merk.

Pada class Main, terdapat method main sebagai titik awal eksekusi program. Di dalam method ini dibuat sebuah objek dari class Mobil dengan nama mobil. Selanjutnya, nilai attribute merk diisi menggunakan method setter, yaitu mobil.setMerk("Toyota"). Setelah itu, nilai dari attribute tersebut ditampilkan ke layar menggunakan method getter melalui perintah mobil.getMerk().

Ketika program dijalankan, output yang dihasilkan adalah:
Merk Mobil: Toyota



### Praktikum 5 - Constructor
#### Dasar Teori 
Dalam pemrograman berorientasi objek (Object Oriented Programming/OOP), constructor adalah method khusus yang digunakan untuk menginisialisasi objek saat pertama kali dibuat. Constructor akan otomatis dipanggil ketika sebuah objek dibuat menggunakan kata kunci new.

Constructor memiliki nama yang sama dengan nama class dan tidak memiliki tipe data (bahkan tidak menggunakan void). Tujuan utama dari constructor adalah untuk memberikan nilai awal pada attribute suatu objek agar objek tersebut langsung siap digunakan.

Terdapat beberapa jenis constructor, yaitu default constructor dan parameterized constructor. Default constructor adalah constructor tanpa parameter yang biasanya digunakan untuk memberikan nilai awal secara umum. Sedangkan parameterized constructor adalah constructor yang memiliki parameter, sehingga nilai attribute dapat diisi langsung saat objek dibuat.

#### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package modul_2 dengan cara klik kanan dan pilih New -> Package. Beri nama bagian_5
2. Kemudian buat sebuah class baru dengan nama Person dan isikan kode berikut:

         public class Person {
         private String nama;
         private int umur;

          // Default Constructor
         public Person() {
        nama = "Unknown";
        umur = 0;
          }

         // Parameterized Constructor
         public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
         }

         // Method
         public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
         }

         }

3. Kemudian buat sebuah class baru di dalam abtrak dengan nama Main dan isikan kode berikut:

         public class Main {
          public static void main (String[] args) {
          Person person1 = new Person();
          Person person2 = new Person("Budi", 25);

        person1.tampilkanInfo();
        person2.tampilkanInfo();


    }
            }

         

4. Jalankan program untuk melihat hasilnya.

#### Screenshoot Hasil
![bagian_5.png](gambar/bagian_5.png)

#### Analisa dan Pembahasan
Pada class Person, terdapat dua attribute yaitu nama bertipe String dan umur bertipe int yang bersifat private. Penggunaan modifier private bertujuan untuk melindungi data agar tidak dapat diakses langsung dari luar class, sehingga sesuai dengan konsep encapsulation.

Class Person memiliki dua constructor, yaitu default constructor dan parameterized constructor. Default constructor adalah constructor tanpa parameter yang digunakan untuk memberikan nilai awal secara umum, yaitu nama diisi dengan "Unknown" dan umur diisi dengan 0. Constructor ini akan dipanggil ketika objek dibuat tanpa memberikan parameter.

Sedangkan parameterized constructor adalah constructor yang memiliki parameter, yaitu nama dan umur. Constructor ini memungkinkan pengguna untuk langsung mengisi nilai attribute saat objek dibuat. Penggunaan kata kunci this berfungsi untuk membedakan antara parameter dan attribute dalam class.

Selain itu, class Person juga memiliki method tampilkanInfo() yang digunakan untuk menampilkan nilai attribute nama dan umur ke layar.

Pada class Main, terdapat method main sebagai titik awal program. Di dalam method ini dibuat dua objek dari class Person, yaitu person1 dan person2. Objek person1 dibuat menggunakan default constructor sehingga nilainya otomatis menjadi "Unknown" dan 0. Sedangkan person2 dibuat menggunakan parameterized constructor dengan nilai "Budi" dan 25.

Kemudian, method tampilkanInfo() dipanggil pada kedua objek tersebut. Hasilnya, program akan menampilkan informasi masing-masing objek sesuai dengan nilai yang dimiliki.


### Praktikum 6 - Sistem Manajemen Perpustakaan Sederhana
#### Dasar Teori
Berikut adalah contoh program konsol sederhana yang mengimplementasikan seluruh konsep yang telah dibahas sebelumnya, yaitu class, object, attribute, method, akses modifier, setter-getter, dan constructor. Program ini adalah sistem manajemen perpustakaan sederhana yang memungkinkan pengguna untuk menambahkan buku, menampilkan daftar buku, dan mencari buku berdasarkan judul.

#### Langkah Praktikum
1. Buat Sebuah package baru lagi didalam package modul_2 dengan cara klik kanan dan pilih New -> Package. Beri nama bagian_6
2. Kemudian buat sebuah class baru dengan nama Buku dan isikan kode berikut:

        public class Buku {
         // Atribut (private)
         private String judul;
         private String pengarang;
         private int tahunTerbit;

         // Constructor (default)
         public Buku() {
         this.judul = "Unknown";
         this.pengarang = "Unknown";
         this.tahunTerbit = 0;
          }

         // Constructor (parameterized)
         public Buku(String judul, String pengarang, int tahunTerbit) {
         this.judul = judul;
         this.pengarang = pengarang;
         this.tahunTerbit = tahunTerbit;
         }

         // Setter dan Getter
         public void setJudul(String judul) {
         this.judul = judul;
          }

         public String getJudul() {
         return judul;
         }

         public void setPengarang(String pengarang) {
         this.pengarang = pengarang;
         }

         public String getPengarang() {
         return pengarang;
         }

          public void setTahunTerbit(int tahunTerbit) {
         this.tahunTerbit = tahunTerbit;
         }

         public int getTahunTerbit() {
         return tahunTerbit;
         }

         // Method untuk menampilkan informasi buku
             public void tampilkanInfo() {
         System.out.println("Judul: " + judul);
          System.out.println("Pengarang: " + pengarang);
         System.out.println("Tahun Terbit: " + tahunTerbit);
          }
         }

3. Kemudian buat sebuah class baru dengan nama Perpustakaan dan isikan kode berikut:

         import java.util.ArrayList;
         public class Main {

         public class Perpustakaan {
        // Atribut (private)
        private ArrayList<Buku> daftarBuku;

        // Constructor
        public Perpustakaan() {
            daftarBuku = new ArrayList<>();
        }

        // Method untuk menambahkan buku
        public void tambahBuku(Buku buku) {
            daftarBuku.add(buku);
            System.out.println("Buku berhasil ditambahkan!");
        }

        // Method untuk menampilkan semua buku
        public void tampilkanSemuaBuku() {
            if (daftarBuku.isEmpty()) {
                System.out.println("Tidak ada buku dalam perpustakaan.");
            } else {
                System.out.println("Daftar Buku:");
                for (Buku buku : daftarBuku) {
                    buku.tampilkanInfo();
                }
            }
        }

        // Method untuk mencari buku berdasarkan judul
        public void cariBuku(String judul) {
            boolean ditemukan = false;

            for (Buku buku : daftarBuku) {
                if (buku.getJudul().equalsIgnoreCase(judul)) {
                    System.out.println("Buku ditemukan:");
                    buku.tampilkanInfo();
                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Buku dengan judul \"" + judul + "\" tidak ditemukan.");
            }
        }
         }
       }

4. Kemudian buat sebuah class baru dengan nama Main dan isikan kode berikut:

        import java.util.Scanner;

         public class Main {
          public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          Perpustakaan perpustakaan = new Perpustakaan();
          int pilihan;

        do {
            // Menu
            System.out.println("=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    // Tambah Buku
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();

                    System.out.print("Masukkan nama pengarang: ");
                    String pengarang = scanner.nextLine();

                    System.out.print("Masukkan tahun terbit: ");
                    int tahunTerbit = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline

                    Buku bukuBaru = new Buku(judul, pengarang, tahunTerbit);
                    perpustakaan.tambahBuku(bukuBaru);
                    break;

                case 2:
                    // Tampilkan Semua Buku
                    perpustakaan.tampilkanSemuaBuku();
                    break;

                case 3:
                    // Cari Buku
                    System.out.print("Masukkan judul buku yang dicari: ");
                    String judulCari = scanner.nextLine();
                    perpustakaan.cariBuku(judulCari);
                    break;

                case 4:
                    // Keluar
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 4);

        scanner.close();
           }
       }

#### Output Program
![bagian_6.png](gambar/bagian_6.png)

#### Analisa dan Pembahasan
- Class Buku

Class Buku berfungsi sebagai model atau representasi data dari sebuah buku. Di dalamnya terdapat atribut judul, pengarang, dan tahunTerbit yang dibuat private untuk menjaga keamanan data (encapsulation). Artinya, data tidak bisa diakses langsung dari luar class.

Untuk mengakses dan mengubah data tersebut digunakan getter dan setter, misalnya getJudul() untuk mengambil nilai dan setJudul() untuk mengubah nilai. Ini adalah konsep penting dalam OOP agar data tetap terkontrol.

Class ini juga memiliki dua constructor. Constructor default akan mengisi nilai awal dengan "Unknown" dan 0, sedangkan constructor parameter memungkinkan objek dibuat dengan nilai langsung dari input user. Ini membuat class lebih fleksibel.

Selain itu ada method tampilkanInfo() yang berfungsi menampilkan isi data buku ke layar. Jadi class ini tidak hanya menyimpan data, tapi juga bisa menampilkan datanya.

- Class Perpustakaan

Tujuan class ini adalah untuk mengelola kumpulan objek Buku. Data disimpan dalam ArrayList<Buku> yang memungkinkan penyimpanan banyak buku secara dinamis.

Di dalamnya terdapat beberapa method penting:

tambahBuku() untuk menambahkan buku ke dalam daftar
tampilkanSemuaBuku() untuk menampilkan seluruh buku
cariBuku() untuk mencari buku berdasarkan judul

Logika pencarian menggunakan perulangan (for) dan membandingkan judul dengan equalsIgnoreCase, sehingga tidak sensitif huruf besar/kecil.

Namun, di kode yang kamu berikan ada kesalahan besar:

    public class Main {

    public class Perpustakaan {

Di sini Perpustakaan dibuat di dalam class Main, padahal seharusnya dia berdiri sendiri. Ini menyebabkan:

Struktur program tidak rapi
Bisa memicu error saat dipanggil dari class lain
Tidak sesuai konsep OOP (harusnya tiap class punya file sendiri)

- Class Main

Class Main adalah program utama (entry point) yang menjalankan aplikasi. Di sinilah interaksi dengan user terjadi menggunakan Scanner.

Program menggunakan loop do-while untuk menampilkan menu berulang sampai user memilih keluar. Ini membuat program berjalan terus sampai opsi 4 dipilih.

Pada bagian switch, setiap pilihan menjalankan fitur:

Tambah buku → membuat objek Buku lalu disimpan ke Perpustakaan
Tampilkan buku → menampilkan semua data
Cari buku → mencari berdasarkan input user
Keluar → menghentikan program

Penggunaan scanner.nextLine() setelah nextInt() itu penting untuk menghindari bug input (newline tertinggal).

## 3. Kesimpulan
Modul ini telah membahas konsep dasar OOP dalam Java, termasuk class, object, attribute, method, akses modifier, setter-getter, dan constructor. Dengan memahami materi ini, Anda dapat mulai membangun aplikasi Java yang lebih kompleks menggunakan prinsip-prinsip OOP.

---
## 4.Referensi
Modul 2 Review Konsep Dasar OOP Menggunakan Java - (https://hackmd.io/@mohdrzu/Bygtu8g0iJg)



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
![Bagian 6 - Aplikasi Console Pemesanan Tiket Sederhana.png](gambar/Bagian%206%20-%20Aplikasi%20Console%20Pemesanan%20Tiket%20Sederhana.png)

#### Analisa dan Pembahasan
Fitur Apliaksi:
- Lihat Daftar Tiket: Menampilkan jenis tiket dan harganya.
- Pesan Tiket: Memungkinkan pengguna memesan tiket dengan memilih jenis dan jumlah.
- Lihat Detail Pesanan: Menampilkan detail pesanan berdasarkan nomor pesanan.
- Batalkan Pesanan: Menghapus pesanan berdasarkan nomor pesanan.
- Hitung Total Harga: Menghitung total harga setelah diskon (jika ada).

Penjelasan Program:
- Encapsulation: Atribut seperti jenis dan harga dienkapsulasi dalam class Tiket.
- Inheritance: TiketReguler dan TiketVIP mewarisi class Tiket.
- Polymorphism: Method hitungDiskon() di-override di subclass.
- Abstraction: Class Tiket adalah abstract class dengan method abstrak hitungDiskon().
- Aplikasi ini siap digunakan dan dapat dikembangkan lebih lanjut dengan menambahkan fitur seperti penyimpanan data ke file atau database.

## 3. Kesimpulan
Dalam praktikum ini, kita telah mempelajari konsep dasar Pemrograman Berorientasi Objek (OOP) menggunakan Java, meliputi:

Class dan Object: Blueprint dan instance untuk membangun program.
Encapsulation: Menyembunyikan detail implementasi dengan access modifier dan getter-setter.
Inheritance: Mewarisi atribut dan metode dari superclass ke subclass.
Polymorphism: Method overriding dan overloading untuk fleksibilitas.
Abstraction: Abstract class dan interface untuk menyembunyikan detail dan mendefinisikan kontrak.
Composition: Membangun class dari objek-objek lain untuk hubungan "has-a".
Dengan memahami dan menguasai konsep-konsep ini, Anda dapat membangun aplikasi yang modular, fleksibel, dan mudah dipelihara. Teruslah berlatih dan eksplorasi lebih lanjut untuk menjadi programmer Java yang handa
---
## 4.Referensi
Modul 2 Review 4 Pillar OOP Menggunakan Java - (https://hackmd.io/@mohdrzu/rk5sz2X21l)
