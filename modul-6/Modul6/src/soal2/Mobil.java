package soal2;
public abstract class Mobil {
    private String merk;
    
    public Mobil (String merk){
        setMerk(merk);
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setMerk(String merk) {
        if (merk == null || merk.trim().isEmpty()) {
            System.out.println("Merk tidak boleh kosong. Diatur ke 'Tidak diketahui'.");
            this.merk = "Tidak diketahui";
        } else {
            this.merk = merk.trim();
        }
    }
    public abstract void nyalakan_mesin();
    public abstract void matikan_mesin();
}



