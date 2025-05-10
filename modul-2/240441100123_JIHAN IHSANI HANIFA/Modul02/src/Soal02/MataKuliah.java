package Soal02;

public class MataKuliah {
    private String kode;
    private String nama;
    private int jumlahSKS;

    public MataKuliah(String kode, String nama, int jumlahSKS) {
        this.kode = kode;
        this.nama = nama;
        this.jumlahSKS = jumlahSKS;
    }

    public int getJumlahSKS() {
        return jumlahSKS;
    }

    public void tampilkanDataMK() {
        System.out.println("Kode MK   : " + kode);
        System.out.println("Nama MK   : " + nama);
        System.out.println("Jumlah SKS: " + jumlahSKS);
    }

    public static boolean validasiSKS(int sks) {
        return sks >= 1 && sks <= 3;
    }
}
