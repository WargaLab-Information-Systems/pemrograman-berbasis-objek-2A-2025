package modul6soal2;
public class MainMobil {
    public static void main(String[] args) {
        ManajemenMobil manajemen = new ManajemenMobil();
        manajemen.tambahMobil(new MobilSport());
        manajemen.tambahMobil(new MobilSedan());

        manajemen.operasikanSemuaMobil();
    }
}


