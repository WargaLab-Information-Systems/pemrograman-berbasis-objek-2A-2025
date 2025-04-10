package soalno3;

class HewanAyam {
    String nama;
    String jenis;

//    konstruktor
    HewanAyam(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
//    method
    void bersuara() {
        System.out.println(nama + " (Ayam) jenis: " + jenis + " berbunyi: kokok kokok!");
    }
}
