
package soalno2;

import java.util.ArrayList;

public class perpustakaan {
    private ArrayList<buku> daftarBuku = new ArrayList<>();
    
    
    public void tambahDaftarBuku(buku bukuBaru){
        daftarBuku.add(bukuBaru);
    }
    
    public void DaftarBuku(){
        for(buku buku : daftarBuku){
            System.out.println("\nDAFTAR BUKU");
            buku.tampilkan();
        }
    }
}

