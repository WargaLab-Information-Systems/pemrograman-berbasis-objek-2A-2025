package soal1;

public class CashPayment implements Payment{
    public double diskon(double jumlahAwal){
        double diskon = jumlahAwal * 0.05;
        return diskon;
        
    }
    @Override
    public double hitungTotal(double jumlahAwal) {
        double diskon = diskon(jumlahAwal);
        return jumlahAwal - diskon;
    }
}
