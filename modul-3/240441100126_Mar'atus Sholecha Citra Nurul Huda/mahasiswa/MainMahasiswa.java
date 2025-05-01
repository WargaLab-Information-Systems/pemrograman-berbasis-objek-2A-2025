import java.util.ArrayList;
import java.util.Scanner;

// Superclass
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

// Subclass MahasiswaReguler
class MahasiswaReguler extends Mahasiswa {
    private final String kelas;

    public MahasiswaReguler(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas = kelas;
    }

    public void infoReguler() {
        infoMahasiswa();
        System.out.println("Kelas: " + kelas);
    }
}

// Subclass MahasiswaBeasiswa
class MahasiswaBeasiswa extends Mahasiswa {
    private final String jenisBeasiswa;

    public MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }

    public void infoBeasiswa() {
        infoMahasiswa();
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
    }
}

// Main Program
public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MahasiswaReguler> regulerList = new ArrayList<>();
        ArrayList<MahasiswaBeasiswa> beasiswaList = new ArrayList<>();

        System.out.print("Masukkan jumlah Mahasiswa Reguler: ");
        int nReguler = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nReguler; i++) {
            System.out.println("\nData Mahasiswa Reguler ke-" + (i+1));
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            regulerList.add(new MahasiswaReguler(nama, nim, kelas));
        }

        System.out.print("\nMasukkan jumlah Mahasiswa Beasiswa: ");
        int nBeasiswa = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nBeasiswa; i++) {
            System.out.println("\nData Mahasiswa Beasiswa ke-" + (i+1));
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Jenis Beasiswa: ");
            String jenis = sc.nextLine();
            beasiswaList.add(new MahasiswaBeasiswa(nama, nim, jenis));
        }

        System.out.println("\n=== DATA MAHASISWA REGULER ===");
        for (MahasiswaReguler m : regulerList) {
            m.infoReguler();
            System.out.println("----------------------");
        }

        System.out.println("\n=== DATA MAHASISWA BEASISWA ===");
        for (MahasiswaBeasiswa m : beasiswaList) {
            m.infoBeasiswa();
            System.out.println("----------------------");
        }
    }
}
