package soal2;

public class Sepeda implements Booking {
    private String nama;
    private int usia;
    @Override
    public double hitungBiaya(int hariSewa) {
        double biaya = 200000 * hariSewa;
        return biaya;
    }

    @Override
    public boolean prosesBooking(String nama, int usia) {        
        if (usia > 16){
            this.nama = nama;
            this.usia = usia;
            System.out.println("Booking berhasil.");
            return true;
        }else{
            System.out.println("Usia tidak mencukupi untuk melakukan booking.");
            return false;
        }
    }
    
}
