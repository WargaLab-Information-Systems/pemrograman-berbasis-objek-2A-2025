package soal3;

public class anjing {
    String nama;
    int usia;
    String ras;
    
    public anjing(String nama, int usia, String ras) {
        this.nama = nama;
        this.usia = usia;
        this.ras = ras;
    }
    public void bersuara() {
        System.out.println(nama + "menggonggong: Woof! Woof!");
    }
    public void tampilkanInfo() {
        System.out.println("Anjing - Nama: " + nama + ", usia:" + usia + " tahun, Ras: " + ras);
    }
    
}