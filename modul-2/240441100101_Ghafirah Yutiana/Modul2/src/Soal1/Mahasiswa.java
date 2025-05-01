package Soal1;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private ArrayList<MataKuliah> daftarMataKuliah;

    private static int totalMahasiswa = 0;

    public Mahasiswa(String nama, String nim, String prodi) {
        if (!isValidNIM(nim)) {
            throw new IllegalArgumentException("NIM tidak valid! Harus dimulai dengan '23' dan 10 digit.");
        }
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.daftarMataKuliah = new ArrayList<>();
        totalMahasiswa++;
    }

    public void tambahMataKuliah(MataKuliah mk) {
        daftarMataKuliah.add(mk);
    }

    public void tampilkanBiodata() {
        System.out.println("====================================");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah mk : daftarMataKuliah) {
            System.out.println("- " + mk.getNama() + " (" + mk.getKode() + "), SKS: " + mk.getSks());
        }
        System.out.println();
    }

    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }

    public static boolean isValidNIM(String nim) {
        return nim.startsWith("23") && nim.length() == 10;
    }
}