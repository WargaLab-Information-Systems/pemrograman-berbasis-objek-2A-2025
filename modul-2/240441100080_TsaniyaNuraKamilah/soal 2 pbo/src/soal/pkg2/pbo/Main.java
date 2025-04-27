
package soal.pkg2.pbo;

public class Main {
    public static void main(String[] args) {
        MataKuliah[] daftarmk = {
            new MataKuliah("IF101", "Pemrograman Java", 3),
            new MataKuliah("IF102", "Struktur Data", 3),
            new MataKuliah("IF103", "Basis Data", 2),
            new MataKuliah("IF104", "Jaringan Komputer", 3),
            new MataKuliah("IF105", "Sistem Operasi", 2),
            new MataKuliah("IF106", "AI", 3),
            new MataKuliah("IF107", "Analisa Proses Bisnis", 2),
            new MataKuliah("IF108", "Pemprograman Berbasis Web", 2)
            };

            for (MataKuliah mk : daftarmk) {
                mk.tampilkandata();
            }
        }
    }