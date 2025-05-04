package tugasModul2;
public class Kampus {
    private String nama;
    private boolean valid;

    public Kampus(String nama) {
        // Validasi: Nama kampus tidak boleh mengandung angka
        if (nama.matches(".*\\d+.*")) {
            throw new IllegalArgumentException("Nama Kampus anda tidak valid. Nama Kampus tidak boleh mengandung angka");
        }
        this.nama = nama;
        this.valid = true;
    }
    
    public String getNama() {
        return nama;
    }
    
    public boolean isValid() {
        return valid;
    }
    
    // Metode untuk menampilkan informasi kampus dalam format tabel
    public void tampilkanInfo() {
        System.out.printf("+-----------------------+-------------------+%n");
        System.out.printf("| Nama Kampus           | Status Validasi   |%n");
        System.out.printf("+-----------------------+-------------------+%n");
        System.out.printf("| %-21s | %-17s |%n", nama, (valid ? "Valid" : "Tidak Valid"));
        System.out.printf("+-----------------------+-------------------+%n");
    }
}
