/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author KAFI AHMAD
 */
class Mahasiswa{
    String nama;
    String nim;
    String prodi;
    List<Matakuliah> matkul = new ArrayList();

    Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama; 
        this.nim = nim; 
        this.prodi = prodi;

    }

    void tambahMatkul(Matakuliah matakuliah) {
        if (!matkul.contains(matakuliah)) matkul.add(matakuliah);
        else System.out.println("Mata kuliah telah diambil.");
    }

    void biodata() {
        System.out.println("Nama: " + nama + " utm" + "NIM: " + nim + "Prodi: " + prodi);
        for (Matakuliah m : matkul)
            System.out.println("Matkul: " + m.nama + ", Kode: " + m.kode + ", SKS: " + m.sks);
    }

    static boolean validasiNIM(String nim) {
        return nim.startsWith("23") && nim.length() == 10;
    }
}

