package Soal01;

public class Main {
    public static void main(String[]args) {

        MahasiswaReguler mhsReg1 = new MahasiswaReguler("Alya", "240441100125", "TI-2A");
        MahasiswaReguler mhsReg2 = new MahasiswaReguler("Bima", "240441100342", "TI-2B");
        

        mhsReg1.infoReguler();
        mhsReg2.infoReguler();
        

        MahasiswaBeasiswa mhsBea1 = new MahasiswaBeasiswa("Cici", "240441100254", "Bidikmisi");
        MahasiswaBeasiswa mhsBea2 = new MahasiswaBeasiswa("Dio", "240441100145", "KIP Kuliah");
        

        mhsBea1.infoBeasiswa();
        mhsBea2.infoBeasiswa();
        
    }
}
