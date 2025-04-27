package packages;

public class Kampus{
    private String nama;
    private String alamat;
    private static int totalMahasiswa = 0;

    public Kampus(String nama, String alamat){
        if (!validasiNamaKampus(nama)){
            throw new IllegalArgumentException("Nama kampus tidak valid (hanya huruf dan spasi).");
        }
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public static void TotalMahasiswa(int jumlah){
        totalMahasiswa = jumlah;
    }
    
    public void tampilkanInfoKampus(){
        System.out.println("\n==== INFO KAMPUS ====");
        System.out.println("Nama Kampus : "+ nama);
        System.out.println("Alamat      : "+ alamat);
        System.out.println("Total MHS   : "+ totalMahasiswa);
    }
    
    public static boolean validasiNamaKampus(String nama){
        return nama.matches("[a-zA-Z\\s]+");
    }
}