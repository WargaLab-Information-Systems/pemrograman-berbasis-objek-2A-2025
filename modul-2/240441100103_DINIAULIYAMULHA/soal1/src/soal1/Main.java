package soal1;

public class Main {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("MK01", "Pemrograman", 3);
        MataKuliah mk2 = new MataKuliah("MK02", "Matematika", 3);
        MataKuliah mk3 = new MataKuliah("MK03", "Basis Data", 2);
        MataKuliah mk4 = new MataKuliah("MK04", "PBO", 3);
        MataKuliah mk5 = new MataKuliah("MK05", "Jaringan", 2);
        MataKuliah mk6 = new MataKuliah("MK06", "Sistem Operasi", 4);
        MataKuliah mk7 = new MataKuliah("MK07", "Bahasa Inggris", 2);
        MataKuliah mk8 = new MataKuliah("MK08", "Struktur Data", 3);

        Mahasiswa mhs1 = new Mahasiswa("Malio", "2312345678", "Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Handi", "2312345679", "Sistem Informasi");
        Mahasiswa mhs3 = new Mahasiswa("Kay", "2312345680", "Teknik Komputer");
        Mahasiswa mhs4 = new Mahasiswa("Elio", "2312345681", "Ilmu Komputer");
        Mahasiswa mhs5 = new Mahasiswa("Milan", "2312345682", "Sistem Informasi");
        Mahasiswa mhs6 = new Mahasiswa("Abian", "2312345683", "Teknik Informatika");

        mhs1.tambahMataKuliah(mk1);
        mhs1.tambahMataKuliah(mk2);
        mhs1.tambahMataKuliah(mk3);
        mhs1.tambahMataKuliah(mk4);

        mhs2.tambahMataKuliah(mk2);
        mhs2.tambahMataKuliah(mk3);
        mhs2.tambahMataKuliah(mk5);
        mhs2.tambahMataKuliah(mk6);

        mhs3.tambahMataKuliah(mk4);
        mhs3.tambahMataKuliah(mk6);
        mhs3.tambahMataKuliah(mk7);
        mhs3.tambahMataKuliah(mk8);

        mhs4.tambahMataKuliah(mk5);
        mhs4.tambahMataKuliah(mk6);
        mhs4.tambahMataKuliah(mk1);
        mhs4.tambahMataKuliah(mk8);

        mhs5.tambahMataKuliah(mk3);
        mhs5.tambahMataKuliah(mk7);
        mhs5.tambahMataKuliah(mk2);
        mhs5.tambahMataKuliah(mk4);

        mhs6.tambahMataKuliah(mk1);
        mhs6.tambahMataKuliah(mk5);
        mhs6.tambahMataKuliah(mk6);
        mhs6.tambahMataKuliah(mk7);

        mhs1.tampilkanBiodata();
        mhs2.tampilkanBiodata();
        mhs3.tampilkanBiodata();
        mhs4.tampilkanBiodata();
        mhs5.tampilkanBiodata();
        mhs6.tampilkanBiodata();
    }
}