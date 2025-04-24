/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban1;

/**
 *
 * @author istikhomah
 */
import java.util.*;
public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    List<String> matkul;
    static int total = 0;
    boolean nimValid = true;
    String validationMessage = "";
    
    Mahasiswa(String nama, String nim, String prodi) {
        this.matkul = new ArrayList<>();
        // Validasi NIM
        if (!nim.startsWith("23")) {
            nimValid = false;
            validationMessage += "Harus dimulai dengan '23'";
        }
        if (nim.length() != 10) {
            nimValid = false;
            if (validationMessage.length() > 0) {
                validationMessage += ", Harus 10 digit";
            } else {
                validationMessage += "Harus 10 digit";
            }
        }
        
        // Simpan data terlepas dari status validasi
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        
        // Hanya tambah total jika valid
        if (nimValid) {
            total++;
        }
    }
    
    void ambilMatkul(String m1, String m2, String m3, String m4) {
        if (nimValid) {
            matkul.add(m1);
            matkul.add(m2);
            matkul.add(m3);
            matkul.add(m4);
        }
    }
    
    void tampil(int no) {
        if (nimValid) {
            // Tampilkan biodata lengkap jika NIM valid
            System.out.println("=== Biodata Mahasiswa ===");
            System.out.println("Mahasiswa ke -" + no);
            System.out.println("Nama    : " + nama);
            System.out.println("NIM     : " + nim);
            System.out.println("Prodi   : " + prodi);
            System.out.println("Mata Kuliah yang diambil:");
            for (String mk : matkul) {
                System.out.println(" - " + mk);
            }
            System.out.println();
        } else {
            // Tampilkan hanya nomor mahasiswa dan alasan ketidakvalidan
            System.out.println("Mahasiswa ke-" + no);
            System.out.println("NIM tidak valid. " + validationMessage);
            System.out.println();
        }
    }
}



