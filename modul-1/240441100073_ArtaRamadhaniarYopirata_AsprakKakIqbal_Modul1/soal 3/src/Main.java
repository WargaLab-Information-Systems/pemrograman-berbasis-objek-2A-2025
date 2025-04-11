public class Main {
    public static void main(String[] args) {
        // Array objek kucing
        kucing[] daftarKucing = {
                new kucing("esa", "milo"),
                new kucing("cilo", "oren")
        };

        System.out.println("=== KUCING ===");
        for (int i = 0; i < daftarKucing.length; i++) {
            daftarKucing[i].meong();
        }

        // Array objek burung
        burung[] daftarBurung = {
                new burung("gembul", "merpati"),
                new burung("dino", "kakak tua")
        };

        System.out.println("=== BURUNG ===");
        for (int i = 0; i < daftarBurung.length; i++) {
            daftarBurung[i].berkicau();
        }

        // Array objek ikan
        ikan[] daftarIkan = {
                new ikan("Ikan sapu kaca", 10),
                new ikan("Ikan koi", 20)
        };

        System.out.println("=== IKAN ===");
        for (int i = 0; i < daftarIkan.length; i++) {
            daftarIkan[i].berenang();
        }
    }
}


