package Soal1;
public class Bank {
    private RekeningBank[] daftarRekening;
    private int jumlahRekening;

    public Bank(int kapasitas) {
        daftarRekening = new RekeningBank[kapasitas];
        jumlahRekening = 0;
    }

    public void tambahRekening(RekeningBank rekening) {
        if (jumlahRekening < daftarRekening.length) {
            daftarRekening[jumlahRekening++] = rekening;
        }
    }

    public void tampilkanSemuaRekening() {
        for (int i = 0; i < jumlahRekening; i++) {
            RekeningBank r = daftarRekening[i];
            System.out.println("Rekening ke-" + (i + 1));
            System.out.println("Nomor  : " + r.getNoRek());
            System.out.println("Nama   : " + r.getNamaPemilik());
            System.out.println("Saldo  : " + r.getSaldo());
            System.out.println("-----------------------");
        }
    }
}

