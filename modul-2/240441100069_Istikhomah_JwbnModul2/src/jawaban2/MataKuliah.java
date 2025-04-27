/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban2;

/**
 *
 * @author istikhomah
 */
public class MataKuliah {
    // Atribut/variabel untuk menyimpan informasi mata kuliah
    String kode;      // Kode mata kuliah
    String nama;      // Nama mata kuliah
    int sks;          // Jumlah SKS mata kuliah
    boolean sksValid; // Untuk menyimpan status validitas SKS

    // Constructor - dipanggil saat membuat objek baru
    MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        
        // Cek validitas SKS saat objek dibuat
        this.sksValid = cekSKS(sks);
    }
    
    // Method statis untuk mengecek validitas SKS dengan cara sederhana
    static boolean cekSKS(int jumlahSKS) {
        // SKS hanya valid jika bernilai 2 atau 3
        if (jumlahSKS == 2) {
            return true;
        }
        
        if (jumlahSKS == 3) {
            return true;
        }
        
        return false;
    }
 // Method untuk menampilkan informasi mata kuliah
    void tampilInfo() {
        // Tampilkan peringatan jika SKS tidak valid
        if (!this.sksValid) {
            System.out.println("PERINGATAN: SKS untuk " + nama + " tidak valid! SKS harus bernilai 2 atau 3.");
        }
        
        System.out.println("Kode  : " + kode);
        System.out.println("Nama  : " + nama);
        System.out.println("SKS   : " + sks);
        System.out.println("Status: " + (sksValid ? "Valid" : "Tidak Valid"));
        System.out.println();
    }
}


