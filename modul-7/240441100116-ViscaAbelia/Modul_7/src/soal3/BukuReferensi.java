package soal3;

public class BukuReferensi implements Reservasi {
    private String judul;
    
    BukuReferensi(String judul){
        this.judul = judul;
    }
    
    @Override
    public void reservasi(String namaPemesan) {
        System.out.println(namaPemesan + " berhasil mereservasi buku referensi : " + judul);
    }
    
}
