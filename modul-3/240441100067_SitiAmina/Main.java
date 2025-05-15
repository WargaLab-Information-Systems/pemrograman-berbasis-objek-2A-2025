
package javaapplication3;


class Mahasiswa {
    protected String nama;
    protected String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void InfoMahasiswa() {
        System.out.println("Nama = " + nama + " | NIM = " + nim);
    }
}
class MahasiswaReguler extends Mahasiswa {
    private String kelas;

    public MahasiswaReguler(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas = kelas;
    }

    public void InfoReguler() {
        super.InfoMahasiswa();
        System.out.println("Kelas = " + kelas);
    }
}

class BeasiswaMahasiswa extends Mahasiswa {
    private String JenisBeasiswa;

    public BeasiswaMahasiswa(String nama, String nim, String JenisBeasiswa) {
        super(nama, nim);
        this.JenisBeasiswa = JenisBeasiswa;
    }

    public void InfoBeasiswa() {
        super.InfoMahasiswa();
        System.out.println("Jenis Beasiswa = " + JenisBeasiswa);
    }
}
public class Main {
    public static void main(String[] args) {
        MahasiswaReguler objek1 = new MahasiswaReguler("Siti Amina", "240441100067", "PBO-A");
        MahasiswaReguler objek2 = new MahasiswaReguler("Novidatul", "240441100070", "PBO-B");

        objek1.InfoReguler();
        System.out.println(" ");
        objek2.InfoReguler();
        System.out.println(" ");

        BeasiswaMahasiswa b1 = new BeasiswaMahasiswa("Siti Amina", "240441100067", "Bank Indonesia");
        BeasiswaMahasiswa b2 = new BeasiswaMahasiswa("Novida", "240441100070", "Djarum");

        b1.InfoBeasiswa();
        System.out.println(" ");
        b2.InfoBeasiswa();
        System.out.println(" ");
    }
}

