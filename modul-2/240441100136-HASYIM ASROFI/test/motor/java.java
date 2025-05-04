public class ConstructorKendaraan {
    private String merk; // ini adalah instant variable
    private static String pemilik; // ini adalah static variable

    // ini adalah constructor tanpa parameter
    protected ConstructorKendaraan() {
        merk = null;
    }

    // overloading constructor dengan parameter merk
    protected ConstructorKendaraan(String merk) {
        this.merk = merk;
        merk = null;
    }

    protected void setMerk(String merk) {
        this.merk = merk;
    }

    protected String getMerk() {
        return merk;
    }

    // ini adalah static method
    protected static void setPemilik(String pemilik) {
        ConstructorKendaraan.pemilik = pemilik;
    }

    // ini adalah static method
    protected static String getPemilik() {
        return ConstructorKendaraan.pemilik;
    }

    protected void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    protected void hapus() {
        // menghapus variable private dari memory
        merk = null;
        pemilik = null;
    }
}