package soal3;

public class burung {
    String nama;
    int usia;
    String jenis;
    
    public burung(String nama, int usia, String jenis) {
        this.nama = nama;
        this.usia = usia;
        this.jenis = jenis;
}
    public void bersuara() {
        System.out.println(nama + "berkicau: Cuit~ Cuit~");
    }
    public void tampilkanInfo() {
        System.out.println("Burung - Nama: " + nama + ", Usia: " + usia + " tahun, Jenis: " + jenis);
    }
}
