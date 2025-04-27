/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban3;

/**
 *
 * @author istikhomah
 */
public class Kampus {
    // Atribut untuk menyimpan data kampus
    String nama;             // Nama kampus
    String alamat;           // Alamat kampus
    boolean namaValid;       // Status validasi nama kampus
    
    // Atribut class (static) untuk menyimpan jumlah total mahasiswa
    static int totalMahasiswa = 0;
    
    // Constructor - dipanggil saat membuat objek baru
    Kampus(String nama, String alamat, int jumlahMahasiswa) {
        this.nama = nama;
        this.alamat = alamat;
        
        // Tambahkan jumlah mahasiswa ke total
        totalMahasiswa += jumlahMahasiswa;
        
        // Cek validasi nama kampus
        this.namaValid = cekNamaKampus(nama);
    }
    
    // Method statis untuk mengecek validitas nama kampus
    static boolean cekNamaKampus(String nama) {
        // Periksa setiap karakter dalam nama kampus
        for (int i = 0; i < nama.length(); i++) {
            char c = nama.charAt(i);
            
            // Jika karakter adalah angka, nama tidak valid
            if (c >= '0' && c <= '9') {
                return false;
            }
        }
        
        // Jika tidak ada angka, nama valid
        return true;
    }
    
    // Method statis untuk menampilkan info kampus
    static void tampilInfoKampus(Kampus k) {
        System.out.println("=== INFORMASI KAMPUS ===");
        System.out.println("Nama Kampus     : " + k.nama);
        System.out.println("Total Mahasiswa : " + totalMahasiswa);
    }
    
    // Method untuk menampilkan semua informasi kampus termasuk validasi
    void tampilDetail() {
        System.out.println("=== DETAIL KAMPUS ===");
        System.out.println("Nama Kampus     : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Total Mahasiswa : " + totalMahasiswa);
        
        // Tampilkan status validasi
        if (namaValid) {
            System.out.println("Status Nama     : Valid");
        } else {
            System.out.println("PERINGATAN: Nama kampus tidak valid! Nama tidak boleh mengandung angka.");
            System.out.println("Status Nama     : Tidak Valid");
        }
    }
}


