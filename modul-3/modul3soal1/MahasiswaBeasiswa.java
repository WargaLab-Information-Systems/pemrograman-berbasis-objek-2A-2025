package modul3soal1;
public class MahasiswaBeasiswa extends Mahasiswa {
    String jenisBeasiswa;

    public MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim); //memanggil atribut superclass
        this.jenisBeasiswa = jenisBeasiswa;
    }

    public void infoBeasiswa() {
        super.infoMahasiswa();
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
        System.out.println("-------------------------");
    }
}