package jawabanmodul2;


public class MainKampus {
    public static void main(String[] args) {
        Kampus k1 = new Kampus("Universitas Trunojooyo Mexico", "Jl. Merdeka No. 1", 5000);
        Kampus k2 = new Kampus("Uiversitas Tanggera1ng", "Jln.apa aja 1",3000);
        

        
        
        
        System.out.println("======= DATA KAMPUS =======");
        k1.tampilkanInfo();
        k2.tampilkanInfo();
    }
}
