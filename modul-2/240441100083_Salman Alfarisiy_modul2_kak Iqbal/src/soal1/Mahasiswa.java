
package soal1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mahasiswa {
    public String nama;
    public String nim;
    public String prodi;
    private static final Scanner scanner = new Scanner(System.in);
    public List<String> daftarmatkul = new ArrayList<>();
    public static int totalMahasiswa = 0;

    
    public void  Mahasiswa(String nama, String nim, String prodi) {
        if (!validasiNIM(nim)) {
            throw new IllegalArgumentException("NIM tidak valid");
        }
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        totalMahasiswa++;
        
    }

    
    public void inputdata(Scanner input){
   
        System.out.print("masukkan nama ; ");
        this.nama = scanner.nextLine();
        while (true) {
        System.out.print("masukkan nim: ");
        String nimInput = scanner.nextLine();
        if (validasiNIM(nimInput)) {
            this.nim = nimInput;
            break; 
        } else {
            System.out.println("nim salah harus berawalan 23 dan 10 angka.");
        }
    }

        System.out.print("masukkan prodi ; ");
        this.prodi = scanner.nextLine();
         System.out.println("masukkan tambah daftar matkul:");
        int count = 0;
        while (count < 4) {
        System.out.print("Mata Kuliah ke-" + (count + 1) + ": ");
        String m = input.nextLine();
        if (!m.trim().isEmpty()) {
            this.daftarmatkul.add(m);
            count++;
            } else {
            System.out.println(" Mata kuliah tidak boleh kosong.");
            }
        } 
        
        
        totalMahasiswa++;
    }
    public static boolean validasiNIM(String nim) {
        return nim != null && nim.startsWith("23") && nim.length() == 10 && nim.matches("\\d+");
    }

    
    public void tambahMatkul(Scanner input) {
        System.out.println("\ndaftar mata kuliah terkini:");
    for (String matkul : daftarmatkul) {
        System.out.println("- " + matkul);
    }
        System.out.print("masukkan mata kuliah baru? ya/tidak: ");
        String jawaban = input.nextLine();
        if (jawaban.equals("ya")){
            System.out.print("masukkan mata kuliah baru : ");
            String matkulbaru = input.nextLine();
            this.daftarmatkul.add(matkulbaru);
            System.out.println("matakuliah --" + matkulbaru+ "--berhasil di tambahkan");
        }
        else System.out.println("tidak ada matkul ditambahkan");
    }
    public void tampilkandata() {
        System.out.println("\nBiodata Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Daftar Mata Kuliah: ");
        for (String m : daftarmatkul) 
            System.out.println("- " + m);

      
    }
    public void jumlahTotalMahasiswa() {
        System.out.println("\nTotal Mahasiswa yang telah dibuat: " + totalMahasiswa);
    }


    public String getNama() {
        return nama;
    }
    public String getnim() {
        return nim;
    }
    public String getprodi() {
        return prodi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    
}