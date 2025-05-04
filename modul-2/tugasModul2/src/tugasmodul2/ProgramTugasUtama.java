package tugasModul2;
import java.util.Scanner;

public class ProgramTugasUtama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input dan validasi untuk Kampus
        Kampus kampus = null;
        while (kampus == null) {
            System.out.print("Masukkan nama kampus: ");
            String namaKampus = scanner.nextLine();
            try {
                kampus = new Kampus(namaKampus);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        
        // Input untuk 8 MataKuliah
        MataKuliah[] listMataKuliah = new MataKuliah[8];
        for (int i = 0; i < 8; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.println("\nInput data Mata Kuliah ke-" + (i+1));
                System.out.print("Kode Mata Kuliah: ");
                String kode = scanner.nextLine();
                System.out.print("Nama Mata Kuliah: ");
                String namaMk = scanner.nextLine();
                System.out.print("SKS (2 atau 3): ");
                int sks;
                try {
                    sks = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Input SKS harus berupa angka!");
                    continue;
                }
                try {
                    listMataKuliah[i] = new MataKuliah(kode, namaMk, sks);
                    validInput = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        
        // Input untuk 6 Mahasiswa
        Mahasiswa[] listMahasiswa = new Mahasiswa[6];
        for (int i = 0; i < 6; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.println("\nInput data Mahasiswa ke-" + (i+1));
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                System.out.print("Nama Mahasiswa: ");
                String namaMhs = scanner.nextLine();
                
                // Menampilkan daftar Mata Kuliah agar mahasiswa dapat memilih
                System.out.println("\nDaftar Mata Kuliah:");
                for (int j = 0; j < listMataKuliah.length; j++) {
                    System.out.printf("%d. %s%n", j+1, listMataKuliah[j].getInfo());
                }
                
                System.out.print("Berapa jumlah mata kuliah yang ingin diambil (minimal 4, maksimal 8): ");
                int jumlahMk;
                try {
                    jumlahMk = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Input harus berupa angka.");
                    continue;
                }
                if (jumlahMk < 4 || jumlahMk > 8) {
                    System.out.println("Jumlah mata kuliah harus antara 4 sampai 8.");
                    continue;
                }
                
                MataKuliah[] mkDipilih = new MataKuliah[jumlahMk];
                for (int k = 0; k < jumlahMk; k++) {
                    boolean validMK = false;
                    while (!validMK) {
                        System.out.print("Masukkan nomor mata kuliah ke-" + (k+1) + ": ");
                        int nomor;
                        try {
                            nomor = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Input harus berupa angka.");
                            continue;
                        }
                        if (nomor < 1 || nomor > 8) {
                            System.out.println("Nomor tidak valid. Harap input nomor antara 1 sampai 8.");
                            continue;
                        }
                        mkDipilih[k] = listMataKuliah[nomor - 1];
                        validMK = true;
                    }
                }
                
                try {
                    listMahasiswa[i] = new Mahasiswa(nim, namaMhs, mkDipilih);
                    validInput = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        
        // Menampilkan output akhir
        System.out.println("\n===============================================");
        System.out.println("Informasi Kampus:");
        kampus.tampilkanInfo();
        
        System.out.println("\nInformasi Mahasiswa dan Mata Kuliah yang diambil:");
        for (Mahasiswa mhs : listMahasiswa) {
            mhs.tampilkanInfo();
        }
        
        scanner.close();
    }
}