package jawabanmodul2;

public class MataKuliah {
    String kodeMataKuliah;
    String namaMataKuliah;
    int jumlahSKS;

    // konstruktor MataKuliah
    public MataKuliah(String kodeMataKuliah, String namaMataKuliah, int jumlahSKS) {
        if (cekSKSValid(jumlahSKS)) {
            this.kodeMataKuliah = kodeMataKuliah;
            this.namaMataKuliah = namaMataKuliah;
            this.jumlahSKS = jumlahSKS;
        } else {
            System.out.println("SKS untuk mata kuliah " + namaMataKuliah + " tidak valid.");
        }
    }

    // method statis untuk cek validitas SKS
    public static boolean cekSKSValid(int sks) {
        return sks == 2 || sks == 3;
    }

    // method untuk menampilkan data mata kuliah
    public void tampilkanData() {
        if (kodeMataKuliah != null) {
            System.out.println("Kode Mata Kuliah: " + kodeMataKuliah);
            System.out.println("Nama Mata Kuliah: " + namaMataKuliah);
            System.out.println("Jumlah SKS: " + jumlahSKS);
            System.out.println();
        }
    }
}
