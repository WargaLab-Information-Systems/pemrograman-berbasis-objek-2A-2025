package soalno2;

import java.util.Scanner;

// kelas
class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    String alamat;
    
    // konstruktor
    Mahasiswa(String nama, String nim, String jurusan, String alamat) {
        // atribut dan parameter
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
    
    // method menampilkan informasi
    void tampilMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }
}

public class IniMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input data mahasiswa 1
        System.out.println("Masukkan data untuk mahasiswa pertama:");
        System.out.print("Nama: ");
        String nama1 = scanner.nextLine();
        System.out.print("NIM: ");
        String nim1 = scanner.nextLine();
        System.out.print("Jurusan/Prodi: ");
        String jurusan1 = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat1 = scanner.nextLine();
        
        // objek mahasiswa 1
        Mahasiswa mahasiswa1 = new Mahasiswa(nama1, nim1, jurusan1, alamat1);

        // input data mahasiswa 2
        System.out.println("\nMasukkan data untuk mahasiswa kedua:");
        System.out.print("Nama: ");
        String nama2 = scanner.nextLine();
        System.out.print("NIM: ");
        String nim2 = scanner.nextLine();
        System.out.print("Jurusan/Prodi: ");
        String jurusan2 = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat2 = scanner.nextLine();
        
        // objek mahasiswa 2
        Mahasiswa mahasiswa2 = new Mahasiswa(nama2, nim2, jurusan2, alamat2);

        // input data mahasiswa 3
        System.out.println("\nMasukkan data untuk mahasiswa ketiga:");
        System.out.print("Nama: ");
        String nama3 = scanner.nextLine();
        System.out.print("NIM: ");
        String nim3 = scanner.nextLine();
        System.out.print("Jurusan/Prodi: ");
        String jurusan3 = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat3 = scanner.nextLine();
        
        // objek mahasiswa 3
        Mahasiswa mahasiswa3 = new Mahasiswa(nama3, nim3, jurusan3, alamat3);

        // tampilkan
        System.out.println("\n=== Data Mahasiswa ===\n");
        
        mahasiswa1.tampilMahasiswa();
        System.out.println();
        
        mahasiswa2.tampilMahasiswa();
        System.out.println();
        
        mahasiswa3.tampilMahasiswa();
        System.out.println();

 
    }
}
