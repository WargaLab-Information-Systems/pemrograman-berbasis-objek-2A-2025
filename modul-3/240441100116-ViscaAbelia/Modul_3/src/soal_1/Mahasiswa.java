package soal_1;

class Mahasiswa {
    String nama;
    String nim;
    
    Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    
    void infoMahasiswa(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
    }
}

class MahasiswaReguler extends Mahasiswa{
    String kelas;
    
    MahasiswaReguler(String nama, String nim, String kelas){
        super(nama, nim);
        this.kelas = kelas; 
    }
    
    void infoReguler(){
        super.infoMahasiswa();
        System.out.println("Kelas : " + kelas);
    }
}

class MahasiswaBeasiswa extends Mahasiswa{
    String jenisBeasiswa;
    
    MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa){
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }
    void infoBeasiswa(){
        super.infoMahasiswa();
        System.out.println("Jenis Beasiswa : " + jenisBeasiswa);
    }
}
