
package soal.pkg1.pbo;

public class Main {

    public static void main(String[] args) {
        String[] mk1 = {
            "IF01 - Pemrograman Java (3 sks)",
            "IF02 - Struktur Data (2 sks)",
            "IF03 - Basis Data(3 sks)",
            "IF04 - Jaringan Komputer(2 sks)",
        };
        
        String[] mk2 = {
            "IF01 - Pemrograman Java (3 sks)",
            "IF02 - Struktur Data (2 sks)",
            "IF03 - Basis Data(3 sks)",
            "IF04 - Jaringan Komputer(2 sks)",
        };
        
        String[] mk3 = {
            "IF01 - Pemrograman Java (3 sks)",
            "IF02 - Struktur Data (2 sks)",
            "IF03 - Basis Data(3 sks)",
            "IF04 - Jaringan Komputer(2 sks)",
        };
        
        String[] mk4= {
            "IF01 - Pemrograman Java(3 sks)",
            "IF02 - Struktur Data (2 sks)",
            "IF03 - Basis Data(3 sks)",
            "IF04 - Jaringan Komputer(2 sks)",
        };
        
        String[] mk5= {
            "IF01 - Pemrograman Java(3 sks)",
            "IF02 - Struktur Data (2 sks)",
            "IF03 - Basis Data (3 sks)",
            "IF04 - Jaringan Komputer(2 sks)",
        };
        
        String[] mk6= {
            "IF01 - Pemrograman Java(3 sks)",
            "IF02 - Struktur Data (2 sks)",
            "IF03 - Basis Data (3 sks)",
            "IF04 - Jaringan Komputer (2 sks)",
        };
        
        Mahasiswa m1 = new Mahasiswa (" siska", " 231234501", " sistem informasi",mk1);
        Mahasiswa m2 = new Mahasiswa (" Diah", " 231234502", " sistem informasi",mk2);
        Mahasiswa m3 = new Mahasiswa (" Azka", " 231234503", " sistem informasi",mk3);
        Mahasiswa m4 = new Mahasiswa (" Doni", " 231234504"," sistem informasi",mk4);
        Mahasiswa m5 = new Mahasiswa (" Mely", " 231234505"," sistem informasi",mk5);
        Mahasiswa m6 = new Mahasiswa (" Zaky", " 231234506"," sistem informasi",mk6);
        
        m1.tampilkanData();
        m2.tampilkanData();
        m3.tampilkanData();
        m4.tampilkanData();
        m5.tampilkanData();
        m6.tampilkanData();
    }
}
