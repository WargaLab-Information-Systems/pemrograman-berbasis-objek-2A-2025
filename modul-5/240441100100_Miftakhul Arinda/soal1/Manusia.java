/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author Miftakhul Arinda
 */
abstract class Manusia {
    abstract void berbicara();
    abstract void bekerja();
    abstract void makan();
}

class Joko extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Joko berkata: Siapkan ruangan rapat!");
    }
    @Override
    void bekerja() {
        System.out.println("Joko bekerja sebagai CEO.");
    }
    @Override
    void makan() {
        System.out.println("Joko makan steak.");
    }
}

class Beni extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Beni berkata: Terbangkan pesawat!");
    }
    @Override
    void bekerja() {
        System.out.println("Beni bekerja sebagai pilot.");
    }
    @Override
    void makan() {
        System.out.println("Beni makan makanan bergizi.");
    }
}

class Fani extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Fani berkata: Halo semuanya!");
    }
    @Override
    void bekerja() {
        System.out.println("Fani bekerja sebagai guru.");
    }
    @Override
    void makan() {
        System.out.println("Fani makan cilok.");
    }
}

class Jani extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Jani berkata: Senang bertemu kalian!");
    }
    @Override
    void bekerja() {
        System.out.println("Jani bekerja sebagai desainer grafis.");
    }
    @Override
    void makan() {
        System.out.println("Jani makan laptop.");
    }
}
