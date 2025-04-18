/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author KAFI AHMAD
 */
public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Kampus: ");
        String nKampus = scanner.nextLine();
        System.out.print("Alamat Kampus: ");
        String alamat = scanner.nextLine();

        Kampus kampus = new Kampus(nKampus, alamat);
        List<Matakuliah> daftarMK = new ArrayList();
        List<Mahasiswa> daftarMhs = new ArrayList();

        // Input mata kuliah
        for (int i = 1; i <= 8; ) {
            System.out.println("\nMata Kuliah ke-" + i);
            System.out.print("Kode: "); String kode = scanner.nextLine();
            System.out.print("Nama: "); String nama = scanner.nextLine();
            System.out.print("SKS (2/3): "); int sks = scanner.nextInt(); 
            scanner.nextLine();
            if (Matakuliah.validasiSKS(sks)) {
                daftarMK.add(new Matakuliah(kode, nama, sks)); i++;
            } else System.out.println("SKS harus 2 atau 3.");
        }

        
        for (int i = 1; i <= 6; ) {
            System.out.println("\nMahasiswa ke-" + i);
            System.out.print("Nama: "); String nama = scanner.nextLine();
            System.out.print("NIM: "); String nim = scanner.nextLine();
            if (!Mahasiswa.validasiNIM(nim)) {
                System.out.println("NIM tidak valid!"); continue;
            }
            System.out.print("Prodi: "); String prodi = scanner.nextLine();
            Mahasiswa mhs = new Mahasiswa(nama, nim, prodi);

            
            for (int j = 1; j <= 4; ) {
                System.out.println("\nPilih Matkul ke-" + j);
                for (int k = 0; k < daftarMK.size(); k++)
                    System.out.println((k + 1) + ". " + daftarMK.get(k).nama + " (" + daftarMK.get(k).kode + ")");
                System.out.print("Pilih (1-" + daftarMK.size() + "): ");
                int pilih = scanner.nextInt(); scanner.nextLine();
                if (pilih >= 1 && pilih <= daftarMK.size()) {
                    mhs.tambahMatkul(daftarMK.get(pilih - 1)); j++;
                } else System.out.println("Pilihan tidak valid.");
            }

            daftarMhs.add(mhs);
            kampus.tambahMhs();
            i++;
        }

        // Output
        System.out.println("\n=== DATA MAHASISWA ===");
        for (Mahasiswa m : daftarMhs) {
            m.biodata(); System.out.println();
        }

        System.out.println("=== DATA KAMPUS ===");
        kampus.tampil();
        System.out.println(Kampus.validasiNama(nKampus) ? "Nama kampus valid." : "Nama kampus tidak valid.");
        System.out.println("Jumlah Mahasiswa: " + Kampus.jumlahMhs);

        scanner.close();
    }
}
