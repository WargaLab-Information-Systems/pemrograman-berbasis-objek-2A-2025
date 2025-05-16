package modul3j;
import java.util.Scanner;

class Mahasiswa {
    public String nama;
    public String nim;
    
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;   
    }
    
    public void inputMh(Scanner input) {
        System.out.print("masukkan nama: ");
        this.nama = input.nextLine();
        System.out.print("masukkan NIM: ");
        this.nim = input.nextLine();
    }
    
    public void mahasiswaInfo() {
        System.out.println("nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

class Reguler extends Mahasiswa {
    public String kelas;
    
    public Reguler(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas = kelas;
    }
    
    public void inputRg(Scanner input) {
        super.inputMh(input);
        System.out.print("masukkan kelas: ");
        this.kelas = input.nextLine();
    }
    
    public void tampilReguler() {
        super.mahasiswaInfo();
        System.out.println("kelas: " + kelas);
    }
}

class Beasiswa extends Mahasiswa {
    public String jenisBeasiswa;
    
    public Beasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }
    
    public void inputBs(Scanner input) {
        super.inputMh(input);
        System.out.print("masukkan jenis beasiswa: ");
        this.jenisBeasiswa = input.nextLine();
        
    }
    
    public void tampilBeasiswa() {
        super.mahasiswaInfo();
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("input mahasiswa reguler");
            Reguler mhsReguler = new Reguler("", "", "");
            mhsReguler.inputRg(input);
            
            System.out.println("\ninput mahasiswa beasiswa");
            Beasiswa ba = new Beasiswa("", "", "");
            ba.inputBs(input);
            
            System.out.println("\nmahasiswa reguler ");
            mhsReguler.tampilReguler();
            
            System.out.println("\nmahasiswa beasiswa ");
            ba.tampilBeasiswa();
        }
    }
}