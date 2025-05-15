/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg240441100001_heemakamaempibaijani_sesi.pkg1.lab.bis;

/**
 *
 * @author wingd
 */
public class expense extends transaction {
    
    expense(){
        super(date, description, amount);
    }
    
    @override
    void displayInfo(){
        System.out.println("[ expense ] " + description + " - " + date + " = " + amount);
    }
}
