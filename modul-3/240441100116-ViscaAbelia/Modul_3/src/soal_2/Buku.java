package soal_2;

public class Buku {
    String judul;
    String penulis;
    
    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    
    void info(){
        System.out.println("Judul : " + judul);
        System.out.println("penulis : " + penulis);
    }
}

class BukuFiksi extends Buku{
    String genre;
    
    BukuFiksi(String judul, String penulis, String genre){
        super(judul, penulis);
        this.genre = genre;
    }
    void infoFiksi(){
        super.info();
        System.out.println("Genre : " + genre);
    }
}

class BukuNonFiksi extends Buku{
    String topik;
    
    BukuNonFiksi(String judul, String penulis, String topik){
        super(judul, penulis);
        this.topik = topik;
    }
    
    void infoNonFiksi(){
        super.info();
        System.out.println("Topik : " + topik);
    }
}
