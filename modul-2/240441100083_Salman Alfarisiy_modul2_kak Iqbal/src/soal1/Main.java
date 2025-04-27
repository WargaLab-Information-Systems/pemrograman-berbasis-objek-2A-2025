
package soal1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       Mahasiswa mhs = new Mahasiswa();
       Mahasiswa mhs1 = new Mahasiswa();
       Mahasiswa mhs2 = new Mahasiswa();
       Mahasiswa mhs3 = new Mahasiswa();
       Mahasiswa mhs4 = new Mahasiswa();
       Mahasiswa mhs5 = new Mahasiswa();
       Mahasiswa mhs6 = new Mahasiswa();
        
       MataKuliah mk = new MataKuliah ();
       
       
       Kampus kampus = new Kampus();
       kampus.inputdatakampus(input);
       
       System.out.println("");
       mk.inputdatamk(input);
//       
       System.out.println("Data matakuliah");
       mk.tampilkandata();
       
       System.out.println("");  
       mhs1.inputdata(input );
       mhs1.tambahMatkul(input);
       
       System.out.println("");
       mhs2.inputdata(input );
       mhs2.tambahMatkul(input);
       
       System.out.println("");
       mhs3.inputdata(input );
       mhs3.tambahMatkul(input);
       
       System.out.println("");
       mhs4.inputdata(input );
       mhs4.tambahMatkul(input);
       
       System.out.println("");
       mhs5.inputdata(input );
       mhs5.tambahMatkul(input);
       
       System.out.println("");
       mhs6.inputdata(input );
       mhs6.tambahMatkul(input);
       
       System.out.println("");
       mhs.jumlahTotalMahasiswa();
       mhs1.tampilkandata();
       mhs2.tampilkandata();
       mhs3.tampilkandata();
       mhs4.tampilkandata();
       mhs5.tampilkandata();
       mhs6.tampilkandata();
       kampus.tampilkanInfoKampus();
    }
}