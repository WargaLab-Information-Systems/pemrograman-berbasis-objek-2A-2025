
package tugas3praktikum2;

public class Main {

    public static void main(String[] args) {
        String namakampus = "Universitas Trunojoyo Madura";
        String alamat = "Jl. Telang";
        
        if (Kampus.validasiNama(namakampus)){
            System.out.println("=== Informasi Kampus ===");
            Kampus kp1 = new Kampus(namakampus, alamat, 500 );
            kp1.tampilkandata();
        } else {
            System.out.println("Nama Kampus tidak valid.");
        }
    }
}
