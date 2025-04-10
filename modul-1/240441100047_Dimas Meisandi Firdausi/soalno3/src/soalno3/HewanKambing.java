package soalno3;

class HewanKambing {
    String nama;
    String jenis;

    HewanKambing(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    void bersuara() {
        System.out.println(nama + " (Kambing) jenis: " + jenis + " mengembik: mbeee!");
    }
}
