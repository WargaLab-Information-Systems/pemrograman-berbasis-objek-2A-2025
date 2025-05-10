/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomortiga;

/**
 *
 * @author Miftakhul Arinda
 */
public class Main {
    public static void main(String[] args) {
        Kampus kampus = new Kampus("Universitas Trunojoyo", "Telang, Kamal", 500);
        kampus.tampilkanInformasiKampus();

        System.out.println();

        String nama1 = "Institut Teknologi Sepuluh Nopember";
        String nama2 = "Universitas Negeri Surabaya";
        String nama3 = "Universitas123"; 

        System.out.println("===== Status Validasi Nama Kampus =====");
        tampilkanStatusValidasi(nama1);
        tampilkanStatusValidasi(nama2);
        tampilkanStatusValidasi(nama3);
    }

    public static void tampilkanStatusValidasi(String namaKampus) {
        boolean valid = Kampus.isNamaKampusValid(namaKampus);
        System.out.println("Nama Kampus : " + namaKampus);
        System.out.println("Status Validasi : " + (valid ? "Valid" : "Tidak Valid"));
    }
}
