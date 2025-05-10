/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomordua;

/**
 *
 * @author Miftakhul Arinda
 */
public class Main {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Dasar", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 3);
        MataKuliah mk3 = new MataKuliah("IF103", "Basis Data", 2);
        MataKuliah mk4 = new MataKuliah("IF104", "Matematika Diskrit", 3);
        MataKuliah mk5 = new MataKuliah("IF105", "Pemrograman Web", 2);
        MataKuliah mk6 = new MataKuliah("IF106", "Sistem Operasi", 3);
        MataKuliah mk7 = new MataKuliah("IF107", "Jaringan Komputer", 2);
        MataKuliah mk8 = new MataKuliah("IF108", "Etika Profesi", 2);

        mk1.tampilkanInfo();
        mk2.tampilkanInfo();
        mk3.tampilkanInfo();
        mk4.tampilkanInfo();
        mk5.tampilkanInfo();
        mk6.tampilkanInfo();
        mk7.tampilkanInfo();
        mk8.tampilkanInfo();
    }
}
