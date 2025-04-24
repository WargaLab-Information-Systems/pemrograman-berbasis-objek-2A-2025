/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban2;

/**
 *
 * @author istikhomah
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM DATA MATA KULIAH ===");
        
        // Membuat 8 objek mata kuliah
        MataKuliah mk1 = new MataKuliah("IF2101", "Pemrograman Java", 3);
        MataKuliah mk2 = new MataKuliah("IF2102", "Struktur Data", 3);
        MataKuliah mk3 = new MataKuliah("IF2103", "Algoritma", 2);
        MataKuliah mk4 = new MataKuliah("IF2104", "Basis Data", 3);
        MataKuliah mk5 = new MataKuliah("IF2105", "Statistika", 2);
        MataKuliah mk6 = new MataKuliah("IF2106", "Pemrograman Web", 4); // SKS ga valid
        MataKuliah mk7 = new MataKuliah("IF2107", "Pemrograman Mobile", 1); // SKS ga valid
        MataKuliah mk8 = new MataKuliah("IF2108", "Kecerdasan Buatan", 3);
        
        // Menampilkan informasi semua mata kuliah
        System.out.println("\n=== DAFTAR MATA KULIAH ===");
        mk1.tampilInfo();
        mk2.tampilInfo();
        mk3.tampilInfo();
        mk4.tampilInfo();
        mk5.tampilInfo();
        mk6.tampilInfo();
        mk7.tampilInfo();
        mk8.tampilInfo();
    }
}

