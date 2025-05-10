package tugas2praktikum2;

public class Main {

    public static void main(String[] args) {
        MataKuliah [] datamk = {
            new MataKuliah("2A", "EBC", 3),
            new MataKuliah("2B", "PBO", 2),
            new MataKuliah("2C", "PBW", 3),
            new MataKuliah("2D", "APB", 2),
            new MataKuliah("2E", "PBD", 3),
            new MataKuliah("2F", "DMJ", 2),
            new MataKuliah("2G", "BIG", 4),
            new MataKuliah("2H", "PAI", 2)
        };
        
        System.out.println("=== Daftar Data Mata Kuliah ===");
        for (int i=0; i <  datamk.length; i++){
            MataKuliah mk = datamk[i];
            if (MataKuliah.validasiSKS(mk.jumlahSKS)){
                System.out.print(i + 1 + ". ");
                mk.tampilkanDataMk();
                System.out.println("");
            } else{
                System.out.println(i + 1 + ". tidak valid");
                System.out.println("");
            }
        }
    }
    
}
