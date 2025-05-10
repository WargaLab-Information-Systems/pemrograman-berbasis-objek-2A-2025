package tugas2praktikum2;

public class MataKuliah {
    String kode;
    String nama;
    int jumlahSKS;
    
    
    MataKuliah(String kode, String nama, int jumlahSKS){
        if (validasiSKS(jumlahSKS)){
            this.kode = kode;
            this.nama = nama;
            this.jumlahSKS = jumlahSKS;
        } else {
            System.out.println("SKS tidak valid");
        }
    }
    
    public static boolean validasiSKS(int jumlahSKS){
        return jumlahSKS == 2 || jumlahSKS == 3;
    }
    
    void tampilkanDataMk(){
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("Jumlah SKS : " + jumlahSKS);
    }
}
