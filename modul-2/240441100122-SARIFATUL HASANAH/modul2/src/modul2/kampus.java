/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;


public class kampus {
    private String nama;
    private String alamat;
    private static int totalMahasiswa = 0;

    public kampus(String nama, String alamat) {
        if (!validNamaKampus(nama)) {
            System.out.println("Nama kampus tidak valid: " + nama);
            this.nama = null;
            this.alamat = null;
        } else {
            this.nama = nama;
            this.alamat = alamat;
        }
        totalMahasiswa = mahasiswa.getJumlahMahasiswa();
    }

    public static boolean validNamaKampus(String nama) {
        return nama != null && !nama.matches(".\\d.");
    }

    public void tampilkanInfoKampus() {
        if (nama == null || alamat == null) {
            System.out.println("Informasi kampus tidak valid");
            return;
        }
        System.out.println("Kampus: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
        System.out.println("Validasi Nama Kampus: " + (validNamaKampus(nama) ? "Valid" : "Tidak Valid"));
    }

    void tampilkanInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
