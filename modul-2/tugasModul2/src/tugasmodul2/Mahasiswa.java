package tugasModul2;
public class Mahasiswa {
    private String nim;
    private String nama;
    private MataKuliah[] mataKuliah; // Array untuk menyimpan mata kuliah yang diambil

    public Mahasiswa(String nim, String nama, MataKuliah[] mataKuliah) {
        // Validasi NIM: harus 10 digit dan 2 digit awal harus "23"
        if (!nim.matches("23\\d{8}")) {
            throw new IllegalArgumentException("2 digit awal anda tidak dimulai dengan angka 23 atau kurang dari 10 digit atau lebih dari 10 digit");
        }
        // Validasi jumlah mata kuliah, harus minimal 4
        if (mataKuliah.length < 4) {
            throw new IllegalArgumentException("Mata Kuliah yang anda ambil kurang dari 4.");
        }
        this.nim = nim;
        this.nama = nama;
        this.mataKuliah = mataKuliah;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNim() {
        return nim;
    }
    
    public MataKuliah[] getMataKuliah() {
        return mataKuliah;
    }
    
    // Menampilkan informasi mahasiswa dan mata kuliah yang diambil dalam bentuk tabel
    public void tampilkanInfo() {
        System.out.printf("+---------------------------------------------------------------+%n");
        System.out.printf("| Mahasiswa: %-40s |%n", nama + " (NIM: " + nim + ")");
        System.out.printf("+----------------+---------------------------+--------+%n");
        System.out.printf("| Kode MK      | Nama Mata Kuliah          | SKS    |%n");
        System.out.printf("+----------------+---------------------------+--------+%n");
        for (MataKuliah mk : mataKuliah) {
            System.out.printf("| %-14s | %-25s | %-6d |%n", mk.getKode(), mk.getNama(), mk.getSks());
        }
        System.out.printf("+----------------+---------------------------+--------+%n\n");
    }
}
