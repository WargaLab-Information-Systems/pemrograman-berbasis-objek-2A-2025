package soal3;

public class Pasien {
    private String nama;
    private int umur;
    private String keluhan;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void setKeluhan(String keluhan){
        this.keluhan = keluhan;
    }
    
    public String getNama(){
        return nama;
    }
    public int getUmur(){
        return umur;
    }
    public String getKeluhan(){
        return keluhan;
    }
}
