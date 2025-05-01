package soal_1;

public class Main {

    public static void main(String[] args) {
        MahasiswaReguler mhs1 = new MahasiswaReguler("Hoirun Nisa", "24-114", "E");
        MahasiswaReguler mhs2 = new MahasiswaReguler("Indah Fitria", "24-115", "G");
        
        MahasiswaBeasiswa mhs3 = new MahasiswaBeasiswa("Visca Abelia", "24-116","KIPK");
        MahasiswaBeasiswa mhs4 = new MahasiswaBeasiswa("Indah Lestari", "24-117", "KIPK");
        
        System.out.println("=== Daftar Mahasiswa Reguler ===");
        mhs1.infoReguler();
        System.out.println("");
        mhs2.infoReguler();
        
        System.out.println("");
        System.out.println("=== Daftar Mahasiswa Beasiswa ===");
        mhs3.infoBeasiswa();
        System.out.println("");
        mhs4.infoBeasiswa();
    }
    
}
