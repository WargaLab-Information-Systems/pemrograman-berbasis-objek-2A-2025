package soal3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ManajemenBuku manajemen = new ManajemenBuku();
        
        while(true){
            System.out.println("\n---< Sistem Peminjaman dan Reservasi Buku >---");
            System.out.println("1. Buku Fiksi");
            System.out.println("2. Buku Referensi");
            System.out.println("3. Tampilkan Daftar Pinjam");
            System.out.println("4. Tampilkan Daftar Reservasi");
            System.out.println("5. Keluar");
            System.out.print("\npilih opsi : ");
            
            int pilihan = input.nextInt();
            input.nextLine();
            
            
            if (pilihan == 1){
                while(true){
                System.out.print("\nMasukkan nama : ");
                String nama = input.nextLine();      
                System.out.print("Masukkan judul buku : ");
                String judul = input.nextLine();
                BukuFiksi bf = new BukuFiksi(judul);
                    System.out.println("1. Pinjam");
                    System.out.println("2. Reservasi");
                    System.out.print("pilih aksi : ");

                    int aksi = input.nextInt();
                    input.nextLine();

                    if (aksi == 1){
                        bf.pinjam(nama);
                        manajemen.tambahPeminjaman(nama, judul);
                    }else if(aksi == 2){
                        bf.reservasi(nama);
                        manajemen.tambahReservasi(nama, judul);
                    }else{
                        System.out.println("opsi tidak valid.");
                    }
                    System.out.print("\nPinjam/Reservasi lagi? (y/n) ");
                    String jawab = input.nextLine();
                    if (jawab.equalsIgnoreCase("n")){
                        break;
                    }
                }
                
            }else if (pilihan == 2){
                while(true){
                System.out.print("\nMasukkan nama : ");
                String nama = input.nextLine();      
                System.out.print("Masukkan judul buku : ");
                String judul = input.nextLine();
                BukuReferensi br = new BukuReferensi(judul);
                
                    System.out.println("\nBuku hanya bisa di reservasi.");
                    br.reservasi(nama);
                    manajemen.tambahReservasi(nama, judul);
                    System.out.print("\nPinjam/Reservasi lagi? (y/n) ");
                    String jawab = input.nextLine();
                    if (jawab.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }else if (pilihan == 3){
                manajemen.tampilkanDaftarPeminjaman();
            }else if(pilihan == 4){
                manajemen.tampilkanDaftarReservasi();
            }
            else if(pilihan == 5){
                System.out.println("Terimakasih! Program selesai.");
                break;
            }else{
                System.out.println("opsi tidak valid.");
            }
        }
        input.close();
    }
}
