package soal1;

public class CreditCardPayment implements Payment {
    public double biayaAdmin(){
        return 2000;
    }
    @Override
    public double  hitungTotal(double jumlahAwal) {
        return jumlahAwal + biayaAdmin();
    }
}
