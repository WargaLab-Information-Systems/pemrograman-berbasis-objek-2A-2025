
package no1;

public class Bank {
    private RekeningBank[] daftarRekeningBank = new RekeningBank[100];
    private int jumlah = 0;

    public void tambahRekening(RekeningBank r) {
        daftarRekeningBank[jumlah++] = r;
    }

    public RekeningBank cariRekening(String noRek) {
        for (int i = 0; i < jumlah; i++) {
            if (daftarRekeningBank[i].getnorek().equals(noRek)) {
                return daftarRekeningBank[i];
            }
        }
        return null;
    }

    public void tampilkanSemuaRekening() {
        for (int i = 0; i < jumlah; i++) {
            daftarRekeningBank[i].tampilkaninfo();
        }
    }
}