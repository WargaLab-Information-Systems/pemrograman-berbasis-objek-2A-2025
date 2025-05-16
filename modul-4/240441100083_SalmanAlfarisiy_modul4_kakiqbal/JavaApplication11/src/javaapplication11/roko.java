
package javaapplication11;
import java.util.Scanner;
public class roko {
    private String nama;
    private String rekening;
    private double saldo;
    private double tambahsaldo;
    private double tariksaldo;
    
    public roko(Scanner input) {
        rekening(input);
    }
    
    public void rekening(Scanner input){
        System.out.print("masukkan nama anda: ");
        this.nama = input.nextLine();
        System.out.print("masukkan rekening anda: ");
        this.rekening = input.nextLine();
        System.out.print("masukkan saldo anda: ");
        this.saldo = input.nextDouble();
        input.nextLine();
    }
    
    public String getrekening(){
        return rekening;
    }
    
    public String getnama(){
        return nama;
    }
    
    public double getsaldo(){
        return saldo;
    }
    public double gettambahsaldo(){
        return tambahsaldo;
    }
    public double gettariksaldo(){
        return tariksaldo;
    }
    public void tambahsaldo(Scanner input){
        System.out.print("masukkan saldo : ");
        this.tambahsaldo =input.nextDouble();
        if(tambahsaldo > 0){
            saldo = saldo + tambahsaldo;
        }

    }
    public void tariksaldo(Scanner input){
        System.out.print("berapa nominal yang anda ambil : ");
        this.tariksaldo =input.nextDouble();
        if (saldo >= 10 && tariksaldo < saldo){
            saldo = saldo - tariksaldo;
        }else{
            System.out.println("Maaf Saldo Tidak Mencukupi");
        }
    }
    public void tampilkan(){
        System.out.println("nomer rekening: "+ rekening);
        System.out.println("nama pemilik rekening: "+ nama);
        System.out.println("saldo anda: "+  String.format("%.2f", saldo));
        
    }

}

