/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2;


public class Main1 {
    public static void main(String[] args) {
        mahasiswa m1 = new mahasiswa("Sarifa", "2412345678", "Sistem Informasi");
        mahasiswa m2 = new mahasiswa("Salsa", "2312345679", "Teknik Informatika");
        mahasiswa m3 = new mahasiswa("Reval", "21123456809", "Teknik Informatika");
        mahasiswa m4 = new mahasiswa("Dewi", "2312345681", "Sistem Informasi");
        mahasiswa m5 = new mahasiswa("Hidayat", "2312345682", "Tenik Informatika");
        mahasiswa m6 = new mahasiswa("Haris", "2312345683", "Teknik Informatika");

        
        matakuliah mk1 = new matakuliah("MK001", "Pemrograman Berbasis Web", 3);
        matakuliah mk2 = new matakuliah("MK002", "Pengantar Basis Data", 3);
        matakuliah mk3 = new matakuliah("MK003", "Desain Manajemen Jaringan", 2);
        matakuliah mk4 = new matakuliah("MK004", "Algoritma Pemrograman Objek", 3);
        matakuliah mk5 = new matakuliah("MK005", "Jaringan Komputer", 2);
        matakuliah mk6 = new matakuliah("MK006", "E-Business & E-Commerce", 3);
        matakuliah mk7 = new matakuliah("MK007", "Pemrograman Berbasis Objek", 5);
        matakuliah mk8 = new matakuliah("MK008", "Algoritma Pemrograman", 1);

        
        m1.tambahMataKuliah(mk1);
        m1.tambahMataKuliah(mk2);
        m1.tambahMataKuliah(mk3);
        m1.tambahMataKuliah(mk4);

        m2.tambahMataKuliah(mk1);
        m2.tambahMataKuliah(mk3);
        m2.tambahMataKuliah(mk5);
        m2.tambahMataKuliah(mk7);

        m3.tambahMataKuliah(mk2);
        m3.tambahMataKuliah(mk3);
        m3.tambahMataKuliah(mk8);
        m3.tambahMataKuliah(mk5);

        m4.tambahMataKuliah(mk1);
        m4.tambahMataKuliah(mk2);
        m4.tambahMataKuliah(mk3);
        m4.tambahMataKuliah(mk6);

        m5.tambahMataKuliah(mk2);
        m5.tambahMataKuliah(mk3);
        m5.tambahMataKuliah(mk4);
        m5.tambahMataKuliah(mk5);

        m6.tambahMataKuliah(mk1);
        m6.tambahMataKuliah(mk4);
        m6.tambahMataKuliah(mk5);
        m6.tambahMataKuliah(mk6);

        kampus kampus = new kampus("Universitas Trunojoyo Madura", "Jalan Raya Telang");

        m1.tampilkanBiodata();
        m2.tampilkanBiodata();
        m3.tampilkanBiodata();
        m4.tampilkanBiodata();
        m5.tampilkanBiodata();
        m6.tampilkanBiodata();

        kampus.tampilkanInfoKampus();
    }
}
