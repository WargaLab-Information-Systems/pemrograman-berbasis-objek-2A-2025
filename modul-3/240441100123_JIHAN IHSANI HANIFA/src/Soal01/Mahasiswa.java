package Soal01;

public class Mahasiswa {
    protected String nama;
    protected String nim;
    
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    
    public void infoMahasiswa() {
        System.out.println("Nama = " + nama);
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
        System.out.println("===Data Mahasiswa Reguler===");
        infoMahasiswa();
        System.out.println("Kelas: " + kelas);
        System.out.println();
    }
}

class MahasiswaBeasiswa extends Mahasiswa {
    private String jenisBeasiswa;
    
    public MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }
    
    public void infoBeasiswa() {
        System.out.println("===Data Mahasiswa Beasiswa===");
        infoMahasiswa();
        System.out.println("jenis beasiswa: " + jenisBeasiswa);
        System.out.println();
    }
}