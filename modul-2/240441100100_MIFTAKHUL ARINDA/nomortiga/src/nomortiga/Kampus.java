/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomortiga;

/**
 *
 * @author Miftakhul Arinda
 */
public class Kampus {
    private String nama;
    private String alamat;
    int totalMahasiswa;

    public Kampus(String namaKampus, String alamatKampus, int totalMahasiswa) {
        if (!isNamaKampusValid(namaKampus)) {
            System.out.println("Nama kampus tidak valid."); 
        }
        this.nama = namaKampus;
        this.alamat = alamatKampus;
        this.totalMahasiswa = totalMahasiswa;
    }

    public static boolean isNamaKampusValid(String namaKampus) {
        return namaKampus != null && !namaKampus.matches(".*\\d.*"); 
    }

    public void tampilkanInformasiKampus() {
        System.out.println("Nama Kampus   : " + nama);
        System.out.println("Alamat Kampus : " + alamat);
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
    }
}
