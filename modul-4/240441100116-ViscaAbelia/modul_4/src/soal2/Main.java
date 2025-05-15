package soal2;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Perpustakaan perpustakaan = new Perpustakaan ();
            
            boolean kondisi = true;
            while(kondisi){
                System.out.println("---( Perpustakaan )---");
                System.out.println("1. Tambah Buku");
                System.out.println("2. Tampilkan Buku");
                System.out.println("3.Keluar");
                System.out.println("");

                int opsi = 0;
                try{
                    System.out.print("Pilih Opsi : ");
                    opsi = input.nextInt();
                    input.nextLine();
                    System.out.println("");
                }catch (InputMismatchException e){
                    System.out.println("Input harus berupa angka!");
                    input.nextLine();
                    System.out.println("");
                    continue;
                }
                
                switch (opsi){
                    case 1:
                        System.out.println("---( Tambah Buku )---");
                        boolean running = true;
                        while(running){
                            Buku b = new Buku();

                            System.out.print("Masukkan Judul : ");
                            b.setJudul(input.nextLine());
                            
                            System.out.print("Masukkan Penulis : ");
                            b.setPenulis(input.nextLine());
                            
                            System.out.print("Masukkan Jumlah Halaman : ");
                            b.setJumlahHalaman(input.nextInt());
                            input.nextLine();
                            
                            perpustakaan.tambahBuku(b);
                            System.out.println("");
                            
                            System.out.print("Tambah lagi? (y/n)");
                            String ulang = input.nextLine();
                            System.out.println("");
                            if (ulang.equalsIgnoreCase("n")){
                                running = false;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("---( Daftar Buku )---");
                        perpustakaan.tampilkanBuku();
                        break;
                    case 3:
                        kondisi = false;
                        System.out.println("Program Selesai.");
                        break;
                    default:
                        System.out.println("opsi tidak valid");
                }
            }
            input.close();

            
    }

}
