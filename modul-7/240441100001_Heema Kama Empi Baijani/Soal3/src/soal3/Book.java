/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author Ray_mark
 */
public abstract class Book {
    protected String title;
    protected String author;
    
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    
    public abstract void displayInfo();
}
