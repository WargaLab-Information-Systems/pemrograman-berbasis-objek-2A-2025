/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban1;

/**
 *
 * @author istikhomah
 */
class Mahasiswa {
    String nama;
    String nim;

    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    void infoMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
    }
}

class MahasiswaReguler extends Mahasiswa {
    String kelas;

    MahasiswaReguler(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas = kelas;
    }

    void infoReguler() {
        infoMahasiswa();
        System.out.println("Kelas: " + kelas);
        System.out.println("----------------------");
    }
}

class MahasiswaBeasiswa extends Mahasiswa {
    String jenisBeasiswa;

    MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }

    void infoBeasiswa() {
        infoMahasiswa();
        System.out.println("Beasiswa: " + jenisBeasiswa);
        System.out.println("----------------------");
    }
}
