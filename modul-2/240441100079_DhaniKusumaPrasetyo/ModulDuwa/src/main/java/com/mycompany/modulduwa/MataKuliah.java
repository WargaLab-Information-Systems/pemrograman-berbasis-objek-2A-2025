package com.mycompany.modulduwa;
import java.util.Scanner;

public class MataKuliah {
    public String kode;
    public String namaMatkul;
    public int sks;
    
    public MataKuliah(Scanner masukkan){
        System.out.println("====== Input Data ======");
        
        System.out.print("masukkan kode : ");
        this.kode = masukkan.nextLine();
        
        System.out.print("masukkan nama matakuliah : ");
        this.namaMatkul = masukkan.nextLine();
        
        System.out.print("masukkan jumlah sks : ");
        this.sks = masukkan.nextInt();
        masukkan.nextLine();  
        while (!ceksks(this.sks)) {
            System.out.println(" sks tidak valid harus 2 atau 3");
            System.out.print("Masukkan sks lagi: ");
            this.sks = masukkan.nextInt();
            masukkan.nextLine();           
        }
    }
        
    public static boolean ceksks(int Inisks) {
        return Inisks == 2 || Inisks == 3;
    } 
    
    public void TampilkanMatkul(){
        System.out.println("====== Data ditampilkan ======");
        System.out.println("Kode matakuliah : " + kode);
        System.out.println("Kode matakuliah : " + namaMatkul);
        System.out.println("Kode matakuliah : " + sks);
    }
}
    
