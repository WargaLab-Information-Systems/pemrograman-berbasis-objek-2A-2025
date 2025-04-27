
package soal.pkg1.pbo;

public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    String [] matakuliah;
    
    public Mahasiswa (String nama, String nim, String prodi, String[] matakuliah) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.matakuliah = matakuliah;
    }
    public void tampilkanData () {
        System.out.println("==Biodata Mahasiswa==");
        System.out.println("Nama:"+ nama);
        System.out.println("Nim:"+ nim);
        System.out.println("Prodi:"+ prodi);
        System.out.println("Matakuliah yang diambil:");
        for (String mk : matakuliah) {
            System.out.println("- " +mk);
        }
        System.out.println("");
    }
}

