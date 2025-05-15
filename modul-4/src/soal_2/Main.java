package soal_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah buku yang akan dicatat: ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        Perpustakaan perpus = new Perpustakaan(jumlah);

        for (int i = 0; i < jumlah; i++) {
            perpus.tambahBukuDariInput(input);
        }

        perpus.tampilkanDaftarBuku();
        input.close();
    }
}
