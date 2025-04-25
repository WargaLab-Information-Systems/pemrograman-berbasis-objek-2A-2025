
package soal.pkg2.pbo;

public class MataKuliah {
    String kode;
    String nama;
    int sks;

    public MataKuliah(String kode, String nama, int sks) {
        if (!isValidSKS(sks)) {
            throw new IllegalArgumentException("SKS tidak valid. Hanya boleh 2 atau 3.");
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public static boolean isValidSKS(int sks) {
        return sks == 2 || sks == 3;
    }

    public void tampilkandata() {
        System.out.println("Kode Mata Kuliah: " + kode);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("------------------------");
    }
}