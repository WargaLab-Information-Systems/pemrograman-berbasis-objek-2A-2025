package constructor;

import java.util.ArrayList;

public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    ArrayList<MataKuliah> daftarMataKuliah;

    static int jumlahMahasiswa = 0;

    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.daftarMataKuliah = new ArrayList<>();
        jumlahMahasiswa++;
    }

    public void tambahMataKuliah(MataKuliah mk) {
        if (MataKuliah.valid(mk.getSks())) {
            daftarMataKuliah.add(mk);
        } else {
            System.out.println("Mata kuliah dengan SKS tidak valid dan tidak ditambahkan: " + mk.getNama());
        }
    }

    public void tampilkanBiodata() {
        System.out.println("=== Biodata Mahasiswa ===");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Daftar Mata Kuliah:");
        if (daftarMataKuliah.isEmpty()) {
            System.out.println("Belum mengambil mata kuliah.");
        } else {
            for (MataKuliah mk : daftarMataKuliah) {
                System.out.println("- " + mk.getKode() + " | " + mk.getNama() + " | " + mk.getSks() + " SKS");
            }
        }
    }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public static boolean validNIM(String nim) {
        return nim.startsWith("23") && nim.length() == 10 && nim.matches("\\d+");
    }
}
