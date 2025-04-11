import java.util.Scanner;

// Mendefinisikan class Hewan
abstract class Hewan {
    protected String nama;
    protected int umur;

    // Constructor
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Method abstrak untuk suara hewan
    public abstract void bersuara();

    // Method untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}

// Class Kucing yang merupakan turunan dari class Hewan
class Kucing extends Hewan {
    public Kucing(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Meow!");
    }
}

class Anjing extends Hewan {
    public Anjing(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: gukguk!");
    }
}

// Class Burung yang merupakan turunan dari class Hewan
class Burung extends Hewan {
    public Burung(String nama, int umur) {
        super(nama, umur);
    }

 
    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Tweet!");
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan objek Hewan
        try (Scanner scanner = new Scanner(System.in)) {
            // Membuat array untuk menyimpan objek Hewan
            Hewan[] hewanArray = new Hewan[3];
            // Mengumpulkan data dari pengguna untuk 3 hewan
            for (int i = 0; i < 3; i++) {
                System.out.println("Masukkan data hewan ke-" + (i + 1) + ":");
                System.out.print("Nama: ");
                String nama = scanner.nextLine();  
                System.out.print("Umur (tahun): ");
                int umur = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline
                
                System.out.print("Pilih jenis hewan (Kucing/Anjing/Burung): ");
                String jenis = scanner.nextLine();
                
                // Membuat objek Hewan berdasarkan jenis yang dipilih
                switch (jenis.toLowerCase()) {
                    case "kucing":
                        hewanArray[i] = new Kucing(nama, umur);
                        break;
                    case "anjing":
                        hewanArray[i] = new Anjing(nama, umur);
                        break;
                    case "burung":
                        hewanArray[i] = new Burung(nama, umur);
                        break;
                    default:
                        System.out.println("Jenis hewan tidak valid. Menggunakan Kucing sebagai default.");
                        hewanArray[i] = new Kucing(nama, umur);
                        break;
                }
                System.out.println(); // Menambahkan baris kosong untuk kejelasan
            }   // Menampilkan informasi semua hewan dan suara mereka
            System.out.println("Data Hewan:");
            for (Hewan hewan : hewanArray) {
                hewan.tampilkanInfo();
                hewan.bersuara();
                System.out.println();
            }
            // Menutup scanner
        }
    }
}
