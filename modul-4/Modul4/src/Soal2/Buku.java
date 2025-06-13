package Soal2;
public class Buku {
    private String judul;
    private String penulis;
    private int jumlahHalaman;

    public Buku(String judul, String penulis, int jumlahHalaman) {
        setJudul(judul);
        setPenulis(penulis);
        setJumlahHalaman(jumlahHalaman);
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        if (judul != null && !judul.trim().isEmpty()) {
            this.judul = judul;
        } else {
            System.out.println("Judul tidak boleh kosong!");
        }
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        if (penulis != null && !penulis.trim().isEmpty()) {
            this.penulis = penulis;
        } else {
            System.out.println("Penulis tidak boleh kosong!");
        }
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        if (jumlahHalaman > 0) {
            this.jumlahHalaman = jumlahHalaman;
        } else {
            System.out.println("Jumlah halaman harus lebih dari 0!");
        }
    }
}
