package jawabanmodul2;

public class MainMahasiswa {
//  1
    public static void main(String[] args) {
//   2
        Mahasiswa m1 = new Mahasiswa("Dimas", "2304411059", "Sistem Informasi","PBW");
        Mahasiswa m2 = new Mahasiswa("Mahen", "2312345678", "Ilmu komunikasi", "Bahasa inggris");
        Mahasiswa m3 = new Mahasiswa("Mingyu", "2309876543", "Teknik Mesin", "Algoritma");
        Mahasiswa m4 = new Mahasiswa("Eisa", "2398765432", "DKV", "Seni & terampilan");
        Mahasiswa m5 = new Mahasiswa("Iah Sopiah", "2300011223", "Teknik Elektro", "Elektronika");
        Mahasiswa m6 = new Mahasiswa("Anomali", "2111223344", "Manajemen Industri", "Bahasa industri");

        // Tambah mata kuliah
//   5 
        m1.tambahMataKuliah("Pancasila");
        m1.tambahMataKuliah("Kalkulus");
        m1.tambahMataKuliah("Pemrograman");
        m1.tambahMataKuliah("Basis Data");
       

        m2.tambahMataKuliah("Desain Jaringan");
        m2.tambahMataKuliah("Algoritma");
        m2.tambahMataKuliah("Statis");
        m2.tambahMataKuliah("Bahasa Inggris");

        m3.tambahMataKuliah("Jaringan");
        m3.tambahMataKuliah("Pemrograman");
        m3.tambahMataKuliah("Manajemen");
        m3.tambahMataKuliah("Matematika");

        m4.tambahMataKuliah("EBC");
        m4.tambahMataKuliah("BAsis data");
        m4.tambahMataKuliah("Bahasa Inggris");
        m4.tambahMataKuliah("Statistika");

        m5.tambahMataKuliah("Agama Islam");
        m5.tambahMataKuliah("Pemogrman");
        m5.tambahMataKuliah("Web");
        m5.tambahMataKuliah("Akuntansi");

        m6.tambahMataKuliah("Asikin");
        m6.tambahMataKuliah("Bolehlah");
        m6.tambahMataKuliah("Cuma anomali");
        m6.tambahMataKuliah("Desain Pendidikan");
//   7
        System.out.println("======= DATA MAHASIGMA =======");
        m1.tampilkanData();
        m2.tampilkanData();
        m3.tampilkanData();
        m4.tampilkanData();
        m5.tampilkanData();
        m6.tampilkanData();
        
//   9     
        Mahasiswa.tampilkanJumlahMahasiswa();
    }
}
