/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomorsatu;

import java.util.ArrayList;

/**
 *
 * @author Miftakhul Arinda
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    
    private ArrayList<String> daftarMataKuliah = new ArrayList<>();
    
    private static int totalMhs=0;
    
    public Mahasiswa(String nama, String nim, String prodi){
        this.nama= nama;
        this.nim= nim;
        this.prodi= prodi;
        totalMhs++;
        
        if (!isNIMValid(nim)) {
            System.out.println("Nim tidak valid");
        } 
    }   
    
    public void tambahMataKuliah(String mk) {
        daftarMataKuliah.add(mk);
    }
    
    public void tampilkanMhs() {
    System.out.println("Nama        : " + nama);
    System.out.println("NIM         : " + nim);
    System.out.println("Prodi       : " + prodi);
    System.out.println("Mata Kuliah yang Diambil:");

    for (String mk: daftarMataKuliah){
        System.out.println("-" + mk);
    }
}
      
    public static void tampilkanTotalMahasiswa() {
        System.out.println("Total Mahasiswa yang telah dibuat: " + totalMhs);
    }
    
    public static boolean isNIMValid(String nim) {
    if (nim == null || nim.length() != 10) {
        return false;
    }

    if (!nim.startsWith("23")) {
        return false;
    }

    String digits = nim.substring(2);
    return digits.matches("\\d{8}");
    }
}