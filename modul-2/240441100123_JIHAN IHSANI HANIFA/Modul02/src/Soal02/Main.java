package Soal02;

public class Main {
    public static void main(String[] args) {
        MataKuliah[] dataMK = {
            new MataKuliah("2A", "EBC", 3),
            new MataKuliah("2E", "PBO", 3),
            new MataKuliah("2C", "PBW", 3),
            new MataKuliah("2D", "APB", 2),
            new MataKuliah("2F", "DML", 2),
            new MataKuliah("2G", "BIG", 9), // tidak valid
            new MataKuliah("2H", "SBD", 3)
        };

        System.out.println("=== Daftar Data Mata Kuliah ===");
        for (int i = 0; i < dataMK.length; i++) {
            MataKuliah mk = dataMK[i];
            System.out.println((i + 1) + ".");
            if (MataKuliah.validasiSKS(mk.getJumlahSKS())) {
                mk.tampilkanDataMK();
            } else {
                System.out.println("Tidak valid!");
            }
            System.out.println();
        }
    }
}
