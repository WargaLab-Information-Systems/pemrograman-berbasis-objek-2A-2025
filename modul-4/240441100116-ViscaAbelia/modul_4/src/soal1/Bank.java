package soal1;
import java.util.ArrayList;
public class Bank {
    ArrayList<RekeningBank> daftarRekening;
    
    public Bank(){
        daftarRekening = new ArrayList<>();
    }
    
    public void tambahRekening(RekeningBank nasabah){
        daftarRekening.add(nasabah);
    }
    public RekeningBank cariRek(String noRek){
        for (RekeningBank rekening : daftarRekening){
            if (rekening.getNoRek().equals(noRek)){
                return rekening;
            }
        }
        return null;
    }
    public void setor(String noRek, double jumlah){
        RekeningBank rekening = cariRek(noRek);
        if (rekening != null){
            boolean berhasil = rekening.tambahSaldo(jumlah);
            if (berhasil){
                System.out.println("Setor saldo ke rekening " + noRek + " berhasil.");
                System.out.println("");
            }else{
                System.out.println("Jumlah tidak valid");
                System.out.println("");
            }
        }else{
            System.out.println("Rekening dengan nomor "+ noRek + " tidak ditemukan");
            System.out.println("");
        }
    }
    public void tarik(String noRek, double jumlah){
        RekeningBank rekening = cariRek(noRek);
        if (rekening != null){
            boolean berhasil = rekening.tarikSaldo(jumlah);
            if (berhasil){
                System.out.println("Tarik saldo dari rekening " + noRek + " berhasil.");
                System.out.println("");
            }else{
                System.out.println("Saldo Anda tidak mencukupi untuk melakukan penarikan.");
                System.out.println("");
            }
        }else{
            System.out.println("Rekening dengan nomor "+ noRek + " tidak ditemukan");
            System.out.println("");
        }
    }
    public void tampilkanData(){
        for (RekeningBank rekening : daftarRekening){
            System.out.println("No Rekening : " + rekening.getNoRek());
            System.out.println("Nama : " + rekening.getNama());
            System.out.println("Saldo : " + rekening.getSaldo());
            System.out.println("");
        }
    }
    }
