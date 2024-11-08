# Aplikasi Konversi Suhu

Aplikasi ini adalah aplikasi konversi suhu sederhana yang memungkinkan pengguna memasukkan nilai suhu, memilih jenis konversi, dan melihat hasil konversi dalam satuan yang berbeda. Aplikasi ini dibuat menggunakan Java Swing dengan GUI berbasis `JFrame` dan `JPanel`.

## Deskripsi Program
- Pengguna memasukkan nilai suhu yang ingin dikonversi.
- Pengguna memilih jenis konversi suhu dari beberapa opsi yang tersedia.
- Hasil konversi akan ditampilkan setelah tombol konversi ditekan.

## Fitur Program
- Mendukung konversi antara skala suhu berikut:
  - Celsius
  - Fahrenheit
  - Kelvin
  - Reamur
- Opsi pemilihan skala suhu menggunakan `JComboBox` dan `JRadioButton`.
- Validasi input untuk memastikan hanya angka yang bisa dimasukkan.
- Hasil konversi otomatis diperbarui berdasarkan input pengguna.

## Komponen GUI
- **JFrame**: Jendela utama aplikasi.
- **JPanel**: Panel untuk mengatur tata letak komponen GUI.
- **JLabel**: Untuk menampilkan teks dan hasil konversi.
- **JTextField**: Untuk pengguna memasukkan nilai suhu.
- **JComboBox**: Untuk memilih skala suhu awal.
- **JButton**: Tombol untuk memulai proses konversi.
- **JRadioButton**: Untuk memilih skala suhu tujuan.

## Logika Program
- Menggunakan rumus konversi untuk setiap skala suhu (Celsius, Fahrenheit, Kelvin, Reamur).
- Melakukan validasi input untuk memastikan hanya angka yang dapat dimasukkan pada `JTextField`.

## Events yang Digunakan
- **ActionListener** pada tombol konversi untuk memproses dan menampilkan hasil konversi saat tombol diklik.
- **ItemListener** pada `JRadioButton` untuk mengubah arah konversi sesuai pilihan pengguna.
- **KeyAdapter** pada `JTextField` untuk membatasi input hanya ke angka.

## Variasi dan Pengembangan
- Menambahkan dukungan konversi untuk skala lain seperti Reamur dan Kelvin.
- Menambahkan **ItemListener** pada `JRadioButton` untuk memilih arah konversi.
- Implementasi konversi otomatis saat nilai input diubah.

## Cara Menggunakan Aplikasi
1. Masukkan nilai suhu yang ingin dikonversi di kolom input.
2. Pilih skala suhu awal dari dropdown `JComboBox`.
3. Pilih skala suhu tujuan menggunakan `JRadioButton`.
4. Tekan tombol **Konversi** untuk melihat hasil konversi.
5. Hasil konversi akan ditampilkan di layar.

## Teknologi yang Digunakan
- Java Swing untuk membuat antarmuka GUI.
- Apache NetBeans sebagai lingkungan pengembangan terintegrasi (IDE).

## Rumus Konversi Suhu
- Celsius ke Fahrenheit: `(C * 9/5) + 32`
- Fahrenheit ke Celsius: `(F - 32) * 5/9`
- Celsius ke Kelvin: `C + 273.15`
- Kelvin ke Celsius: `K - 273.15`
- Celsius ke Reamur: `C * 4/5`
- Reamur ke Celsius: `R * 5/4`

---