
package no1;

public class RekeningBank {
    private String norek;
    private String nama;
    private double saldo;
    
    public RekeningBank(String norek, String nama, double saldo){
        this.norek = norek;
        this.nama = nama;
        this.saldo = saldo;
    }
    public String getnorek(){
        return norek;
    }
    public String getnama(){
        return nama;
    }
    public double getsaldo(){
       return saldo;
    }
    public void setnama(String nama){
        this.nama= nama;
    }
    public void setor(double jumlah){
        saldo += jumlah;
    }
    public void tarik(double jumlah){
        if(jumlah <= saldo){
            saldo -= jumlah;
        }else {
            System.out.println("Saldo anda tidak cukup untuk penarikan");
        }
    }
    public void tampilkaninfo(){
        System.out.println("No.Rekening: " + norek +", Nama: " + nama + ", Saldo: " + saldo);
    }
}
