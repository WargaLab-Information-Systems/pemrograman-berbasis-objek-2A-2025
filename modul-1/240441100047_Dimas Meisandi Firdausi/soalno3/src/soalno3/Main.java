package soalno3;

public class Main {
    public static void main(String[] args) {
        // Daftar nama dan jenis hewan
        String[] namaAyam = {"Jago", "Ayuni", "Cemani"};
        String[] jenisAyam = {"Ayam Jago", "Ayam Petelur", "Ayam Cemani"};

        String[] namaKambing = {"Mbeki", "Si Putih", "Bolang"};
        String[] jenisKambing = {"Kambing Etawa", "Kambing Jawa", "Kambing Boer"};

        String[] namaMonyet = {"Cimut", "Toni", "Monmon"};
        String[] jenisMonyet = {"Monyet Ekor Panjang", "Monyet Daun", "Monyet Hitam"};

        for (int i = 0; i < 3; i++) {
            HewanAyam ayam = new HewanAyam(namaAyam[i], jenisAyam[i]);
            HewanKambing kambing = new HewanKambing(namaKambing[i], jenisKambing[i]);
            HewanMonyet monyet = new HewanMonyet(namaMonyet[i], jenisMonyet[i]);

            System.out.println("=== Hewan ke-" + (i + 1) + " ===");
            ayam.bersuara();
            kambing.bersuara();
            monyet.bersuara();
            System.out.println(); // jarak antar data
        }
    }
}
