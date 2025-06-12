/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author Ray_mark
 */
public class librarySystem {
   private Book[] books;

    public librarySystem() {
        books = new Book[] {
            new bukuFiksi("Laskar Pelangi", "Andrea Hirata"),
            new bukuRefrensi("Kamus Besar Bahasa Indonesia", "Tim KBBI")
        };
    }

    public void simulate() {
        for (Book book : books) {
            book.displayInfo();

            if (book instanceof Peminjaman) {
                ((Peminjaman) book).pinjamBuku();
            }

            if (book instanceof reservasiBuku) {
                ((reservasiBuku) book).reservasi();
            }

            System.out.println();
        }
    }
}
