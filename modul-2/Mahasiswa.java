// Mahasiswa.java
import java.util.ArrayList; //untuk memanggil  array list dan list dari java util
import java.util.List;
public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private List<MataKuliah> mataKuliahList; //untuk menampung byk mhsiswa
    private static int jumlahMahasiswa = 0;// ingin menghitung total mahasiswa yang valid secara global, bukan hanya di satu objek.

//konstruktor
    public Mahasiswa(String nama, String nim, String prodi) {
        if (!validNIM(nim)) {
            System.out.println("NIM tidak valid: " + nim);
            this.nama = null;
            this.nim = null;
            this.prodi = null;
        } else {
            this.nama = nama;
            this.nim = nim;
            this.prodi = prodi;
            jumlahMahasiswa++; //couter global nambah 1
        }
        this.mataKuliahList = new ArrayList<>(); //walaupun data invalid, agar tidak error saat akses.
    }

    public void tambahMataKuliah(MataKuliah mk) {
        if (mk != null && mk.isValid()) {
            mataKuliahList.add(mk);
        }
    }

    public void tampilkanBiodata() {
        if (nama == null || nim == null || prodi == null) {
            System.out.println("Data mahasiswa tidak valid");
            return;
        }
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Mata Kuliah:");
        for (MataKuliah mk : mataKuliahList) {
            System.out.println("- " + mk.getInfo());
        }
        System.out.println();
    }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa; //Mengembalikan jumlah mahasiswa valid yang sudah dibuat.
    }

    public static boolean validNIM(String nim) {
        return nim != null && nim.startsWith("23") && nim.length() == 10;
    }
}