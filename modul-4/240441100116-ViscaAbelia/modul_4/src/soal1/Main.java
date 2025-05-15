package soal1;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner input = new Scanner(System.in);
        boolean kondisi = true;
        while (kondisi){
            System.out.println("---( Bank )---");
            System.out.println("1. Tambah No Rekening");
            System.out.println("2. Setor Saldo");
            System.out.println("3. Tarik Saldo");
            System.out.println("4. Tampilkan Daftar Rekening");
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
                System.out.println("---( Tambah Rekening )---");
                boolean running = true;
                    while (running) {
                        RekeningBank rekening = new RekeningBank();

                        System.out.print("Masukkan No Rekening : ");
                        rekening.setNoRek(input.nextLine());

                        System.out.print("Masukkan Nama : ");
                        rekening.setNama(input.nextLine());

                        System.out.print("Masukkan saldo : ");
                        rekening.setSaldo(input.nextDouble());
                        input.nextLine();

                        bank.tambahRekening(rekening);
                        System.out.println("Rekening " + rekening.getNoRek() + " berhasil ditambahkan.");
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
                    System.out.println("---( Setor )---");
                    System.out.print("Masukkan No Rekening : ");
                    String noreksetor = input.nextLine();
                    
                    System.out.print("Masukkan jumlah setor: ");
                    double jumlahsetor = input.nextDouble();
                    input.nextLine();
                    
                    bank.setor(noreksetor, jumlahsetor);
                    break;
                case 3:
                    System.out.println("---( Tarik )---");
                    System.out.print("Masukkan No Rekening : ");
                    String norektarik = input.nextLine();
                    
                    System.out.print("Masukkan jumlah tarik: ");
                    double jumlahtarik = input.nextDouble();
                    input.nextLine();
                    
                    bank.tarik(norektarik, jumlahtarik);
                    break;
                case 4:
                    System.out.println("---( Daftar Nasabah )---");
                    bank.tampilkanData();
                    break;
                case 5:
                    kondisi = false;
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
                    break;
            }
        }
        input.close();
    }       
}
