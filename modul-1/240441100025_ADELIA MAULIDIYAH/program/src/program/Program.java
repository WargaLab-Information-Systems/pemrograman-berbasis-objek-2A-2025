//import java.util.ArrayList;
//import java.util.List;
//
//// Kelas Jangkrik
//class Jangkrik {
//    String nama;
//    int umur;
//
//    public Jangkrik(String nama, int umur) {
//        this.nama = nama;
//        this.umur = umur;
//    }
//
//    public String bersuara() {
//        return "Krikk! Krikk";
//    }
//
//    public String info() {
//        return "Jangkrik bernama " + nama + ", berumur " + umur + " tahun.";
//    }
//}
//
//// Kelas Bebek
//class Bebek {
//    String nama;
//    String ras;
//
//    public Bebek(String nama, String ras) {
//        this.nama = nama;
//        this.ras = ras;
//    }
//
//    public String bersuara() {
//        return "Wek! Wek! Wek!";
//    }
//
//    public String info() {
//        return "Bebek bernama " + nama + ", ras " + ras + ".";
//    }
//}
//
//// Kelas Kambing
//class Kambing {
//    String nama;
//    String warna;
//
//    public Kambing(String nama, String warna) {
//        this.nama = nama;
//        this.warna = warna;
//    }
//
//    public String bersuara() {
//        return "Mbekk! Mbekk!";
//    }
//
//    public String info() {
//        return "Kambing bernama " + nama + ", ras " + warna + ".";
//    }
//}
//
//// Kelas Program (Main Class)
//public class Program {
//    public void jalankan() {
//        // Membuat daftar hewan menggunakan List
//        List<Object> hewanList = new ArrayList<>();
//        
//        // Menambahkan beberapa objek ke dalam daftar (menggunakan perulangan)
//        for (int i = 1; i <= 3; i++) {
//            hewanList.add(new Jangkrik("Jangkrik" + i, i + 1));
//            hewanList.add(new Bebek("Bebek" + i, "Ras" + i));
//            hewanList.add(new Kambing("Kambing" + i, "ras" + i));
//        }
//
//        // Menampilkan informasi setiap hewan menggunakan perulangan
//        for (Object hewan : hewanList) {
//            if (hewan instanceof Jangkrik) {
//                Jangkrik J = (Jangkrik) hewan;
//                System.out.println(J.info() + " - Suara: " + J.bersuara());
//            } else if (hewan instanceof Bebek) {
//                Bebek B = (Bebek) hewan;
//                System.out.println(B.info() + " - Suara: " + B.bersuara());
//            } else if (hewan instanceof Kambing) {
//                Kambing K = (Kambing) hewan;
//                System.out.println(K.info() + " - Suara: " + K.bersuara());
//            }
//        }
//    }
//
//    // Metode utama untuk menjalankan program
//    public static void main(String[] args) {
//        new Program().jalankan();  // Menjalankan program utama
//    }
//}





//import java.util.ArrayList;
//import java.util.List;
//
////// Interface Hewan
////interface Hewan {
////    String bersuara();
////    String info();
////}
//
//// Kelas Jangkrik
//class Jangkrik {
//    String nama;
//    int umur;
//
//    public Jangkrik(String nama, int umur) {
//        this.nama = nama;
//        this.umur = umur;
//    }
//
//    
//    public String bersuara() {
//        return "Krikk! Krikk!";
//    }
//
//    
//    public String info() {
//        return "Jangkrik bernama " + nama + ", berumur " + umur + " tahun.";
//    }
//}
//
//// Kelas Bebek
//class Bebek {
//    String nama;
//    String ras;
//
//    public Bebek(String nama, String ras) {
//        this.nama = nama;
//        this.ras = ras;
//    }
//
//   
//    public String bersuara() {
//        return "Wek! Wek! Wek!";
//    }
//
//    
//    public String info() {
//        return "Bebek bernama " + nama + ", ras " + ras + ".";
//    }
//}
//
//// Kelas Kambing
//class Kambing {
//    String nama;
//    String warna;
//
//    public Kambing(String nama, String warna) {
//        this.nama = nama;
//        this.warna = warna;
//    }
//
//    
//    public String bersuara() {
//        return "Mbekk! Mbekk!";
//    }
//
//    
//    public String info() {
//        return "Kambing bernama " + nama + ", warna " + warna + ".";
//    }
//}
//
//// Kelas Program (Main Class)
//public class Program {
//    public void jalankan() {
//        // Menggunakan List<Hewan> agar tidak perlu casting atau instanceof
//        List<Hewan> hewanList = new ArrayList<>();
//
//        // Tambahkan data hewan
//        for (int i = 1; i <= 3; i++) {
//            hewanList.add(new Jangkrik("Jangkrik" + i, i + 1));
//            hewanList.add(new Bebek("Bebek" + i, "Ras" + i));
//            hewanList.add(new Kambing("Kambing" + i, "Putih" + i));
//        }
//
//        // Tampilkan info hewan
//        for (Hewan h : hewanList) {
//            System.out.println(h.info() + " - Suara: " + h.bersuara());
//        }
//    }
//
//    public static void main(String[] args) {
//        new Program().jalankan();
//    }
//}





