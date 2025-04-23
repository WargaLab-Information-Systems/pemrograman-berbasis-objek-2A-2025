
package soal1;

import java.util.Scanner;

public class Kampus {
    private String nama;
    private String alamat;
    public int totalMahasiswa;

    private static final Scanner scanner = new Scanner(System.in);
    
    public void Kampus(String nama, String alamat) {
        if (!validasiNamaKampus(nama)) {
            throw new IllegalArgumentException("Nama kampus tidak valid");
        }
        this.nama = nama;
        this.alamat = alamat;
    }

    public void inputdatakampus(Scanner input){
        System.out.println("masukkan nama dan alamat");
        while (true) {
            System.out.print("Masukkan nama kampus: ");
            this.nama = scanner.nextLine();
            if (validasiNamaKampus(this.nama)) {
                break; 
            } else {
                System.out.println("nama kampus tidak noeh mengandung angka");
            }
        }
        System.out.print("masukkan alamat kampus:  ; ");
        this.alamat = scanner.nextLine();
        
        System.out.print("Masukkan jumlah total mahasiswa: ");
        while (!input.hasNextInt()) {
            System.out.println(" Jumlah mahasiswa harus berupa angka.");
            System.out.print("Masukkan jumlah total mahasiswa lagi: ");
            input.next(); // buang input yang salah
        }
        this.totalMahasiswa = input.nextInt();
        input.nextLine(); // membersihkan newline

    }

    public void tampilkanInfoKampus() {
        System.out.println("\nInformasi Kampus:");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
       
    }
    public String getNama() {
        return nama;
    }
    public String getalamat() {
        return alamat;
    }
    

    public static boolean validasiNamaKampus(String nama) {
        return nama != null && !nama.matches(".*\\d.*");
    }
}