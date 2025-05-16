
package modul4.soal3;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

class Pasien {
    private String nama;
    private int umur;
    private String keluhan;

    public Pasien(String nama, int umur, String keluhan) {
        this.nama = nama;
        this.umur = umur;
        this.keluhan = keluhan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Keluhan: " + keluhan);
        System.out.println("---------------------------");
    }
}

class Klinik {
    private ArrayList<Pasien> daftarPasien = new ArrayList<>();

    public void tambahPasien(String nama, int umur, String keluhan) {
        daftarPasien.add(new Pasien(nama, umur, keluhan));
        System.out.println("Pasien berhasil ditambahkan.");
    }

    public void tampilkanSemuaPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada pasien yang terdaftar.");
        } else {
            System.out.println("=== Daftar Pasien Klinik ===");
            for (Pasien p : daftarPasien) {
                p.tampilkanInfo();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Klinik klinik = new Klinik();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu Klinik");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tampilkan Semua Pasien");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Umur: ");
                    int umur = Integer.parseInt(scanner.nextLine());
                    System.out.print("Keluhan: ");
                    String keluhan = scanner.nextLine();
                    klinik.tambahPasien(nama, umur, keluhan);
                    break;
                case "2":
                    klinik.tampilkanSemuaPasien();
                    break;
                case "3":
                    System.out.println("Terima kasih.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
