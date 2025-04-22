package soal1;

public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    MataKuliah[] daftarMataKuliah = new MataKuliah[4];
    int jumlahMatkul = 0;

    public Mahasiswa(String nama, String nim, String prodi) {
        if (nim.length() == 10 && nim.startsWith("23")) {
            this.nama = nama;
            this.nim = nim;
            this.prodi = prodi;
        } else {
            System.out.println("NIM tidak valid!");
        }
    }

    public void tambahMataKuliah(MataKuliah mk) {
        if (jumlahMatkul < 4) { 
            daftarMataKuliah[jumlahMatkul] = mk;
            jumlahMatkul++;
        } else {
            System.out.println("Maksimal 4 mata kuliah saja.");
        }
    }

    public void tampilkanBiodata() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Mata Kuliah yang Diambil:");
        for (int i = 0; i < jumlahMatkul; i++) {
            daftarMataKuliah[i].tampilkanInfo();
        }
        System.out.println();
    }
}
