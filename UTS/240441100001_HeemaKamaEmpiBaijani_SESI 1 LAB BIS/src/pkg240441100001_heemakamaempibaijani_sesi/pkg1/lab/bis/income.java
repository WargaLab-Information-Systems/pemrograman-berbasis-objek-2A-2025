/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg240441100001_heemakamaempibaijani_sesi.pkg1.lab.bis;

/**
 *
 * @author wingd
 */
public class income extends transaction {
    protected int Jumlah;
    protected String jenis;
    
    income(int jumlah, String jenis){
        super( date , description, amount );
        this.Jumlah = Jumlah;
        this.jenis = jenis;
    }
    @override
    void displayInfo(){
        System.out.println("[income] " + description + " - " + date + " = " + amount); 
    }
}
