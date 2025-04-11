public class burung {
    String nama;
    String jenis;

    public burung(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void berkicau() {
        System.out.println(nama + " adalah burung jenis " + jenis + " sedang berkicau!");
    }
}
