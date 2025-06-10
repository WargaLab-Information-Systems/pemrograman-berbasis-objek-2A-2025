package soal1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("\n---< Transaksi >---");
            System.out.print("\nMasukkan total pembayaran : ");
            double jumlahAwal = input.nextDouble();

            System.out.println("Pilih metode pembayaran : ");
            System.out.println("1. Cash");
            System.out.println("2. CreditCard");
            System.out.println("3. E Wallet");
            System.out.print("\nPilih opsi : ");
            int opsi = input.nextInt();
            
            Payment metode;
            if (opsi == 1){
                metode = new CashPayment();
                System.out.println("Selamat Anda mendapatkan diskon 5%.");
            }else if (opsi == 2){
                metode = new CreditCardPayment();
                System.out.println("Anda dikenakan biaya admin sebesar 2000.");                
            }else if (opsi == 3){
                metode = new EWalletPayment();
                System.out.println("Selamat Anda mendapatkan potongan promo sebesar 3000.");                
            }else{
                System.out.println("Opsi tidak valid.");
                continue;
            }
            double totalBayar = metode.hitungTotal(jumlahAwal);
            System.out.println("Total bayar : " + totalBayar);
            input.nextLine();
            
            System.out.print("Lakukan transaksi lagi? (y/n) ");
            String ulang = input.nextLine();
            if (ulang.equalsIgnoreCase("n")){
                System.out.println("Terimakasih telah melakukan transaksi.");
                break;
            }
        }
        input.close();
    }
}
