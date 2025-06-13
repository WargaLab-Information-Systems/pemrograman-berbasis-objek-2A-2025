package Soal2;
public abstract class Kendaraan {
    private String nama;
    private double tarifPerHari;

    public Kendaraan(String nama, double tarifPerHari) {
        this.nama = nama;
        this.tarifPerHari = tarifPerHari;
    }

    public String getNama() {
        return nama;
    }

    public double getTarifPerHari() {
        return tarifPerHari;
    }

    public abstract void tampilkanInfo();
}

