package Soal3;
public class Main {
    public static void main(String[] args) {
        Klinik klinik = new Klinik(5);

        Pasien p1 = new Pasien("Siti", -30, "Demam");
        Pasien p2 = new Pasien("Rahmat", 25, "Sakit Kepala");
        Pasien p3 = new Pasien("Lina", 40, "Pusing");

        klinik.tambahPasien(p1);
        klinik.tambahPasien(p2);
        klinik.tambahPasien(p3);

        System.out.println("== Daftar Pasien di Klinik ==");
        klinik.tampilkanSemuaPasien();
    }
}
