package Soal01;

public class main {
    public static void main(String[] args) {

        kampus kampus = new kampus("Universitas Trunojoyo Madura ", "Jl. Pemrograman No. 99");

        matakuliah mk1 = new matakuliah("MK001", "Algoritma", 3);
        matakuliah mk2 = new matakuliah("MK002", "Managemen Organisasi", 3);
        matakuliah mk3 = new matakuliah("MK003", "Basis Data", 3);
        matakuliah mk4 = new matakuliah("MK004", "PBO", 3);
        matakuliah mk5 = new matakuliah("MK005", "Sistem Operasi", 2);
        matakuliah mk6 = new matakuliah("MK006", "Pemrograman Web", 3);
        matakuliah mk7 = new matakuliah("MK007", "Logika Engineering", 3);
        matakuliah mk8 = new matakuliah("MK008", "Statistik", 2);

        mahasiswa m1 = new mahasiswa("Ariffur", "2312345678", "Informatika");
        m1.tambahMataKuliah(mk1);
        m1.tambahMataKuliah(mk2);
        m1.tambahMataKuliah(mk3);
        m1.tambahMataKuliah(mk4);

        mahasiswa m2 = new mahasiswa("Ghafirah", "2312345679", "Sistem Informasi");
        m2.tambahMataKuliah(mk2);
        m2.tambahMataKuliah(mk5);
        m2.tambahMataKuliah(mk6);
        m2.tambahMataKuliah(mk7);

        mahasiswa m3 = new mahasiswa("Gweneth", "2312345680", "Teknik Komputer");
        m3.tambahMataKuliah(mk1);
        m3.tambahMataKuliah(mk3);
        m3.tambahMataKuliah(mk6);
        m3.tambahMataKuliah(mk8);

        mahasiswa m4 = new mahasiswa("Galih", "2312345681", "Informatika");
        m4.tambahMataKuliah(mk4);
        m4.tambahMataKuliah(mk5);
        m4.tambahMataKuliah(mk6);
        m4.tambahMataKuliah(mk7);

        mahasiswa m5 = new mahasiswa("Melati", "2312345682", "Sistem Informasi");
        m5.tambahMataKuliah(mk2);
        m5.tambahMataKuliah(mk3);
        m5.tambahMataKuliah(mk7);
        m5.tambahMataKuliah(mk8);

        mahasiswa m6 = new mahasiswa("Citra", "2312345683", "Teknik Komputer");
        m6.tambahMataKuliah(mk1);
        m6.tambahMataKuliah(mk4);
        m6.tambahMataKuliah(mk5);
        m6.tambahMataKuliah(mk8);

        kampus.tampilkanInfo();

        m1.tampilkanBiodata();
        m2.tampilkanBiodata();
        m3.tampilkanBiodata();
        m4.tampilkanBiodata();
        m5.tampilkanBiodata();
        m6.tampilkanBiodata();
    }
}
