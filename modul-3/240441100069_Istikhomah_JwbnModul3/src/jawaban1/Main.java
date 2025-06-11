/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban1;

/**
 *
 * @author istikhomah
 */
public class Main {
    public static void main(String[] args) {
        // Objek Mahasiswa Reguler
        MahasiswaReguler m1 = new MahasiswaReguler("Mingyu", "22150101", "SI-2A");
        MahasiswaReguler m2 = new MahasiswaReguler("Jennie", "22150102", "HI-2B");

        // Objek Mahasiswa Beasiswa
        MahasiswaBeasiswa m3 = new MahasiswaBeasiswa("Jaehyun", "22150103", "Unggulan");
        MahasiswaBeasiswa m4 = new MahasiswaBeasiswa("Rose", "22150104", "KIP-K");

        // Tampilkan info
        m1.infoReguler();
        m2.infoReguler();
        m3.infoBeasiswa();
        m4.infoBeasiswa();
    }
}
