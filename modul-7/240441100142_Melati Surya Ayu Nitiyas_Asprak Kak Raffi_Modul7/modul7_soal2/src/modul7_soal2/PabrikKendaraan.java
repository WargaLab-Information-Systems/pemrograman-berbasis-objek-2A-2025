/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt untuk mengubah lisensi ini
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java untuk mengedit template ini
 */
package modul7_soal2;
public class PabrikKendaraan {
    public static Kendaraan ambilKendaraan(int pilihan) {
        switch (pilihan) {
            case 1 -> {
                return new Mobil();
            }
            case 2 -> {
                return new SepedaMotor();
            }
            case 3 -> {
                return new Sepeda();
            }
            default -> throw new IllegalArgumentException("Pilihan kendaraan tidak valid.");
        }
    }
}
