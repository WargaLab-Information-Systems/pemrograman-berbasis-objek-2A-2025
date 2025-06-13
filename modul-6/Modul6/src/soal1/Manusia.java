package soal1;

public abstract class Manusia {
    private String hobi;
    private String pekerjaan;
    private String makanan;

    public Manusia(String hobi, String pekerjaan, String makanan) {
        setHobi(hobi);         
        setPekerjaan(pekerjaan);
        setMakanan(makanan);
    }

    public String getHobi() {
        return hobi;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setHobi(String hobi) {
        if (hobi == null || hobi.trim().isEmpty()) {
            System.out.println("Hobi tidak boleh kosong. Diatur ke 'Tidak diketahui'.");
            this.hobi = "Tidak diketahui";
        } else {
            this.hobi = hobi.trim();
        }
    }

    public void setPekerjaan(String pekerjaan) {
        if (pekerjaan == null || pekerjaan.trim().isEmpty()) {
            System.out.println("Pekerjaan tidak boleh kosong. Diatur ke 'Tidak diketahui'.");
            this.pekerjaan = "Tidak diketahui";
        } else {
            this.pekerjaan = pekerjaan.trim();
        }
    }

    public void setMakanan(String makanan) {
        if (makanan == null || makanan.trim().isEmpty()) {
            System.out.println("Makanan tidak boleh kosong. Diatur ke 'Tidak diketahui'.");
            this.makanan = "Tidak diketahui";
        } else {
            this.makanan = makanan.trim();
        }
    }

    public abstract void berbicara();
    public abstract void bekerja();
    public abstract void makan();
}
