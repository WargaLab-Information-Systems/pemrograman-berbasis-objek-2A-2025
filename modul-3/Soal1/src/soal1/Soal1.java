/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" ----- INFORMASI DATA MAHASISWA ----- \n");
        
        System.out.println("\n----- DATA MAHASISWA REGULER -----");
        mahasiswaReguler mhsReg1 = new mahasiswaReguler("Hallim Lim","240441100001", "A \n" );
        mahasiswaReguler mhsReg2 = new mahasiswaReguler("Go Serra","240441100002", "C \n" );
        mhsReg1.infoReguler();
        mhsReg2.infoReguler();
        
        System.out.println("\n----- DATA MAHASISWA BEASISWA ----");
        mahasiswaBeasiswa mhsBea1 = new mahasiswaBeasiswa ("Hwajin", "230331100089", "B", "BEASISWA BI");
        mahasiswaBeasiswa mhsBea2 = new mahasiswaBeasiswa ("Heema", "230331100089", "A", "BEASISWA LPDP");
        mhsBea1.infoBeasiswa();
        mhsBea2.infoBeasiswa();
        
    }
    
}
