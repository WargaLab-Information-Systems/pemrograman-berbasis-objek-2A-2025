/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul.pkg3.pkg2;

/**
 *
 * @author KAFI AHMAD
 */
import java.util.Scanner;


class Mahasiswa {
    String nama;
    String nim;

    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    void tampil() {
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

    void tampil() {
        super.tampil();
        System.out.println("Kelas: " + kelas);
        System.out.println("Status: Mahasiswa Reguler");
    }
}

class MahasiswaBeasiswa extends Mahasiswa {
    String jenisBeasiswa;

    MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }
    
    void tampil() {
        super.tampil();
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
        System.out.println("Status: Mahasiswa Beasiswa");
    }
}

public class Soal1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[4];
        
        System.out.println("INPUT DATA MAHASISWA");
        
        for(int i = 0; i < 4; i++) {
            System.out.println("\nMahasiswa ke-" + (i+1));
            System.out.println("1. Reguler");
            System.out.println("2. Beasiswa");
            System.out.print("Pilih jenis (1/2): ");
            int jenis = input.nextInt();
            input.nextLine();

            System.out.print("Nama: ");
            String nama = input.nextLine();
            
            System.out.print("NIM: ");
            String nim = input.nextLine();

            if(jenis == 1) {
                System.out.print("Kelas: ");
                String kelas = input.nextLine();
                daftarMahasiswa[i] = new MahasiswaReguler(nama, nim, kelas);
            } else {
                System.out.print("Jenis Beasiswa: ");
                String beasiswa = input.nextLine();
                daftarMahasiswa[i] = new MahasiswaBeasiswa(nama, nim, beasiswa);
            }
        }

        System.out.println("\nDATA SELURUH MAHASISWA:");
        for(Mahasiswa mhs : daftarMahasiswa) {
            mhs.tampil();
        }
        input.close();
    }
}
