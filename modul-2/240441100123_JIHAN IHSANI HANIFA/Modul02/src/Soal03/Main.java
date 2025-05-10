package Soal03;

public class Main {
    public static void main(String[] args) {
        try {
            Kampus k = new Kampus("Universitas Negeri 123", "Jl. Pahlawan 9", 400); // error
        } catch (IllegalArgumentException e) {
            System.out.println("Validasi Gagal: " + e.getMessage());
        }

        Kampus k2 = new Kampus("Universitas Trunojoyo Madura", "Jl.Telang", 400);
        k2.tampilkanInfo();
        System.out.println("Validasi Nama: " + Kampus.isValidNamaKampus(k2.getNama()));
    }
}