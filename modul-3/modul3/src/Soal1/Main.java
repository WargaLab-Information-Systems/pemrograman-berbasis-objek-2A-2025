package Soal1;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<MahasiswaReguler> daftarReguler = new ArrayList<>();
        ArrayList<MahasiswaBeasiswa> daftarBeasiswa = new ArrayList<>();

        while (true) {
            System.out.println("\n=== MENU MAHASISWA ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan jumlah Mahasiswa Reguler: ");
                    int jumlahReguler = input.nextInt();
                    input.nextLine();

                    for (int i = 0; i < jumlahReguler; i++) {
                        System.out.println("\nMahasiswa Reguler ke-" + (i + 1));
                        System.out.print("Nama: ");
                        String nama = input.nextLine();
                        System.out.print("NIM: ");
                        String nim = input.nextLine();
                        System.out.print("Kelas: ");
                        String kelas = input.nextLine();
                        daftarReguler.add(new MahasiswaReguler(nama, nim, kelas));
                    }

                    System.out.print("\nMasukkan jumlah Mahasiswa Beasiswa: ");
                    int jumlahBeasiswa = input.nextInt();
                    input.nextLine();

                    for (int i = 0; i < jumlahBeasiswa; i++) {
                        System.out.println("\nMahasiswa Beasiswa ke-" + (i + 1));
                        System.out.print("Nama: ");
                        String nama = input.nextLine();
                        System.out.print("NIM: ");
                        String nim = input.nextLine();
                        System.out.print("Jenis Beasiswa: ");
                        String jenisBeasiswa = input.nextLine();
                        daftarBeasiswa.add(new MahasiswaBeasiswa(nama, nim, jenisBeasiswa));
                    }
                    break;

                case 2:
                    System.out.println("\n=== Data Mahasiswa Reguler ===");
                    if (daftarReguler.isEmpty()) {
                        System.out.println("Belum ada data.");
                    } else {
                        for (MahasiswaReguler m : daftarReguler) {
                            m.infoReguler();
                        }
                    }

                    System.out.println("\n=== Data Mahasiswa Beasiswa ===");
                    if (daftarBeasiswa.isEmpty()) {
                        System.out.println("Belum ada data.");
                    } else {
                        for (MahasiswaBeasiswa m : daftarBeasiswa) {
                            m.infoBeasiswa();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Program selesai, Terimakasih!!.");
                    input.close();
                    return;

                default:
                    System.out.println("Menu tidak valid. Silakan pilih 1-3.");
            }
        }
    }
}