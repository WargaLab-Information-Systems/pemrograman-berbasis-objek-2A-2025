/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author wingd
 */
public class bukuNonFiksi extends Buku{
    protected String topik;
    
    bukuNonFiksi (String judul, String penulis, String topik){
        super(judul, penulis);
        this.topik = topik;
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Topik Buku : " + topik);
    }
}
