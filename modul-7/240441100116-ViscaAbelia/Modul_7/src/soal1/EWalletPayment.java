package soal1;

public class EWalletPayment implements Payment {
    public double potongan(){
        return 3000;
    }

    @Override
    public double hitungTotal(double jumlahAwal) {
        return jumlahAwal - potongan();
    }
}
