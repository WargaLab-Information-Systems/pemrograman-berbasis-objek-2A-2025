
package modul3j;
import java.util.Scanner;
import java.util.ArrayList;


class mahasiswa {
    public String nama ;
    public String nim ;
    public String jurusan ;
    public ArrayList<mahasiswa> daftar = new ArrayList<>();
    
    public void mahasiswa (String nama,String nim,String jurusan ){
        this. nama = nama ;
        this. nama = nim ;
        this. nama = jurusan ;
    }
    public mahasiswa (){}
    public void inputdata (Scanner input){
        System.out.print("inpuuttt");
        this.nama = input.nextLine();
        System.out.print("inpuuttt");
        this.nim = input.nextLine();
        System.out.print("inpuuttt");
        this.jurusan = input.nextLine();
        
        mahasiswa mhs = new mahasiswa();
        daftar.add(mhs);
        
    }
    public void tampilkan(){
        System.out.println("ini nama " +nama+"ini nim : "+ nim +"ini jurusan "+ jurusan);
    }
}
public class tampil {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        mahasiswa mhs = new mahasiswa();
        mhs.inputdata(input);
        
            mhs.tampilkan();
        
        
    }
}