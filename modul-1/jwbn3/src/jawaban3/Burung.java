/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jawaban3;

class Burung {
    String nama;
    String warnaBulu;
    
    Burung(String nama, String warnaBulu) {
        this.nama = nama;
        this.warnaBulu = warnaBulu;
    }

    void berkicau() {
        System.out.println(nama + " (burung) berwarna " + warnaBulu + " berkicau: kukuruyuk !");
    }
}
