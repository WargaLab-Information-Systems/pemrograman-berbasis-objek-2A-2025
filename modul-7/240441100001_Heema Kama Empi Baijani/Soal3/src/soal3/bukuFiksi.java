/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author Ray_mark
 */
public class bukuFiksi extends Book implements Peminjaman, reservasiBuku {
    public bukuFiksi(String title, String author){
        super(title, author);
    }
    @Override
    public void pinjamBuku(){
        System.out.println("fiksi: " + title + " berhasil dipinjam");
    }
    @Override
    public void reservasi(){
        System.out.println("fiksi: " + title + " berhasil di reservasi");
    }
    @Override
    public void displayInfo(){
        System.out.println("Fiksi - judul: " + title + " penulis" + author);
    }
}
