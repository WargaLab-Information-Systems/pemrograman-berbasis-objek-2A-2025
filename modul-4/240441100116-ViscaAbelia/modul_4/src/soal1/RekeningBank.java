package soal1;

public class RekeningBank {
    private String noRek;
    private String nama;
    private double saldo;
    
    public void setNoRek(String noRek){
        this.noRek = noRek;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setSaldo(double saldo){
        if (saldo > 0){
            this.saldo = saldo;
        }else{
            System.out.println("Saldo tidak valid.");
            this.saldo = 0;
        }
    }
    
    public String getNoRek(){
        return noRek;
    }
    public String getNama(){
        return nama;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public boolean tambahSaldo(double jumlah){
        if (jumlah > 0){
            this.saldo += jumlah;
            return true;
        }else{
            return false;
        }
    }
    public boolean tarikSaldo(double jumlah){
        if (this.saldo >= jumlah){
            this.saldo -= jumlah;
            return true;
        }else{
            return false;
        }
    }
}
