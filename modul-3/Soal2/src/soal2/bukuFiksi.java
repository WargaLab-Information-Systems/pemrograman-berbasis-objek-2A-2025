/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author wingd
 */
public class bukuFiksi extends Buku {
    protected String Genre;
    
    bukuFiksi (String judul, String penulis, String Genre){
        super(judul, penulis);
        this.Genre =  Genre;
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Genre Buku : " + Genre);        
    }
}
