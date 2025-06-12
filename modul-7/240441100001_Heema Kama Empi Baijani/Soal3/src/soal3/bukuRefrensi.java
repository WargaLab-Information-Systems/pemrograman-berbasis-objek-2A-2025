/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author Ray_mark
 */
public class bukuRefrensi extends Book implements reservasiBuku {
    public bukuRefrensi(String title, String author){
        super(title, author);
    }
    @Override
    public void reservasi(){
        System.out.println("Refrensi: " + title + " berhasil di reservasi");
    }
    @Override
    public void displayInfo(){
        System.out.println("refrensi - judul: " + title + ", penulis: " + author);
    }
}
