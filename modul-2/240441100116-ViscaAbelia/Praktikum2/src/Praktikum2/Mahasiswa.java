package Praktikum2;
import java.util.ArrayList;
public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    ArrayList<String> mataKuliah;   
    public static int jumlahMahasiswa = 0;
    
    Mahasiswa (String nama, String nim, String prodi){
        if (validasiNim(nim)){
            this.nama = nama;
            this.nim = nim;
            this.prodi = prodi;
            this.mataKuliah = new ArrayList<>();

            jumlahMahasiswa++;
        } else {
            System.out.println("Nim " + nim + " tidak valid.");
        }
    }
    public static int jumlahmhs(){
        return jumlahMahasiswa;
    }
    public static boolean validasiNim(String nim){
        return (nim.startsWith("23")&& nim.length()== 10);
    }

    void TambahMatkul(String... matkul){
        if (mataKuliah != null){
            for (String m : matkul){
                mataKuliah.add(m);
            }
        }
    }
   
    void tampilkanData(){
        if (nim == null){
            System.out.println("Data Mahasiswa tidak valid.");
            return;
        }
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Daftar Mata Kuliah yang diambil: ");
        for (String mk : mataKuliah){
            System.out.println("-" + mk);
        }
    }
}
