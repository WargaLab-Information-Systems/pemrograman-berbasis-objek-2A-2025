import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private ArrayList<MataKuliah> mataKuliahDiambil;
    private static int totalMahasiswa = 0;

    public Mahasiswa(String nama, String nim, String prodi) {
        if (!isValidNIM(nim)) {
            throw new IllegalArgumentException("NIM tidak valid: " + nim);
        }
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.mataKuliahDiambil = new ArrayList<>();
        totalMahasiswa++;
    }

    public void tambahMataKuliah(MataKuliah mk) {
        mataKuliahDiambil.add(mk);
    }

    public void tampilkanBiodata() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Mata Kuliah:");
        for (MataKuliah mk : mataKuliahDiambil) {
            System.out.println(" - " + mk.getInfo());
        }
        System.out.println();
    }

    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }

    public static boolean isValidNIM(String nim) {
        return nim.startsWith("23") && nim.length() == 10;
    }
}