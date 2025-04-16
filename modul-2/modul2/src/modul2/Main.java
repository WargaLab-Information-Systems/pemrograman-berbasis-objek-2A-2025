package modul2;
public class Main {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("IF201", "Pemrograman Dasar", 3);
        MataKuliah mk2 = new MataKuliah("IF202", "Struktur Data", 3);
        MataKuliah mk3 = new MataKuliah("IF203", "Matematika Diskrit", 2);
        MataKuliah mk4 = new MataKuliah("IF204", "Basis Data", 3);
        MataKuliah mk5 = new MataKuliah("IF205", "Jaringan Komputer", 3);
        MataKuliah mk6 = new MataKuliah("IF206", "Sistem Operasi", 3);
        MataKuliah mk7 = new MataKuliah("IF207", "PBO", 5);
        MataKuliah mk8 = new MataKuliah("IF208", "Algoritma", 2 );

        Mahasiswa m1 = new Mahasiswa("Andi Bagas", "2412345678", "Informatika");
        Mahasiswa m2 = new Mahasiswa("Budi Hadi", "2312345679", "Sistem Informasi");
        Mahasiswa m3 = new Mahasiswa("Cici Putri", "2312345680", "Informatika");
        Mahasiswa m4 = new Mahasiswa("Dewi Istiqomah", "2312345681", "Teknik Komputer");
        Mahasiswa m5 = new Mahasiswa("Eka Wati", "2312345682", "Sistem Informasi");
        Mahasiswa m6 = new Mahasiswa("Fajar Dwi", "2312345683", "Informatika");

        m1.tambahMataKuliah(mk1);
        m1.tambahMataKuliah(mk2);
        m1.tambahMataKuliah(mk3);
        m1.tambahMataKuliah(mk4);

        m2.tambahMataKuliah(mk2);
        m2.tambahMataKuliah(mk3);
        m2.tambahMataKuliah(mk5);
        m2.tambahMataKuliah(mk6);

        m3.tambahMataKuliah(mk1);
        m3.tambahMataKuliah(mk4);
        m3.tambahMataKuliah(mk7);
        m3.tambahMataKuliah(mk8);

        m4.tambahMataKuliah(mk3);
        m4.tambahMataKuliah(mk5);
        m4.tambahMataKuliah(mk6);
        m4.tambahMataKuliah(mk7);

        m5.tambahMataKuliah(mk2);
        m5.tambahMataKuliah(mk4);
        m5.tambahMataKuliah(mk6);
        m5.tambahMataKuliah(mk8);

        m6.tambahMataKuliah(mk1);
        m6.tambahMataKuliah(mk3);
        m6.tambahMataKuliah(mk5);
        m6.tambahMataKuliah(mk7);

        Kampus kampus = new Kampus("Universitas Ttunojoyo Madura", "Jl Raya Telang Kamal Bangkalan Jawa Timur");

        m1.tampilkanBiodata();
        m2.tampilkanBiodata();
        m3.tampilkanBiodata();
        m4.tampilkanBiodata();
        m5.tampilkanBiodata();
        m6.tampilkanBiodata();

        kampus.tampilkanInfoKampus();
    }
}







