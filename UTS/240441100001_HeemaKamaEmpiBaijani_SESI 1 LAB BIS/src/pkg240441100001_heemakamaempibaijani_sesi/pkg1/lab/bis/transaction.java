/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg240441100001_heemakamaempibaijani_sesi.pkg1.lab.bis;

/**
 *
 * @author wingd
 */
public class transaction {
    String date;
    String description;
    int amount;
    
    transaction (String date, String description, int amount){
      this.date = date;
      this.description = description;
      this.amount = amount;
              
    }
    void displayInfo(){
        System.out.println(" Tanggal : " + date );
        System.out.println(" Deskripsi : " + description);
        System.out.println(" amount : " + amount );
        
    }
}
