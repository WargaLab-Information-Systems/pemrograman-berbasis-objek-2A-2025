/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomordua;

/**
 *
 * @author Miftakhul Arinda
 */
public class MataKuliah {
    private String kodeMataKuliah;
    private String namaMataKuliah;
    private int jumlahSKS;

    public MataKuliah(String kodeMataKuliah, String namaMataKuliah, int jumlahSKS) {
        this.kodeMataKuliah = kodeMataKuliah;
        this.namaMataKuliah = namaMataKuliah;
        
        if (!isSKSValid(jumlahSKS)) {
            System.out.println("Jumlah Sks tidak valid");
        }
        this.jumlahSKS = jumlahSKS;
    }

    public static boolean isSKSValid(int sks) {
        return sks == 2 || sks == 3;
    }

    public void tampilkanMataKuliah() {
        System.out.println("Kode Mata Kuliah : " + kodeMataKuliah);
        System.out.println("Nama Mata Kuliah : " + namaMataKuliah);
        System.out.println("Jumlah SKS       : " + jumlahSKS);
    }

    public void tampilkanInfo() {
        System.out.println(kodeMataKuliah + " - " + namaMataKuliah + " (" + jumlahSKS + " SKS)");
    }
}
