package soal1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;
    private static final Scanner scanner = new Scanner(System.in);
    public List<String> daftarmatkul = new ArrayList<>();
    public List<String> daftarkode = new ArrayList<>();
    public List daftarsks = new ArrayList<>();
    public static int totalMahasiswa = 0;


    public void MataKuliah(String kode, String nama, int sks) {
        if (!validasiSKS(sks)) {
            throw new IllegalArgumentException("SKS tidak valid");
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }
    
    public void inputdatamk(Scanner input){
        for (int i = 0; i < 8; i++) {
        System.out.println("masukkan kode matakuliah");
        System.out.print("masukkan kode ; ");
        String kode1 = input.nextLine();
            this.daftarkode.add(kode1);
        System.out.print("masukkan nama matakuliah  ; ");
        String nama1 = input.nextLine();
            this.daftarmatkul.add(nama1);
        while (true) {
            System.out.print("masukkan 2/3 sks: ");
            try {
                this.sks = Integer.parseInt(scanner.nextLine());
                if (validasiSKS(this.sks)) {
                    break; 
                } else {
                    System.out.println("sks harus 2/3 .");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
            }
        }
        }
        
        
    }
    
    public void tampilkandata() {
        for (String matkul : daftarmatkul) {
        System.out.println("matakuliah : " + matkul);
        }
    
      
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public static boolean validasiSKS(int sks) {
        return sks == 2 || sks == 3;
    }
}