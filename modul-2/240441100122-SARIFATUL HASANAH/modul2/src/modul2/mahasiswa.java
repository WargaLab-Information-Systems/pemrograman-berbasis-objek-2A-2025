/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;


import java.util.ArrayList;
import java.util.List;

public class mahasiswa {
    String nama;
    String nim;
    String prodi;
    List<matakuliah> mataKuliahList;
    static int jumlahMahasiswa = 0;

    public mahasiswa(String nama, String nim, String prodi) {
        if (!validNIM(nim)) {
            System.out.println("NIM tidak valid: " + nim);
            this.nama = null;
            this.nim = null;
            this.prodi = null;
        } else {
            this.nama = nama;
            this.nim = nim;
            this.prodi = prodi;
            jumlahMahasiswa++;
        }
        this.mataKuliahList = new ArrayList<>();
    }

    public void tambahMataKuliah(matakuliah mk) {
        if (mk != null && mk.isValid()) {
            mataKuliahList.add(mk);
        }
    }

    public void tampilkanBiodata() {
        if (nama == null || nim == null || prodi == null) {
            System.out.println("Data mahasiswa tidak valid");
            System.out.println("");
            return;
        }
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Mata Kuliah:");
        for (matakuliah mk : mataKuliahList) {
            System.out.println("- " + mk.getInfo());
        }
        System.out.println();
    }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public static boolean validNIM(String nim) {
        return nim != null && nim.startsWith("23") && nim.length() == 10;
    }
}

