package soal_1;

public class Bank {
    private RekeningBank[] daftarRekening; //array untuk menyimpan hasil
    private int jumlahRekening;

    public Bank(int kapasitas) {
        daftarRekening = new RekeningBank[kapasitas];
        jumlahRekening = 0;
    }

    public void tambahRekening(RekeningBank rekening) {
        if (jumlahRekening < daftarRekening.length) { //jumlah inputan rekening
            daftarRekening[jumlahRekening] = rekening;
            jumlahRekening++;
        } else {
            System.out.println("Kapasitas penyimpanan rekening penuh.");
        }
    }

    public RekeningBank cariRekening(String noRek) {
        for (int i = 0; i < jumlahRekening; i++) {
            if (daftarRekening[i].getNoRek().equals(noRek)) { //equal ngecek apakah sesuai dgn inputan
                return daftarRekening[i];
            }
        }
        return null;
    }

    public void tampilkanSemuaRekening() {
        System.out.println("\n=== Daftar Semua Rekening Nasabah ===");
        for (int i = 0; i < jumlahRekening; i++) {
            RekeningBank r = daftarRekening[i];
            System.out.println("No Rekening : " + r.getNoRek());
            System.out.println("Nama Pemilik: " + r.getNamaPemilik());
            System.out.println("Saldo       : " + r.getSaldo());
            System.out.println("----------------------------");
        }
    }
}
