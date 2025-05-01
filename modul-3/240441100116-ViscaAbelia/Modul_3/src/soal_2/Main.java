package soal_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       Perpustakaan perpus = new Perpustakaan();
       boolean kondisi = true;
       while(kondisi){
           System.out.println("=== Perpustakan ===");
           System.out.println("1. Tambah Buku Fiksi");
           System.out.println("2. Tambah Buku Non Fiksi");
           System.out.println("3. Tampilkan Semua Koleksi");
           System.out.println("4. Keluar");
           System.out.println("");
           
           System.out.print("Pilih opsi :");
           int opsi = input.nextInt();
           input.nextLine();
           if (opsi == 1){
               boolean running = true;
               while (running){
                   System.out.print("Masukkan judul buku : ");
                   String judul = input.nextLine();
                   System.out.print("Masukkan penulis buku : ");
                   String penulis = input.nextLine();
                   System.out.print("Masukkan genre buku : ");
                   String genre = input.nextLine();
                   BukuFiksi bf1 = new BukuFiksi(judul, penulis, genre );
                   perpus.tambahBukuFiksi(bf1);
                   
                   System.out.print("Tambah Lagi? (ya/tidak) ");
                   String lagi = input.nextLine();
                   if (lagi.equalsIgnoreCase("tidak")){
                       running = false;
                       break;
                   }
               }
           } else if(opsi == 2){
               boolean running = true;
               while (running){
                   System.out.print("Masukkan judul buku : ");
                   String judul = input.nextLine();
                   System.out.print("Masukkan penulis buku : ");
                   String penulis = input.nextLine();
                   System.out.print("Masukkan topik buku : ");
                   String topik = input.nextLine();
                   BukuNonFiksi bnf1 = new BukuNonFiksi(judul, penulis, topik );
                   perpus.tambahBukuNonFiksi(bnf1);
                   
                   System.out.print("Tambah Lagi? ");
                   String lagi = input.nextLine();
                   if (lagi.equalsIgnoreCase("tidak")){
                       running = false;
                       break;
                   }
               }
           }else if (opsi == 3){
               perpus.tampilkanKoleksi();
           }
           else if (opsi == 4){
               kondisi= false;
               System.out.println("Keluar dari program.");
               break;
           }
           else {
               System.out.println("opsi tidak valid");
           }
          
       }
       input.close();
    }
    
}
