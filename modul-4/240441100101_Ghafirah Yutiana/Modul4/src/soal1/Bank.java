package soal1;

// Class Bank untuk mengelola beberapa rekening menggunakan array
public class Bank {
    private RekeningBank[] daftarRekening;
    private int jumlahRekening;

    public Bank(int kapasitas) {
        daftarRekening = new RekeningBank[kapasitas];
        jumlahRekening = 0;
    }

    // Method menambahkan rekening baru
    public void tambahRekening(RekeningBank rekening) {
        if (jumlahRekening < daftarRekening.length) {
            daftarRekening[jumlahRekening] = rekening;
            jumlahRekening++;
            System.out.println("Rekening dengan no " + rekening.getNoRek() + " berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas rekening penuh, tidak bisa menambah rekening baru.");
        }
    }

    // Method mencari rekening berdasarkan noRek
    private RekeningBank cariRekening(String noRek) {
        for (int i = 0; i < jumlahRekening; i++) {
            if (daftarRekening[i].getNoRek().equals(noRek)) {
                return daftarRekening[i];
            }
        }
        return null;
    }

    // Method setor saldo berdasarkan noRek
    public void setor(String noRek, double jumlah) {
        RekeningBank rekening = cariRekening(noRek);
        if (rekening != null) {
            rekening.setor(jumlah);
        } else {
            System.out.println("Rekening dengan no " + noRek + " tidak ditemukan.");
        }
    }

    // Method tarik saldo berdasarkan noRek
    public void tarik(String noRek, double jumlah) {
        RekeningBank rekening = cariRekening(noRek);
        if (rekening != null) {
            rekening.tarik(jumlah);
        } else {
            System.out.println("Rekening dengan no " + noRek + " tidak ditemukan.");
        }
    }

    // Method menampilkan semua data rekening
    public void tampilkanSemuaRekening() {
        if (jumlahRekening == 0) {
            System.out.println("Belum ada rekening yang terdaftar.");
        } else {
            System.out.println("Daftar Rekening Bank:");
            System.out.println("=====================");
            for (int i = 0; i < jumlahRekening; i++) {
                daftarRekening[i].tampilkanInfo();
            }
        }
    }
}

