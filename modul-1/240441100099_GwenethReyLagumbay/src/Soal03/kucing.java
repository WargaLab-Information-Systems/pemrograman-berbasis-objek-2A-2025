package soal03;

public class kucing {
    String nama;
    int usia;
    String warna;
    
    public kucing(String nama, int usia, String warna) {
        this.nama = nama;
        this.usia = usia;
        this.warna = warna;
    }
    public void bersuara() {
        System.out.println(nama + " mengeong : Meow~ Meow~");
    }
    public void tampilkanInfo() {
        System.out.println("Kucing - Nama: " + nama + ", Usia: " + usia + " tahun, Warna: " + warna);
    }
    
}
