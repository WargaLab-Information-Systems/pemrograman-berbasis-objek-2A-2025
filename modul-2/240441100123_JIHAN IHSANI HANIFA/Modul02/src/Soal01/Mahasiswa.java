package Soal01;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private String[] mataKuliah;

    public Mahasiswa(String nama, String nim, String prodi, String[] mataKuliah) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.mataKuliah = mataKuliah;
    }

    public void tampilkanData() {
        System.out.println("=== BIODATA MAHASISWA ===");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Mata Kuliah yang Diambil:");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println(); // biar ada spasi antar mahasiswa
    }
}
