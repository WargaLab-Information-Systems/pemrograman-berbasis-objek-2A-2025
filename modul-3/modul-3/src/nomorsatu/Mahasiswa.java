/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomorsatu;

/**
 *
 * @author Miftakhul Arinda
 */
class Mahasiswa {
    String nama;
    String nim;
    
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    
    public void infoMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

class MahasiswaReguler extends Mahasiswa {
    private String kelas;
    
    public MahasiswaReguler(String nama, String nim, String kelas) {
        super(nama, nim); 
        this.kelas = kelas;
    }
    
    public void infoReguler() {
        infoMahasiswa(); 
        System.out.println("Kelas: " + kelas);
        System.out.println("--------------------");
    }
}

class MahasiswaBeasiswa extends Mahasiswa {
    String jenisBeasiswa;

    public MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim); 
        this.jenisBeasiswa = jenisBeasiswa;
    }

    public void infoBeasiswa() {
        infoMahasiswa();
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
        System.out.println("--------------------");
    }
}