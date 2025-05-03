public class Main {
    public static void main(String[] args) {
        try {
            // Membuat objek Kampus
            Kampus kampus = new Kampus("Universitas Brawijaya", "Jl. Veteran, Malang");
            
            // Membuat objek MataKuliah
            MataKuliah mk1 = new MataKuliah("MK001", "Pemrograman Berorientasi Objek", 3);
            MataKuliah mk2 = new MataKuliah("MK002", "Pengantar Basis Data", 3);
            MataKuliah mk3 = new MataKuliah("MK003", "Algoritma dan Struktur Data", 3);
            MataKuliah mk4 = new MataKuliah("MK004", "Jaringan Komputer", 3);
            MataKuliah mk5 = new MataKuliah("MK005", "Sistem Operasi", 2);
            MataKuliah mk6 = new MataKuliah("MK006", "Interaksi Manusia dan Komputer", 2);
            MataKuliah mk7 = new MataKuliah("MK007", "Statistik", 3);
            MataKuliah mk8 = new MataKuliah("MK008", "Pemrograman Berbsis Web", 3);
            
            // Membuat objek Mahasiswa
            Mahasiswa mhs1 = new Mahasiswa("Airiz Surya Dhani", "2301234567", "Teknik Informatika");
            Mahasiswa mhs2 = new Mahasiswa("Marscella aulia", "2301234568", "Teknik Informatika");
            Mahasiswa mhs3 = new Mahasiswa("Fika Vidya", "2301234569", "Sistem Informasi");
            Mahasiswa mhs4 = new Mahasiswa("Kinanti dwi", "2301234570", "Sistem Informasi");
            Mahasiswa mhs5 = new Mahasiswa("Ferdiansyah kusuma", "2301234571", "Teknik Komputer");
            Mahasiswa mhs6 = new Mahasiswa("Aulia Putri", "2301234572", "Teknik Komputer");
            
            // Update total mahasiswa di Kampus
            kampus.setTotalMahasiswa(6);
            
            // Menambahkan mata kuliah untuk setiap mahasiswa
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
            
            // Mahasiswa 4
            mhs4.tambahMataKuliah(mk1);
            mhs4.tambahMataKuliah(mk2);
            mhs4.tambahMataKuliah(mk7);
            mhs4.tambahMataKuliah(mk8);
            
            // Mahasiswa 5
            mhs5.tambahMataKuliah(mk3);
            mhs5.tambahMataKuliah(mk4);
            mhs5.tambahMataKuliah(mk5);
            mhs5.tambahMataKuliah(mk6);
            
            // Mahasiswa 6
            mhs6.tambahMataKuliah(mk2);
            mhs6.tambahMataKuliah(mk4);
            mhs6.tambahMataKuliah(mk6);
            mhs6.tambahMataKuliah(mk8);
            
            // Menampilkan informasi kampus
            Kampus.tampilkanInfoKampus(kampus);
            System.out.println();
            
            // Menampilkan jumlah mahasiswa
            Mahasiswa.tampilkanJumlahMahasiswa();
            System.out.println();
            
            // Menampilkan biodata mahasiswa
            mhs1.tampilkanBiodata();
            mhs2.tampilkanBiodata();
            mhs3.tampilkanBiodata();
            mhs4.tampilkanBiodata();
            mhs5.tampilkanBiodata();
            mhs6.tampilkanBiodata();
            
            // Test validasi
            System.out.println("\n===== UJI VALIDASI =====");
            System.out.println("Validasi NIM '2301234567': " + Mahasiswa.isNimValid("2301234567"));
            System.out.println("Validasi NIM '1234567890': " + Mahasiswa.isNimValid("1234567890"));
            System.out.println("Validasi SKS 2: " + MataKuliah.isSksValid(2));
            System.out.println("Validasi SKS 4: " + MataKuliah.isSksValid(4));
            System.out.println("Validasi Nama Kampus 'Universitas Brawijaya': " + Kampus.isNamaKampusValid("Universitas Brawijaya"));
            System.out.println("Validasi Nama Kampus 'Universitas 45': " + Kampus.isNamaKampusValid("Universitas 45"));
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}