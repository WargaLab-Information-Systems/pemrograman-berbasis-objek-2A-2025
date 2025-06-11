
package soal1;

public class mahasiswa {
    String Nama;
    String Nim;
    
    public mahasiswa(String Nama,String Nim){
        this.Nama=Nama;
        this.Nim=Nim;
    }
    
    public void infomahasiswa(){
        System.out.println("Nama: " + Nama);
        System.out.println("Nim: " + Nim);
    }
}
class mahasiswareguler extends mahasiswa {
    String kelas;
    
    public mahasiswareguler(String Nama,String Nim,String kelas){
        super(Nama,Nim);
        this.kelas=kelas;
    }
    
    public void inforeguler(){
        System.out.println("----data reguler----");
        super.infomahasiswa();
        System.out.println("kelas: " + kelas);
        System.out.println();
    }
}
class mahasiswabeasiswa extends mahasiswa {
    String jenisbeasiswa;
    
    public mahasiswabeasiswa(String Nama,String Nim,String jenisbeasiswa){
        super(Nama,Nim);
        this.jenisbeasiswa=jenisbeasiswa;
    }
    
    public void infobeasiswa(){
        System.out.println("----data beasiswa----");
        super.infomahasiswa();
        System.out.println("jenis beasiswa: " + jenisbeasiswa);
        System.out.println();
    }
}