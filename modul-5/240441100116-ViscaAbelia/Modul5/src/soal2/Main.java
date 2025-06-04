package soal2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mobil msp1 = new MobilSport();
        Mobil ms1 = new MobilSedan();

        
        boolean kondisi = true;
        while  (kondisi) {
            System.out.println("---( Daftar Mobil )---");
            System.out.println("1. Nyalakan Mobil Sport");
            System.out.println("2. Nyalakan Mobil Sedan");
            System.out.println("3. Matikan Mobil Sport");
            System.out.println("4. Matikan Mobil Sedan");
            System.out.println("5. Keluar");
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
                    System.out.println("---( Nyalakan Mobil Sport )---");
                    msp1.nyalakan_mesin();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("---( Nyalakan Mobil Sedan )---");
                    ms1.nyalakan_mesin();
                    System.out.println("");
                    break;                
                case 3:
                    System.out.println("---( Matikan Mobil Sport )---");
                    msp1.matikan_mesin();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("---( Matikan Mobil Sedan )---");
                    ms1.matikan_mesin();
                    System.out.println("");
                    break;
                case 5:
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
