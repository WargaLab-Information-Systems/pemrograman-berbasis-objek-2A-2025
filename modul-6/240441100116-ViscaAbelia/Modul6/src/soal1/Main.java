package soal1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Joko j1 = new Joko();
        Beni b1 = new Beni();
        Fani f1 = new Fani();
        Jani jn1 = new Jani();
        
        boolean kondisi = true;
        while  (kondisi) {
            System.out.println("---( Daftar Manusia )---");
            System.out.println("1. Joko");
            System.out.println("2. Beni");
            System.out.println("3. Fani");
            System.out.println("4. Jani");
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
                    System.out.println("---( Joko )---");
                    j1.berbicara();
                    j1.bekerja();
                    j1.makan();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("---( Beni <3 )---");
                    b1.berbicara();
                    b1.bekerja();
                    b1.makan();
                    System.out.println("");
                    break;                
                case 3:
                    System.out.println("---( Fani )---");
                    f1.berbicara();
                    f1.bekerja();
                    f1.makan();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("---( Jani )---");
                    jn1.berbicara();
                    jn1.bekerja();
                    jn1.makan();
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
