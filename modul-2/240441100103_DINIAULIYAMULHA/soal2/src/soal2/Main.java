package soal2;

public class Main {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("MK01", "Pemrograman", 3);
        MataKuliah mk2 = new MataKuliah("MK02", "Matematika", 3);
        MataKuliah mk3 = new MataKuliah("MK03", "Basis Data", 2);
        MataKuliah mk4 = new MataKuliah("MK04", "PBO", 3);
        MataKuliah mk5 = new MataKuliah("MK05", "Jaringan", 2);
        MataKuliah mk6 = new MataKuliah("MK06", "Sistem Operasi", 3);
        MataKuliah mk7 = new MataKuliah("MK07", "Bahasa Inggris", 2);
        MataKuliah mk8 = new MataKuliah("MK08", "Struktur Data", 3);

        System.out.println("Daftar Mata Kuliah:");
        mk1.tampilkanInfo();
        mk2.tampilkanInfo();
        mk3.tampilkanInfo();
        mk4.tampilkanInfo();
        mk5.tampilkanInfo();
        mk6.tampilkanInfo();
        mk7.tampilkanInfo();
        mk8.tampilkanInfo();
    }
}
