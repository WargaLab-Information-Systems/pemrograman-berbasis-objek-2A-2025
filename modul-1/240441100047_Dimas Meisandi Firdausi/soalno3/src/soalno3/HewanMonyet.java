package soalno3;

class HewanMonyet {
    String nama;
    String jenis;

    HewanMonyet(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    void bersuara() {
        System.out.println(nama + " (Monyet) jenis: " + jenis + " bersuara: ooh ooh aah aah!");
    }
}
