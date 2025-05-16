
package modul4.soal.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

class RekeningBank {
    private final String noRek;
    private final String namaPemilik;
    private double saldo;

    public RekeningBank(String noRek, String namaPemilik, double saldoAwal) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }

    public String getNoRek() {
        return noRek;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setoran berhasil.");
        } else {
            System.out.println("Jumlah setoran harus positif.");
        }
    }

    public boolean tarik(double jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil.");
            return true;
        } else {
            System.out.println("Saldo tidak cukup atau jumlah penarikan tidak valid.");
            return false;
        }
    }

    public void tampilkanInfo() {
        System.out.println("No Rekening: " + noRek + ", Nama: " + namaPemilik + ", Saldo: " + saldo);
    }
}

class Bank {
    private final ArrayList<RekeningBank> daftarRekening;

    public Bank() {
        daftarRekening = new ArrayList<>();
    }

    public void tambahRekening(String noRek, String namaPemilik, double saldoAwal) {
        if (cariRekening(noRek) == null) {
            RekeningBank rek = new RekeningBank(noRek, namaPemilik, saldoAwal);
            daftarRekening.add(rek);
            System.out.println("Rekening berhasil ditambahkan.");
        } else {
            System.out.println("No rekening sudah ada.");
        }
    }

    private RekeningBank cariRekening(String noRek) {
        for (RekeningBank rek : daftarRekening) {
            if (rek.getNoRek().equals(noRek)) {
                return rek;
            }
        }
        return null;
    }

    public void setor(String noRek, double jumlah) {
        RekeningBank rek = cariRekening(noRek);
        if (rek != null) {
            rek.setor(jumlah);
        } else {
            System.out.println("Rekening tidak ditemukan.");
        }
    }

    public void tarik(String noRek, double jumlah) {
        RekeningBank rek = cariRekening(noRek);
        if (rek != null) {
            rek.tarik(jumlah);
        } else {
            System.out.println("Rekening tidak ditemukan.");
        }
    }

    public void tampilkanSemuaRekening() {
        if (daftarRekening.isEmpty()) {
            System.out.println("Belum ada rekening yang terdaftar.");
        } else {
            System.out.println("=== Daftar Rekening ===");
            for (RekeningBank rek : daftarRekening) {
                rek.tampilkanInfo();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Bank");
            System.out.println("1. Tambah Rekening");
            System.out.println("2. Setor");
            System.out.println("3. Tarik");
            System.out.println("4. Tampilkan Semua Rekening");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan No Rekening: ");
                    String noRek = scanner.nextLine();
                    System.out.print("Masukkan Nama Pemilik: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Saldo Awal: ");
                    double saldoAwal = scanner.nextDouble();
                    scanner.nextLine();
                    bank.tambahRekening(noRek, nama, saldoAwal);
                    break;
                case 2:
                    System.out.print("Masukkan No Rekening: ");
                    noRek = scanner.nextLine();
                    System.out.print("Masukkan Jumlah Setoran: ");
                    double setoran = scanner.nextDouble();
                    scanner.nextLine();
                    bank.setor(noRek, setoran);
                    break;
                case 3:
                    System.out.print("Masukkan No Rekening: ");
                    noRek = scanner.nextLine();
                    System.out.print("Masukkan Jumlah Penarikan: ");
                    double tarik = scanner.nextDouble();
                    scanner.nextLine();
                    bank.tarik(noRek, tarik);
                    break;
                case 4:
                    bank.tampilkanSemuaRekening();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan layanan bank.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
