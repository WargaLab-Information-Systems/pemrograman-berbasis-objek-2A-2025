public class Main {
    public static void main(String[] args) {
        // Buat MataKuliah
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Dasar", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 3);
        MataKuliah mk3 = new MataKuliah("IF103", "Basis Data", 3);
        MataKuliah mk4 = new MataKuliah("IF104", "Jaringan Komputer", 2);
        MataKuliah mk5 = new MataKuliah("IF105", "Sistem Operasi", 3);
        MataKuliah mk6 = new MataKuliah("IF106", "Kalkulus", 2);
        MataKuliah mk7 = new MataKuliah("IF107", "Algoritma", 3);
        MataKuliah mk8 = new MataKuliah("IF108", "AI Dasar", 4);

        // Buat Mahasiswa
        Mahasiswa m1 = new Mahasiswa("Rofi", "2312345678", "Informatika");
        m1.tambahMataKuliah(mk1);
        m1.tambahMataKuliah(mk2);
        m1.tambahMataKuliah(mk3);
        m1.tambahMataKuliah(mk4);

        Mahasiswa m2 = new Mahasiswa("Hasyim", "2312345679", "Sistem Informasi");
        m2.tambahMataKuliah(mk2);
        m2.tambahMataKuliah(mk3);
        m2.tambahMataKuliah(mk5);
        m2.tambahMataKuliah(mk6);

        Mahasiswa m3 = new Mahasiswa("Andika", "2312345680", "Teknik Komputer");
        m3.tambahMataKuliah(mk1);
        m3.tambahMataKuliah(mk5);
        m3.tambahMataKuliah(mk7);
        m3.tambahMataKuliah(mk8);

        Mahasiswa m4 = new Mahasiswa("Doni", "2312345681", "Informatika");
        m4.tambahMataKuliah(mk1);
        m4.tambahMataKuliah(mk4);
        m4.tambahMataKuliah(mk6);
        m4.tambahMataKuliah(mk7);

        Mahasiswa m5 = new Mahasiswa("Eva", "2312345682", "Sistem Informasi4");
        m5.tambahMataKuliah(mk3);
        m5.tambahMataKuliah(mk4);
        m5.tambahMataKuliah(mk5);
        m5.tambahMataKuliah(mk8);

        Mahasiswa m6 = new Mahasiswa("Fajar", "2312345683", "Teknik Komputer");
        m6.tambahMataKuliah(mk1);
        m6.tambahMataKuliah(mk2);
        m6.tambahMataKuliah(mk7);
        m6.tambahMataKuliah(mk8);

        // Buat Kampus
        Kampus kampus = new Kampus("Universitas Trunojoyo madura", "Jl. Telang, Bangkalan");

        // Tampilkan biodata mahasiswa
        m1.tampilkanBiodata();
        m2.tampilkanBiodata();
        m3.tampilkanBiodata();
        m4.tampilkanBiodata();
        m5.tampilkanBiodata();
        m6.tampilkanBiodata();

        // Tampilkan info kampus
        kampus.tampilkanInfo();
    }
}