package jawabanmodul2;

import java.util.ArrayList;

public class Mahasiswa {
    String Nama;
    String NIM;
    String Prodi;
    ArrayList<String> MataKuliah = new ArrayList<>();
    
    static int jumlahMahasiswa = 0;
    
    // konstruktor Mahasiswa
    //   3  
    public Mahasiswa(String Nama, String NIM, String Prodi, String MataKuliahAwal) {
    //   4 
    if (validasiNIM(NIM)) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.Prodi = Prodi;
        this.MataKuliah = new ArrayList<>();
        this.MataKuliah.add(MataKuliahAwal);
        jumlahMahasiswa++;
    }
    else {
        System.out.println("NIM tidak valid untuk nama: " + Nama);
    }
}

    //  6  
    public void tambahMataKuliah(String mk){
        MataKuliah.add(mk);
    }
    
    //   8
    public void tampilkanData() {
        if (NIM != null) {
            System.out.println("Nama = " + Nama);
            System.out.println("NIM = " + NIM);
            System.out.println("Prodi = " + Prodi);
            System.out.println("Mata Kuliah = ");
            for (String mk : MataKuliah) {
                System.out.println(mk);
            }
            System.out.println();
        }
    }
    
//    method buat nampilin jumlah mahasigma
    // 10   
    public static void tampilkanJumlahMahasiswa() {
        System.out.println("Total Mahasiswa: " + jumlahMahasiswa);
    }

    
    //    method buat validasi
    public static boolean validasiNIM(String nim) {
        return nim.startsWith("23") && nim.length() == 10 && nim.matches("\\d+");
    }
}