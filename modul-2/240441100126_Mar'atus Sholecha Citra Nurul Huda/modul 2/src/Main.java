// Class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek MataKuliah
        MataKuliah mk1 = new MataKuliah("PBO001", "Pemrograman Berbasis Objek", 3);
        MataKuliah mk2 = new MataKuliah("ALG002", "Algoritma dan Struktur Data", 3);
        MataKuliah mk3 = new MataKuliah("WEB003", "Pemrograman Web", 3);
        MataKuliah mk4 = new MataKuliah("DB004", "Basis Data", 3);
        MataKuliah mk5 = new MataKuliah("JAR005", "Jaringan Komputer", 2);
        MataKuliah mk6 = new MataKuliah("MOB006", "Pemrograman Mobile", 3);
        MataKuliah mk7 = new MataKuliah("SIS007", "Sistem Operasi", 2);
        MataKuliah mk8 = new MataKuliah("ML008", "Machine Learning", 3);
        
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Budi Santoso", "2312345678", "Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Ani Wulandari", "2323456789", "Sistem Informasi");
        Mahasiswa mhs3 = new Mahasiswa("Deni Kurniawan", "2334567890", "Teknik Komputer");
        Mahasiswa mhs4 = new Mahasiswa("Eka Putri", "2345678901", "Teknik Informatika"); // NIM tidak valid
        Mahasiswa mhs5 = new Mahasiswa("Fandi Ahmad", "2356789012", "Sistem Informasi");
        Mahasiswa mhs6 = new Mahasiswa("Gita Nirmala", "2367890123", "Teknik Informatika");
        
        // Menambahkan mata kuliah ke mahasiswa
        // Mahasiswa 1
        mhs1.tambahMataKuliah(mk1);
        mhs1.tambahMataKuliah(mk2);
        mhs1.tambahMataKuliah(mk3);
        mhs1.tambahMataKuliah(mk4);
        
        // Mahasiswa 2
        mhs2.tambahMataKuliah(mk1);
        mhs2.tambahMataKuliah(mk3);
        mhs2.tambahMataKuliah(mk5);
        mhs2.tambahMataKuliah(mk7);
        
        // Mahasiswa 3
        mhs3.tambahMataKuliah(mk2);
        mhs3.tambahMataKuliah(mk4);
        mhs3.tambahMataKuliah(mk6);
        mhs3.tambahMataKuliah(mk8);
        
        // Mahasiswa 3
        mhs4.tambahMataKuliah(mk2);
        mhs4.tambahMataKuliah(mk4);
        mhs4.tambahMataKuliah(mk6);
        mhs4.tambahMataKuliah(mk8);
        
        // Mahasiswa 5
        mhs5.tambahMataKuliah(mk1);
        mhs5.tambahMataKuliah(mk2);
        mhs5.tambahMataKuliah(mk5);
        mhs5.tambahMataKuliah(mk6);
        
        // Mahasiswa 6
        mhs6.tambahMataKuliah(mk3);
        mhs6.tambahMataKuliah(mk4);
        mhs6.tambahMataKuliah(mk7);
        mhs6.tambahMataKuliah(mk8);
        
        // Membuat objek Kampus
        Kampus kampus = new Kampus("Universitas Java", "Jalan Pemrograman No. 123");
        
        // Menambahkan jumlah mahasiswa ke kampus (asumsi hanya mahasiswa yang valid)
        Kampus.tambahMahasiswa(5); // mhs4 tidak valid karena NIM tidak sesuai
        
        // Menampilkan informasi mahasiswa
        mhs1.tampilkanBiodata();
        mhs2.tampilkanBiodata();
        mhs3.tampilkanBiodata();
        mhs5.tampilkanBiodata();
        mhs6.tampilkanBiodata();
        
        // Menampilkan jumlah total mahasiswa
        Mahasiswa.tampilkanJumlahMahasiswa();
        
        // Menampilkan informasi kampus
        kampus.tampilkanInfoKampus();
        // Coba buat kampus dengan nama tidak valid

    }
}