package modul3.no.pkg1;

import java.util.Scanner;

class Mahasiswa {
    protected String nama;
    protected String nim;

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
    private final String kelas;

    public MahasiswaReguler(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas = kelas;
    }

    public void infoReguler() {
        System.out.println("=== Data Mahasiswa Reguler ===");
        infoMahasiswa();
        System.out.println("Kelas: " + kelas);
        System.out.println();
    }
}

// Class MahasiswaBeasiswa yang extends Mahasiswa
class MahasiswaBeasiswa extends Mahasiswa {
    private final String jenisBeasiswa;

    public MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }

    public void infoBeasiswa() {
        System.out.println("=== Data Mahasiswa Beasiswa ===");
        infoMahasiswa();
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
        System.out.println();
    }
}

// Main class untuk menjalankan program
public class main {
    public static void main(String[] args) {
        // Input untuk Mahasiswa Reguler
        try (Scanner scanner = new Scanner(System.in)) {
            // Input untuk Mahasiswa Reguler
            System.out.print("Masukkan jumlah mahasiswa reguler: ");
            int jumlahReguler = scanner.nextInt();
            scanner.nextLine(); 
            
            for (int i = 0; i < jumlahReguler; i++) {
                System.out.println("Mahasiswa Reguler ke-" + (i + 1));
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                System.out.print("Kelas: ");
                String kelas = scanner.nextLine();
                
                MahasiswaReguler mhs = new MahasiswaReguler(nama, nim, kelas);
                mhs.infoReguler();
            }
            
            // Input untuk Mahasiswa Beasiswa
            System.out.print("Masukkan jumlah mahasiswa beasiswa: ");
            int jumlahBeasiswa = scanner.nextInt();
            scanner.nextLine(); 
            
            for (int i = 0; i < jumlahBeasiswa; i++) {
                System.out.println("Mahasiswa Beasiswa ke-" + (i + 1));
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                System.out.print("Jenis Beasiswa: ");
                String jenisBeasiswa = scanner.nextLine();
                
                MahasiswaBeasiswa mhs = new MahasiswaBeasiswa(nama, nim, jenisBeasiswa);
                mhs.infoBeasiswa();
            }
        }
    }
}


