/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

/**
 *
 * @author HP
 */
public class Pasien {
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

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        }
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public void info() {
        System.out.println("Nama      : " + nama);
        System.out.println("Umur      : " + umur);
        System.out.println("Keluhan   : " + keluhan);
        System.out.println("----------------------------");
    }
}

class Klinik {
    private Pasien[] daftarPasien;
    private int jumlahPasien;

    public Klinik(int kapasitas) {
        daftarPasien = new Pasien[kapasitas];
        jumlahPasien = 0;
    }

    public void tambahPasien(Pasien pasien) {
        if (jumlahPasien < daftarPasien.length) {
            daftarPasien[jumlahPasien] = pasien;
            jumlahPasien++;
        } else {
            System.out.println("Kapasitas klinik penuh!");
        }
    }

    public void tampilkanDaftarPasien() {
        if (jumlahPasien == 0) {
            System.out.println("Belum ada pasien yang terdaftar.");
        } else {
            for (int i = 0; i < jumlahPasien; i++) {
                daftarPasien[i].info();
            }
        }
    }
}

