package soal2;

public class Buku {
    private String judul;
    private String penulis;
    private int jumlahHalaman;
    
    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }
    
    public String getJudul(){
        return judul;
    }
    public String getPenulis(){
        return penulis;
    }
    public int getJumlahHalaman(){
        return jumlahHalaman;
    }
}
