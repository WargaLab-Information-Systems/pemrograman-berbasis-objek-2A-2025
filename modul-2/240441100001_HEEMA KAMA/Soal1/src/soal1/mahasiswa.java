/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author wingd
 */
public class mahasiswa {
    String nama;
    String prodi;
    String NIM;
    mataKuliah mk1, mk2, mk3, mk4;
    static int Jumlah= 0;
    
    mahasiswa(String nama, String prodi, String NIM){
        if (!isNIMvalid(NIM)) {
            System.err.println("NIM tidak valid untuk mahasiswa: " + nama);
        }
        this.nama = nama;
        this.NIM = NIM;
        this.prodi = prodi;
        Jumlah++;
    }
    void ambilMatkul(mataKuliah a, mataKuliah b, mataKuliah c, mataKuliah d){
        mk1 = a;
        mk2 = b;
        mk3 = c;
        mk4 = d;
    }
    void tampilkan(){
        System.out.println("---- BIODATA MAHASISWA FAKULTAS TEKNIK ----");
        System.out.println(" Nama : " + nama);
        System.out.println(" NIM : " + NIM);
        System.out.println(" Prodi : " + prodi);
        System.out.println(" Mata Kuliah : ");
        if (mk1 != null) mk1.tampilkan();
        if (mk2 != null) mk2.tampilkan();
        if (mk3 != null) mk3.tampilkan();
        if (mk4 != null) mk4.tampilkan();
        System.out.println();
    }
    static boolean isNIMvalid(String NIM){
        return NIM.startsWith("23") && NIM.length() == 10;
    }
    static int getJumlahMahasiswa(){
        return Jumlah;
    }
}
