
package constructor;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        // Buat 8 objek MataKuliah
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Dasar", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Algoritma dan Struktur Data", 3);
        MataKuliah mk3 = new MataKuliah("IF103", "Basis Data", 2);
        MataKuliah mk4 = new MataKuliah("IF104", "Rekayasa Perangkat Lunak", 3);
        MataKuliah mk5 = new MataKuliah("IF105", "Jaringan Komputer", 2);
        MataKuliah mk6 = new MataKuliah("IF106", "Kecerdasan Buatan", 3);
        MataKuliah mk7 = new MataKuliah("IF107", "Sistem Operasi", 3);
        MataKuliah mk8 = new MataKuliah("IF108", "Teori Graf", 2);
        


        
        // Masukkan semua MataKuliah ke dalam daftar
        ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();
        Collections.addAll(daftarMataKuliah, mk1, mk2, mk3, mk4, mk5, mk6, mk7, mk8);

        // Buat 6 objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("Ali", "2312345678", "Informatika");
        Mahasiswa m2 = new Mahasiswa("Budi", "2312345679", "Informatika");
        Mahasiswa m3 = new Mahasiswa("Citra", "2312345680", "Informatika");
        Mahasiswa m4 = new Mahasiswa("Dina", "2312345681", "Informatika");
        Mahasiswa m5 = new Mahasiswa("Eka", "2312345682", "Informatika");
        Mahasiswa m6 = new Mahasiswa("Fajar", "2312345683", "Informatika");

         // Tambahkan mata kuliah 
        m1.tambahMataKuliah(mk1);
        m1.tambahMataKuliah(mk2);
        m1.tambahMataKuliah(mk3);
        m1.tambahMataKuliah(mk4);

        m2.tambahMataKuliah(mk1);
        m2.tambahMataKuliah(mk5);
        m2.tambahMataKuliah(mk6);
        m2.tambahMataKuliah(mk8);

        m3.tambahMataKuliah(mk2);
        m3.tambahMataKuliah(mk3);
        m3.tambahMataKuliah(mk7);
        m3.tambahMataKuliah(mk8);

        m4.tambahMataKuliah(mk1);
        m4.tambahMataKuliah(mk4);
        m4.tambahMataKuliah(mk5);
        m4.tambahMataKuliah(mk6);

        m5.tambahMataKuliah(mk2);
        m5.tambahMataKuliah(mk3);
        m5.tambahMataKuliah(mk4);
        m5.tambahMataKuliah(mk7);

        m6.tambahMataKuliah(mk5);
        m6.tambahMataKuliah(mk6);
        m6.tambahMataKuliah(mk7);
        m6.tambahMataKuliah(mk8);

        // Buat 1 objek Kampus
        Kampus kampus = new Kampus("Universitas Trunojoyo", "Bangkalan, Jawa Timur");


        // Tampilkan informasi setiap mahasiswa dan mata kuliah yang mereka ambil
        m1.tampilkanBiodata();
        m2.tampilkanBiodata();
        m3.tampilkanBiodata();
        m4.tampilkanBiodata();
        m5.tampilkanBiodata();
        m6.tampilkanBiodata();
        
        
        
        tampilkanSemuaMataKuliah(daftarMataKuliah);


        // Tampilkan informasi kampus dan validasi nama kampus
        kampus.tampilkanInfoKampus();
        if (Kampus.validNamaKampus(kampus.nama)) {
            System.out.println("Nama kampus valid.");
        } else {
            System.out.println("Nama kampus tidak valid.");
        }
    }
    
    public static void tampilkanSemuaMataKuliah(ArrayList<MataKuliah> daftarMataKuliah) {
    System.out.println("\n=== Daftar Mata Kuliah Tersedia ===");

    if (daftarMataKuliah.isEmpty()) {
        System.out.println("Belum ada mata kuliah yang tersedia.");
    } else {
        for (MataKuliah mk : daftarMataKuliah) {
            System.out.println("- " + mk.getKode() + " | " + mk.getNama() + " | " + mk.getSks() + " SKS");
        }
    }

    System.out.println("====================================\n");
}
    

}
