
package soal2;

public class buku {
    String judul;
    String penulis;
    
    public buku(String judul,String penulis){
      this.judul = judul;
      this.penulis = penulis;
    }
    
    public void infobuku(){
        System.out.println("judul: " + judul);
        System.out.println("penulis: " + penulis);
    }
}

class bukufiksi extends buku{
    String genre;
    
    public bukufiksi(String judul, String penulis, String genre){
        super(judul,penulis);
        this.genre = genre;
    }
    public void infofiksi(){
        super.infobuku();
        System.out.println("genre: " + genre);
        System.out.println();
    }
}

class bukunonfiksi extends buku {
    String topik;
    
    public bukunonfiksi(String judul, String penulis, String topik){
        super(judul,penulis);
        this.topik = topik;
    }
    public void infononfiksi(){
        super.infobuku();
        System.out.println("topik: " + topik);
        System.out.println();
    }
}
