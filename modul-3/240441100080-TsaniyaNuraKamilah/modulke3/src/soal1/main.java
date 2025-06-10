
package soal1;

public class main {

    public static void main(String[] args) {
        mahasiswareguler mhs1 = new mahasiswareguler("desi","12345","SI-1C");
        mahasiswareguler mhs2 = new mahasiswareguler("roni","67890","SI-2D");
        mahasiswareguler mhs3 = new mahasiswareguler("denis","11234","SI-1D");
        
        mahasiswabeasiswa m1 = new mahasiswabeasiswa("aulia","24132","beasiswa prestasi");
        mahasiswabeasiswa m2 = new mahasiswabeasiswa("keysha","24456","beasiswa prestasi");
        
        mhs1.inforeguler();
        mhs2.inforeguler();
        mhs3.inforeguler();
        
        m1.infobeasiswa();
        m2.infobeasiswa();
    }
}