public class ikan {
    String nama;
    int panjang;

    public ikan(String nama, int panjang) {
        this.nama = nama;
        this.panjang = panjang;
    }

    public void berenang() {
        System.out.println(nama + " sepanjang " + panjang + " cm sedang berenang.");
    }
}