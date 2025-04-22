package soal3;

public class Main {
    public static void main(String[] args) {
        Kampus kampus1 = new Kampus("Universitas Trunojoyo Madura", "Jl. Telang No. 15");
        Kampus kampus2 = new Kampus("Universitas Paripurna2", "Jl. Kenanga No. 12");

        Kampus.tambahTotalMahasiswa();
        Kampus.tambahTotalMahasiswa();

        kampus1.tampilkanInfoKampus();
        kampus2.tampilkanInfoKampus();
    }
}

