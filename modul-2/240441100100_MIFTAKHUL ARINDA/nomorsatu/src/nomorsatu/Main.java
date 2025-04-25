/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomorsatu;

/**
 *
 * @author Miftakhul Arinda
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Visca", "2312345678", "Informatika");
        Mahasiswa m2 = new Mahasiswa("Arin", "2312345679", "Sistem Informasi");
        Mahasiswa m3 = new Mahasiswa("Citra", "2312345680", "Teknik Komputer");
        Mahasiswa m4 = new Mahasiswa("Fika", "2312345681", "Teknik Informatika");
        Mahasiswa m5 = new Mahasiswa("Adib", "2312345682", "RPL");
        Mahasiswa m6 = new Mahasiswa("Febby", "2312345683", "Sains Data");

        m1.tambahMataKuliah("Pemrograman Java");
        m1.tambahMataKuliah("Struktur Data");
        m1.tambahMataKuliah("Basis Data");
        m1.tambahMataKuliah("PBO");

        m2.tambahMataKuliah("Struktur Data");
        m2.tambahMataKuliah("Basis Data");
        m2.tambahMataKuliah("PBO");
        m2.tambahMataKuliah("Diskrit");

        m3.tambahMataKuliah("Pemrograman Web");
        m3.tambahMataKuliah("PBO");
        m3.tambahMataKuliah("Sistem Operasi");
        m3.tambahMataKuliah("Jaringan Komputer");

        m4.tambahMataKuliah("Dasar Pemrograman");
        m4.tambahMataKuliah("Kalkulus");
        m4.tambahMataKuliah("Algoritma");
        m4.tambahMataKuliah("Diskrit");

        m5.tambahMataKuliah("Pemrograman Java");
        m5.tambahMataKuliah("Sistem Informasi");
        m5.tambahMataKuliah("UI/UX");
        m5.tambahMataKuliah("Basis Data");

        m6.tambahMataKuliah("Pemrograman Web");
        m6.tambahMataKuliah("Big Data");
        m6.tambahMataKuliah("Analisis Data");
        m6.tambahMataKuliah("Diskrit");

        Mahasiswa[] mahasiswa = {m1, m2, m3, m4, m5, m6};
        for (Mahasiswa m : mahasiswa) {
            System.out.println("====================================");
            m.tampilkanMhs();
        }

        System.out.println("====================================");
        Mahasiswa.tampilkanTotalMahasiswa();
    }
}
