/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban3;

public class Main {
    public static void main(String[] args) {
        // Daftar nama dan warna hewan
        String[] namaKucing = {"Kitten", "Kitty", "Memeng"};
        String[] warnaKucing = {"Hitam", "Putih", "Abu-abu"};
        
        String[] namaAnjing = {"Milo", "Dazzle", "Aung"};
        String[] jenisAnjing = {"Bulldog", "Golden Retriever", "Pomeranian"};
        String[] namaBurung = {"Garuda", "Rio", "Merpati"};
        String[] warnaBurung = {"Merah", "Biru", "Putih"};

        // Menggunakan loop for untuk membuat dan menampilkan hewan
        for (int i = 0; i < 3; i++) {
            // Membuat objek dengan nama dan warna spesifik
            Kucing kucing = new Kucing(namaKucing[i], warnaKucing[i]);
            Anjing anjing = new Anjing(namaAnjing[i], jenisAnjing[i]);
            Burung burung = new Burung(namaBurung[i], warnaBurung[i]);

            // Menampilkan suara hewan dengan warna/jenisnya
            System.out.println("=== Hewan ke-" + (i + 1) + " ===");
            kucing.bersuara();
            anjing.bersuara();
            burung.berkicau();
            System.out.println(); // Memberi jarak antar data
        }
    }
}


