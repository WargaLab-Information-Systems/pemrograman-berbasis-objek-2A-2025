// Main.java
public class Main {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("MK001", "Pemrograman Berbasis Web", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Pengantar Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("MK003", "Desain Manajemen Jaringan", 2);
        MataKuliah mk4 = new MataKuliah("MK004", "Sistem Operasi", 3);
        MataKuliah mk5 = new MataKuliah("MK005", "Jaringan Komputer", 2);
        MataKuliah mk6 = new MataKuliah("MK006", "E-Business & E-Commerce", 3);
        MataKuliah mk7 = new MataKuliah("MK007", "Pemrograman Berbasis Objek", 3);  
        MataKuliah mk8 = new MataKuliah("MK008", "Algoritma Pemrograman", 3);       

        Mahasiswa m1 = new Mahasiswa("Dyah", "2317788943", "Sistem Informasi");
        Mahasiswa m2 = new Mahasiswa("Dea", "2316578654", "Teknik Informatika");
        Mahasiswa m3 = new Mahasiswa("Nana", "2312345680", "Teknik Informasi");
        Mahasiswa m4 = new Mahasiswa("Joko", "2312345689", "Sistem Informasi");
        Mahasiswa m5 = new Mahasiswa("Mustakim", "2312345682", "Teknik Informatika");
        Mahasiswa m6 = new Mahasiswa("Sutarjo", "2312345683", "Teknik Informatika");

        m1.tambahMataKuliah(mk1);
        m1.tambahMataKuliah(mk2);
        m1.tambahMataKuliah(mk3);
        m1.tambahMataKuliah(mk4);

        m2.tambahMataKuliah(mk1);
        m2.tambahMataKuliah(mk3);
        m2.tambahMataKuliah(mk5);
        m2.tambahMataKuliah(mk7); 

        m3.tambahMataKuliah(mk2);
        m3.tambahMataKuliah(mk3);
        m3.tambahMataKuliah(mk8); 
        m3.tambahMataKuliah(mk5);

        m4.tambahMataKuliah(mk1);
        m4.tambahMataKuliah(mk2);
        m4.tambahMataKuliah(mk3);
        m4.tambahMataKuliah(mk6);

        m5.tambahMataKuliah(mk2);
        m5.tambahMataKuliah(mk3);
        m5.tambahMataKuliah(mk4);
        m5.tambahMataKuliah(mk5);

        m6.tambahMataKuliah(mk1);
        m6.tambahMataKuliah(mk4);
        m6.tambahMataKuliah(mk5);
        m6.tambahMataKuliah(mk6);

        Kampus kampus = new Kampus("Universitas Trunojoyo Madura", "Jalan Raya Telang");

        m1.tampilkanBiodata();
        m2.tampilkanBiodata();
        m3.tampilkanBiodata();
        m4.tampilkanBiodata();
        m5.tampilkanBiodata();
        m6.tampilkanBiodata();

        kampus.tampilkanInfoKampus();
    }
}
