package jawabanmodul2;

public class Kampus {
    String nama;
    String alamat;
    int totalMahasiswa;
        
    public Kampus(String nama, String alamat, int jumlahMhs) {
        if (cekNamaKampusValid(nama)) {
          
            this.nama = nama;
            this.alamat = alamat;
            this.totalMahasiswa = jumlahMhs;
            
        } else {
            System.out.println("Nama kampus tidak valid karena mengandung angka: " + nama);
           
        }
        
    }
    
//   method menampilkan nama kampus dan total mahasigma
    public void tampilkanInfo() {
        if (nama != null) {
            System.out.println("Nama kampus dibawah ini valid.");
            System.out.println("Nama Kampus: " + nama);
            System.out.println("Alamat: " + alamat);
            System.out.println("Total Mahasiswa: " + totalMahasiswa);
            System.out.println();
        }
    }
//  method statis untuk mengecek apakah nama kampus valid.
    public static boolean cekNamaKampusValid(String nama) {
        return !nama.matches(".*\\d.*"); // nama tidak boleh mengandung angka
    }
}
