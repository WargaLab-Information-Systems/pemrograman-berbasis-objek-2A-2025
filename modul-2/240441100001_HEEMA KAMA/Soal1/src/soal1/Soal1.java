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
        mataKuliah mk1 = new mataKuliah("MK001", "Algoritma", 3);
        mataKuliah mk2 = new mataKuliah("MK002", "PBD", 2);
        mataKuliah mk3 = new mataKuliah("MK003", "APB", 2);
        mataKuliah mk4 = new mataKuliah("MK004", "Statistika", 3);
        mataKuliah mk5 = new mataKuliah("MK005", "Machine learning", 3);
        mataKuliah mk6 = new mataKuliah("MK006", "Logika", 3);
        mataKuliah mk7 = new mataKuliah("MK007", "Agama", 4);
        mataKuliah mk8 = new mataKuliah("MK008", "Pancasila", 2);
        
        kampus Kampus = new kampus("Universitas Trunojoyo Madura", "Perumahan Telang Indah");
        
        mahasiswa mhs1 = new mahasiswa("Nada", "sISTEM INFORMASI", "23123456732");
        mhs1.ambilMatkul(mk1, mk6, mk8, mk7);
        mahasiswa mhs2 = new mahasiswa("Hallim", "teknik infromatika", "2312345674");
        mhs2.ambilMatkul(mk1, mk4, mk5, mk2);
        mahasiswa mhs3 = new mahasiswa("Salim", "Sistem Informai", "2312345674");
        mhs3.ambilMatkul(mk3, mk1, mk4, mk6);
        mahasiswa mhs4 = new mahasiswa("Hwajin", "Sistem Informasi", "2312385671");
        mhs4.ambilMatkul(mk8, mk1, mk3, mk5);
        mahasiswa mhs5 = new mahasiswa("Sera", "Sistem infromasi", "2312345670");
        mhs5.ambilMatkul(mk6, mk3, mk5, mk7);
        mahasiswa mhs6 = new mahasiswa("Yuhyoen", "Industri", "2312345690");
        mhs6.ambilMatkul(mk5, mk2, mk8, mk4);
        
        mhs1.tampilkan();
        mhs2.tampilkan();
        mhs3.tampilkan();
        mhs4.tampilkan();
        mhs5.tampilkan();
        mhs6.tampilkan();
        
        Kampus.informasi();
    }
    
}
