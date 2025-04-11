public class kucing {
    String nama;
    String warna;

    public kucing(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    public void meong() {
        System.out.println(nama + " si kucing berwarna " + warna + " sedang mengeong!");
    }
}
