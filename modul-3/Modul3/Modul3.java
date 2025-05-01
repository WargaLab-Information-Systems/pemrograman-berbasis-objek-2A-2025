
package modul3;
// Class induk
class Mahasiswa {
    String nama;
    String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void infoMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
    }
}

// Class turunan MahasiswaReguler
class MahasiswaReguler extends Mahasiswa {
    String kelas;

    public MahasiswaReguler(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas = kelas;
    }

    public void infoReguler() {
        super.infoMahasiswa();
        System.out.println("Kelas: " + kelas);
        System.out.println();
    }
}

// Class turunan MahasiswaBeasiswa
class MahasiswaBeasiswa extends Mahasiswa {
    String jenisBeasiswa;

    public MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }

    public void infoBeasiswa() {
        super.infoMahasiswa();
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
        System.out.println();
    }
}

// Main class
public class Modul3 {
    public static void main(String[] args) {
        // Objek MahasiswaReguler
        MahasiswaReguler m1 = new MahasiswaReguler("Andi", "12345", "TI-1A");
        MahasiswaReguler m2 = new MahasiswaReguler("Budi", "67890", "TI-1B");

        m1.infoReguler();
        m2.infoReguler();

        // Objek MahasiswaBeasiswa
        MahasiswaBeasiswa b1 = new MahasiswaBeasiswa("Citra", "54321", "Bidikmisi");
        MahasiswaBeasiswa b2 = new MahasiswaBeasiswa("Dina", "98765", "LPDP");

        b1.infoBeasiswa();
        b2.infoBeasiswa();
    }
}

