package Soal01;

public class Main {
    public static void main(String[] args) {
        String[] mk1 = {
            "IF101 - Pemrograman Dasar (3 SKS)",
            "IF102 - Struktur Data (2 SKS)",
            "IF103 - Basis Data (3 SKS)",
            "IF104 - PBO (2 SKS)"
        };

        String[] mk2 = {
            "IF103 - Basis Data (3 SKS)",
            "IF104 - PBO (2 SKS)",
            "IF105 - Matematika Diskrit (3 SKS)",
            "IF106 - Sistem Operasi (3 SKS)"
        };

        String[] mk3 = {
            "IF102 - Struktur Data (2 SKS)",
            "IF103 - Basis Data (3 SKS)",
            "IF105 - Matematika Diskrit (3 SKS)",
            "IF107 - Jaringan Komputer (3 SKS)"
        };

        String[] mk4 = {
            "IF101 - Pemrograman Dasar (3 SKS)",
            "IF104 - PBO (2 SKS)",
            "IF108 - Algoritma (3 SKS)",
            "IF105 - Matematika Diskrit (3 SKS)"
        };

        String[] mk5 = {
            "IF105 - Matematika Diskrit (3 SKS)",
            "IF106 - Sistem Operasi (3 SKS)",
            "IF107 - Jaringan Komputer (3 SKS)",
            "IF104 - PBO (2 SKS)"
        };

        String[] mk6 = {
            "IF101 - Pemrograman Dasar (3 SKS)",
            "IF102 - Struktur Data (2 SKS)",
            "IF104 - PBO (2 SKS)",
            "IF106 - Sistem Operasi (3 SKS)"
        };

        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("Fikri", "2312345683", "Informatika", mk1),
            new Mahasiswa("Alya", "2312345684", "Informatika", mk2),
            new Mahasiswa("Bima", "2312345685", "Sistem Informasi", mk3),
            new Mahasiswa("Citra", "2312345686", "Teknik Komputer", mk4),
            new Mahasiswa("Dito", "2312345687", "Informatika", mk5),
            new Mahasiswa("Eka", "2312345688", "Sistem Informasi", mk6)
        };

        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilkanData();
        }
    }
}
