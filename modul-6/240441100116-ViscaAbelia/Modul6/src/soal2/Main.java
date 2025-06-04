package soal2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ManajemenMobil Manajemen = new ManajemenMobil();
        
        boolean kondisi = true;
                while  (kondisi) {
            System.out.println("---( Daftar Mobil )---");
            System.out.println("1. Tambah Mobil Sport");
            System.out.println("2. Tambah Mobil Sedan");
            System.out.println("3. Operasikan Semua Mobil");
            System.out.println("4. Keluar");
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
                case 1 :
                    System.out.println("---( Tambah Mobil Sport )---");
                    Mobil sport = new MobilSport();
                    Manajemen.tambahMobil(sport);
                    System.out.println("Mobil Sport berhasil ditambah.");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("---( Tambah Mobil Sedan )---");
                    Mobil sedan = new MobilSedan();
                    Manajemen.tambahMobil(sedan);  
                    System.out.println("Mobil Sedan berhasil ditambah.");
                    System.out.println("");
                    break;                
                case 3:
                    System.out.println("---( Operasikan Semua Mobil )---");
                    Manajemen.operasikanSemuaMobil();
                    System.out.println("");
                    break;
                case 4:
                    kondisi = false;
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
                    System.out.println("");
                    break;
            }
        }
        input.close();
    }
    
}
