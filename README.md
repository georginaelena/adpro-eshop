Nama    : Georgina Elena Shinta Dewi Achti
NPM     : 2206810995
Kelas   : ADPRO-C

### Refleksi 1

Setelah menerapkan dua fitur baru menggunakan Spring Boot, saya meninjau kembali kode sumber saya dan mengevaluasi standar pengkodean yang telah dipelajari dalam modul ini. Berikut adalah beberapa Prinsip _clean code_ dan praktik pengkodean yang aman yang saya terapkan dalam kode saya:

1. **Penggunaan Nama Variabel yang Bermakna:**
    - Memberikan nama variabel yang deskriptif dan self-explanatory, seperti `productData`, `productId`, dan `productName`, untuk meningkatkan kejelasan kode.
    - Menggunakan nama fungsi yang mencerminkan tugasnya dengan jelas, seperti `createProduct`, `deleteProduct`, dan `editProduct`, sesuai dengan prinsip "Meaningful Names".

2. **Pembuatan Fungsi yang Kecil dan Independen:**
    - Fungsi-fungsi yang saya buat hanya melakukan satu tugas dan tidak memiliki efek samping (side effects), mengikuti prinsip "Functions should do one thing. They should do it well. They should do it only."
    - Menghindari duplikasi kode dengan menggunakan fungsi-fungsi yang dapat digunakan kembali (reusable functions) dan memastikan bahwa setiap fungsi memiliki tanggung jawab yang jelas, sesuai dengan prinsip "Don't repeat yourself (DRY)".

3. **Komentar yang Tidak Diperlukan:**
    - Menggunakan kode yang sudah cukup deskriptif sehingga tidak diperlukan komentar tambahan, mengikuti prinsip "Don't comment bad code, rewrite it".
    - Menyisihkan komentar untuk menjelaskan bagian-bagian kode yang kompleks atau memerlukan penjelasan tambahan untuk pemahaman yang lebih baik.

Jika terdapat kesalahan dalam kode sumber, salah satu cara untuk meningkatkannya adalah dengan menambahkan fitur keamanan seperti autentikasi dan otorisasi, serta penanganan kesalahan yang lebih baik untuk meningkatkan keandalan dan keamanan aplikasi.

### Refleksi 2

Setelah menulis uji unit, saya merasa lebih percaya diri dengan kualitas kode yang telah saya buat. Namun, menentukan jumlah uji unit yang tepat untuk sebuah kelas tidak memiliki jawaban baku. Sebagai panduan umum, uji unit seharusnya dapat menangani semua kasus-kasus umum dan perbatasan dengan baik.

Untuk memastikan bahwa uji unit sudah cukup untuk memverifikasi program, penting untuk memperhatikan cakupan kode (code coverage). Cakupan kode yang tinggi, meskipun tidak mencapai 100%, dapat memberikan keyakinan tambahan bahwa kode telah diuji dengan baik. Namun, memiliki 100% cakupan kode tidak menjamin bahwa kode tersebut bebas dari bug atau kesalahan. Masih mungkin ada kasus-kasus yang belum tercakup dalam uji unit, terutama dalam uji fungsionalitas yang kompleks.

Mengenai pembuatan uji fungsional baru, saya percaya bahwa duplikasi kode akan menurunkan kualitas kode. Menulis ulang kode yang serupa hanya akan mengotori kode dan melanggar prinsip "Don't repeat yourself (DRY)". Sebagai gantinya, saya menyarankan untuk membuat uji fungsional baru dengan pendekatan yang lebih modular, memanfaatkan penggunaan metode bantu dan pengelolaan setup yang lebih efisien. Ini akan memastikan bahwa kode tetap bersih dan mudah dipelihara di masa depan.