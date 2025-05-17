package Soal1;

public class Main{
    public static void main(String[] args) {
        // Buat kampus
        Kampus kampus = new Kampus("Universitas Trunojoyo Madura", "Jl. Pemrograman No. 99");

        // Buat 8 mata kuliah
        MataKuliah mk1 = new MataKuliah("MK001", "Algoritma", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Struktur Data", 3);
        MataKuliah mk3 = new MataKuliah("MK003", "Basis Data", 2);
        MataKuliah mk4 = new MataKuliah("MK004", "PBO", 3);
        MataKuliah mk5 = new MataKuliah("MK005", "Sistem Operasi", 2);
        MataKuliah mk6 = new MataKuliah("MK006", "Pemrograman Web", 3);
        MataKuliah mk7 = new MataKuliah("MK007", "Kalkulus", 3);
        MataKuliah mk8 = new MataKuliah("MK008", "Statistik", 2);

        // Buat 6 mahasiswa dan tambah mata kuliah
        Mahasiswa m1 = new Mahasiswa("Dhanil", "2312345678", "Informatika");
        m1.tambahMataKuliah(mk1);
        m1.tambahMataKuliah(mk2);
        m1.tambahMataKuliah(mk3);
        m1.tambahMataKuliah(mk4);

        Mahasiswa m2 = new Mahasiswa("Sherly", "2312345679", "Sistem Informasi");
        m2.tambahMataKuliah(mk2);
        m2.tambahMataKuliah(mk5);
        m2.tambahMataKuliah(mk6);
        m2.tambahMataKuliah(mk7);

        Mahasiswa m3 = new Mahasiswa("Ibat", "2312345680", "Teknik Komputer");
        m3.tambahMataKuliah(mk1);
        m3.tambahMataKuliah(mk3);
        m3.tambahMataKuliah(mk6);
        m3.tambahMataKuliah(mk8);

        Mahasiswa m4 = new Mahasiswa("Rara", "2312345681", "Informatika");
        m4.tambahMataKuliah(mk4);
        m4.tambahMataKuliah(mk5);
        m4.tambahMataKuliah(mk6);
        m4.tambahMataKuliah(mk7);

        Mahasiswa m5 = new Mahasiswa("Andi", "2312345682", "Sistem Informasi");
        m5.tambahMataKuliah(mk2);
        m5.tambahMataKuliah(mk3);
        m5.tambahMataKuliah(mk7);
        m5.tambahMataKuliah(mk8);

        Mahasiswa m6 = new Mahasiswa("Fira", "2312345683", "Teknik Komputer");
        m6.tambahMataKuliah(mk1);
        m6.tambahMataKuliah(mk4);
        m6.tambahMataKuliah(mk5);
        m6.tambahMataKuliah(mk8);

        // Tampilkan info kampus
        kampus.tampilkanInfo();

        // Tampilkan info mahasiswa
        m1.tampilkanBiodata();
        m2.tampilkanBiodata();
        m3.tampilkanBiodata();
        m4.tampilkanBiodata();
        m5.tampilkanBiodata();
        m6.tampilkanBiodata();
  }

}