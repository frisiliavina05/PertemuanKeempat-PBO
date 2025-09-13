# CRUD OPERATION (Create, Insert, Read, Update, Delete)
Pada pertemuan empat ini menerapkan operasi CRUD dengan menghubungkan Java (NetBeans) dengan PostgreSQL menggunakan JDBC. Pertemuan ini mengimplementasikan operasi CRUD (Create, Insert, Read, Update, Delete) berbasis OOP. Program ini dibuat dengan memanfaatkan konsep inheritance, di mana extends digunakan untuk mengakses class koneksi database. Pada bagian Read, data ditampilkan menggunakan ResultSet sesuai fungsinya. Selain itu, program juga menggunakan menu interaktif agar pengguna dapat memilih operasi CRUD yang diinginkan.

# A. DATABASE
Dalam database PostgreSQL saya hanya embuat satu entitas yaitu musiK. Dalam entitas music memiliki beberapa tribute yaitu idLagu sebagai PRIMARY KEY dari entitas music, kemudian terdapat atribut judul, artis, dan tahun.

# B. PROGRAM
Pada program terdapat 7 class yang saling ber hirarki

# 1. Class Koneksi
Pada Class Koneksi berisi source code untuk tempat menyimpan pusat konfigurasi koneksi database. Dengan Class ini, setiap operasi CRUD (Create, Insert, Read, Update, Delete) bisa langsung mengakses database tanpa menulis ulang konfigurasi, cukup menggunakan extends Koneksi. Pada Class ini juga terdapat beberapa atribut dalam Class Koneksi url, user, dan password. Ketiga atribut ini akan dimasukkan dalam method connection.

# 2. Class Create
Pada Class Create digunakan untuk membuat table baru pada database. Dengan menggunakan extends Koneksi, class ini langsung mewarisi konfigurasi koneksi dari Koneksi.java tanpa menulis ulang. Tabel music dibuat dengan kolom idLagu (Primary Key), judul, artis, dan tahun. Query dijalankan menggunakan statement dan executeUpdate(), dengan error handling melalui try-catch dan Logger.

# 3. Class Insert
Class Insert digunakan untuk menambahkan data baru ke table musik secara interaktif. Dengan extends Koneksi,class ini langsung mewarisi konfigurasi koneksi dari Koneksi.java tanpa menulis ulang. Penggunaan loop dan menu bisa menambahkan beberapa data sekaligus sebelum kembali ke menu utama. Error handling memastikan program tetap aman saat terjadi kesalahan input atau koneksi.

# 4. Class Read
Pada Class Read digunakan untuk menampilkan data yang telah kita input atau menerapkan operasi Read dari tabel musik. Dengan extends Koneksi, program bisa langsung terhubung ke database tanpa menulis ulang pengaturan. Data ditampilkan satu per satu dengan rapi, dan setelah selesai, pengguna bisa kembali ke menu utama. Selain itu, error handling memastikan program tetap berjalan meskipun terjadi kesalahan pada koneksi atau query. 

 # 5. Class Update
 Class Update digunakan untuk melakukan pembaruan data pada tabel musik melalui query UPDATE yang dibentuk sesuai input pengguna. Dengan mwnggunakan extends koneksi dari class Koneksi, proses update bisa berjalan langsung tanpa konfigurasi ulang. Program juga menyediakan perulangan agar pengguna dapat memperbarui data lebih dari sekali, serta opsi untuk kembali ke menu utama. Selain itu, error handling disertakan agar program tetap aman dan tidak berhenti meskipun terjadi kesalahan pada koneksi atau query.

 # 6. Class Delete
Class Delete berfungsi untuk menghapus data pada tabel musik dengan menggunakan query DELETE sesuai input pengguna. Program ini menggunakan extends koneksi dari class Koneksi sehingga bisa langsung terhubung ke database. Melalui perulangan, pengguna dapat memilih untuk menghapus data lebih dari sekali atau kembali ke menu utama. Selain itu, adanya error handling membuat program tetap stabil meskipun terjadi kesalahan pada query atau koneksi.

# 7. Class MenuUtama
Class MenuUtama berfungsi sebagai pusat navigasi dari program CRUD, di mana pengguna dapat memilih untuk melakukan operasi Insert, Update, Delete, maupun Read sesuai kebutuhan. Program ini juga memanggil class Create terlebih dahulu agar tabel tersedia sebelum digunakan. Dengan struktur perulangan do-while, menu akan terus ditampilkan hingga pengguna memilih keluar, sehingga memudahkan interaksi dan menjaga alur program tetap teratur.
