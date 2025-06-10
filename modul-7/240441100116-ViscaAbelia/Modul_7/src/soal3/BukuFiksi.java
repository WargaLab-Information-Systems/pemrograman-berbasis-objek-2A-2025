package soal3;

public class BukuFiksi implements peminjaman, Reservasi{
    private String judul;
    
    BukuFiksi(String judul){
        this.judul = judul;
    }
    @Override
    public void pinjam(String namaPeminjam) {
        System.out.println(namaPeminjam + " berhasil meminjam buku fiksi : " + judul);
    }

    @Override
    public void reservasi(String namaPemesan) {
        System.out.println(namaPemesan + "berhasil mereservasi buku referensi : " + judul);
    }
    
}
