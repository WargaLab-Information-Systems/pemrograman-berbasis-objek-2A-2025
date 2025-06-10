package soal2;

public class Mobil implements Booking, Asuransi {
    private String nama;
    private int usia;
    @Override
    public double hitungBiaya(int hariSewa) {
        double biaya = 500000 * hariSewa;
        double asuransi = hitungAsuransi();
        return biaya + asuransi;
    }

    @Override
    public boolean prosesBooking(String nama, int usia) {        
        if (usia > 18){
            this.nama = nama;
            this.usia = usia;
            System.out.println("Booking berhasil.");
            return true;
        }else{
            System.out.println("Usia tidak mencukupi untuk melakukan booking.");
            return false;
        }
    }

    @Override
    public double hitungAsuransi() {
        return 50000;
    }
    
}
