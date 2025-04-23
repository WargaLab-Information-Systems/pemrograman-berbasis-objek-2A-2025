/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class kampus {
    String namaKampus;
    String lokasi;
    
    kampus(String namaKampus, String lokasi){
        if (!validasiNama(namaKampus)) {
            System.err.println("Nama kampus tidak valid: " + namaKampus);
        }
        this.namaKampus = namaKampus;
        this.lokasi = lokasi;   
    }
    void informasi(){
        System.out.println(" ----- Informasi Kampus -----");
        System.out.println(" Nama Kampus : " + namaKampus);
        System.out.println(" Lokasi : " + lokasi);
        System.out.println(" Status Nama Kampus : " + (validasiNama(namaKampus)? "valid" : "tidak valid"));
        System.out.println(" jumlah mahasiswa : " + mahasiswa.getJumlahMahasiswa());
    }
    static boolean validasiNama(String nama){
        return !nama.matches(",*\\d.*");
    }
}
