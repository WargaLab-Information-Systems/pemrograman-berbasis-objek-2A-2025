package Praktikum2;

public class Main {

    public static void main(String[] args) {
        Mahasiswa[] datamhs = {
            new Mahasiswa("Visca Abelia", "2304062006", "Sistem Informasi"),
            new Mahasiswa("Hoirun Nisa", "2323072005", "Manajemen"),
            new Mahasiswa("Indah Fitria", "2316042006", "Manajemen"),
            new Mahasiswa("Indah Lestari", "2405052005", "Akuntansi"),
            new Mahasiswa("Choi Beomgyu", "2313042001", "Teknik Informatika"),
            new Mahasiswa("Choi Yeonjun", "2313091999", "Teknik Informatika"),
            new Mahasiswa("Choi Soobin", "2305122000", "Manajemen"),
            new Mahasiswa("Dohyun", "2406062004", "Teknik Informatika"),
            
        };
        
        for (int i = 0; i < datamhs.length; i++) {
            Mahasiswa mhs = datamhs[i];
            if (mhs != null) {
                if (i == 0) {
                    mhs.TambahMatkul("PBW", "PBO", "PBD", "DMJ");
                } else if (i == 1) {
                    mhs.TambahMatkul("Statistik", "PA", "EtBis", "Ekonomi Islam");
                } else if (i == 2) {
                    mhs.TambahMatkul("Statistik", "PA", "EtBis", "Ekonomi Syariah");
                } else if (i == 3) {
                    mhs.TambahMatkul("Perpajakan", "Akuntansi", "Manajemen Keuangan", "Audit");
                } else if (i == 4) {
                    mhs.TambahMatkul("Dasar Pemrograman", "Struktur Data", "JarKom", "RPL");
                } else if (i == 5) {
                    mhs.TambahMatkul("Dasar Pemrograman", "Struktur Data", "JarKom", "RPL");
                } else if (i == 6) {
                    mhs.TambahMatkul("Statistik", "PA", "EtBis", "Ekonomi Syariah");
                } else if (i == 7) {
                    mhs.TambahMatkul("Dasar Pemrograman", "Struktur Data", "JarKom", "RPL");
                }
            }
        }

        System.out.println("=== Daftar Mahasiswa ===");
        for (int i = 0; i < datamhs.length; i++) {
            Mahasiswa mhs = datamhs[i];
            System.out.print((i + 1) + ". ");
            if (mhs != null) {
                mhs.tampilkanData();
            } else {
                System.out.println("Data mahasiswa tidak valid.");
            }
            System.out.println("");
        }

        System.out.println("Jumlah Mahasiswa: " + Mahasiswa.jumlahmhs());
    }
}