//import java.util.ArrayList;
//import java.util.List;
//
//// Kelas Jangkrik
//class Jangkrik {
//    String nama;
//
//    public Jangkrik(String nama) {
//        this.nama = nama;
//    }
//
//    public String bersuara() {
//        return "Krikk! Krikk";
//    }
//
//    public String info() {
//        return "Jangkrik bernama " + nama + ".";
//    }
//}
//
//// Kelas Bebek
//class Bebek {
//    String nama;
//
//    public Bebek(String nama) {
//        this.nama = nama;
//    }
//
//    public String bersuara() {
//        return "Wek! Wek! Wek!";
//    }
//
//    public String info() {
//        return "Bebek bernama " + nama + ".";
//    }
//}
//
//// Kelas Kambing
//class Kambing {
//    String nama;
//
//    public Kambing(String nama) {
//        this.nama = nama;
//    }
//
//    public String bersuara() {
//        return "Mbekk! Mbekk!";
//    }
//
//    public String info() {
//        return "Kambing bernama " + nama + ".";
//    }
//}
//
//// Kelas Program (Main Class)
//public class Program {
//    public void jalankan() {
//        // Membuat daftar hewan menggunakan List
//        List<Object> hewanList = new ArrayList<>();
//
//        // Menambahkan beberapa objek ke dalam daftar (menggunakan perulangan)
//        for (int i = 1; i <= 3; i++) {
//            hewanList.add(new Jangkrik("Jangkrik" + i));
//            hewanList.add(new Bebek("Bebek" + i));
//            hewanList.add(new Kambing("Kambing" + i));
//        }
//
//        // Menampilkan informasi setiap hewan menggunakan perulangan
//        for (Object hewan : hewanList) {
//            if (hewan instanceof Jangkrik) {
//                Jangkrik J = (Jangkrik) hewan;
//                System.out.println(J.info() + " - Suara: " + J.bersuara());
//            } else if (hewan instanceof Bebek) {
//                Bebek B = (Bebek) hewan;
//                System.out.println(B.info() + " - Suara: " + B.bersuara());
//            } else if (hewan instanceof Kambing) {
//                Kambing K = (Kambing) hewan;
//                System.out.println(K.info() + " - Suara: " + K.bersuara());
//            }
//        }
//    }
//
//    // Metode utama untuk menjalankan program
//    public static void main(String[] args) {
//        new Program().jalankan();  // Menjalankan program utama
//    }
//}





import java.util.ArrayList;
import java.util.List;

// Interface Hewan
interface Hewan {
    String bersuara();
    String info();
}

// Kelas Jangkrik
class Jangkrik implements Hewan {
    String nama;

    public Jangkrik(String nama) {
        this.nama = nama;
    }

    public String bersuara() {
        return "Krikk! Krikk";
    }

    public String info() {
        return "Jangkrik bernama " + nama + ".";
    }
}

// Kelas Bebek
class Bebek implements Hewan {
    String nama;

    public Bebek(String nama) {
        this.nama = nama;
    }

    public String bersuara() {
        return "Wek! Wek! Wek!";
    }

    public String info() {
        return "Bebek bernama " + nama + ".";
    }
}

// Kelas Kambing
class Kambing implements Hewan {
    String nama;

    public Kambing(String nama) {
        this.nama = nama;
    }

    public String bersuara() {
        return "Mbekk! Mbekk!";
    }

    public String info() {
        return "Kambing bernama " + nama + ".";
    }
}

// Kelas Program
public class Program {
    public void jalankan() {
        List<Hewan> hewanList = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            hewanList.add(new Jangkrik("Jangkrik" + i));
            hewanList.add(new Bebek("Bebek" + i));
            hewanList.add(new Kambing("Kambing" + i));
        }

        for (Hewan hewan : hewanList) {
            System.out.println(hewan.info() + " - Suara: " + hewan.bersuara());
        }
    }

    public static void main(String[] args) {
        new Program().jalankan();
    }
}
