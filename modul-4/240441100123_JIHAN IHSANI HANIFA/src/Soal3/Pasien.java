package Soal3;

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

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getKeluhan() {
        return keluhan;
    }
}

class Klinik {
    private Pasien[] daftarPasien;
    private int jumlahPasien;

    public Klinik(int kapasitas) {
        daftarPasien = new Pasien[kapasitas];
        jumlahPasien = 0;
    }

    public void tambahPasien(Scanner input) {
        if (jumlahPasien >= daftarPasien.length) {
            System.out.println("Kapasitas klinik penuh!");
            return;
        }

        System.out.print("Masukkan nama pasien: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur pasien: ");
        int umur = Integer.parseInt(input.nextLine());

        System.out.print("Masukkan keluhan pasien: ");
        String keluhan = input.nextLine();

        daftarPasien[jumlahPasien] = new Pasien(nama, umur, keluhan);
        jumlahPasien++;
        System.out.println("Pasien berhasil ditambahkan!\n");
    }

    public void tampilkanDaftarPasien() {
        System.out.println("\n=== Daftar Pasien Klinik ===");
        if (jumlahPasien == 0) {
            System.out.println("Belum ada pasien.");
        } else {
            for (int i = 0; i < jumlahPasien; i++) {
                Pasien p = daftarPasien[i];
                System.out.println("Pasien ke-" + (i + 1));
                System.out.println("Nama    : " + p.getNama());
                System.out.println("Umur    : " + p.getUmur());
                System.out.println("Keluhan : " + p.getKeluhan());
                System.out.println("-----------------------------");
            }
        }
    }
}
