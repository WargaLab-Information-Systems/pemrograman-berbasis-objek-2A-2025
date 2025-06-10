package soal2;

public class Motor implements Booking, Asuransi{
    private String nama;
    private int usia;
    @Override
    public double hitungBiaya(int hariSewa) {
        double biaya = 300000 * hariSewa;
        double asuransi = hitungAsuransi();
        return biaya + asuransi;
    }

    @Override
    public boolean prosesBooking(String nama, int usia) {        
        if (usia > 17){
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
        return 30000;
    }
    
}
