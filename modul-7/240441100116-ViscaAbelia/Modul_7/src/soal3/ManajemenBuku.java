package soal3;
import java.util.ArrayList;

public class ManajemenBuku {
    ArrayList<String> daftarPeminjaman;
    ArrayList<String> daftarReservasi;
    
    ManajemenBuku(){
        daftarPeminjaman = new ArrayList<>();
        daftarReservasi = new ArrayList<>();
    }
    
    public void tambahPeminjaman(String nama, String judul){
        String data = nama + " meminjam " + judul;
        daftarPeminjaman.add(data);
        System.out.println("Data peminjaman ditambahkan.");
    }
    public void tambahReservasi(String nama, String judul){
        String data = nama + " meminjam " + judul;
        daftarReservasi.add(data);
        System.out.println("Data reservasi ditambahkan.");
    }
    public void tampilkanDaftarPeminjaman(){
        for (String dp : daftarPeminjaman){
            System.out.println(dp);
        }
    }
    public void tampilkanDaftarReservasi(){
        for (String dp : daftarReservasi){
            System.out.println(dp);
        }
    }
    
}
