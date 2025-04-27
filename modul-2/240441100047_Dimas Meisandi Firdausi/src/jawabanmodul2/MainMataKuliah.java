package jawabanmodul2;

public class MainMataKuliah {
    public static void main(String[] args) {
        // membuat 8 objek MataKuliah
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Dasar", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 2);
        MataKuliah mk3 = new MataKuliah("IF103", "Algoritma", 3);
        MataKuliah mk4 = new MataKuliah("IF104", "Basis Data", 2);
        MataKuliah mk5 = new MataKuliah("IF105", "Jaringan Komputer", 2);
        MataKuliah mk6 = new MataKuliah("IF106", "Matematika Diskrit", 3);
        MataKuliah mk7 = new MataKuliah("IF107", "Pancasila", 2);
        MataKuliah mk8 = new MataKuliah("IF108", "Kewarganegaraan", 4); // SKS tidak valid (4)

        // menampilkan data mata kuliah
        System.out.println("======= DATA MATAKULIAH =======");
        mk1.tampilkanData();
        mk2.tampilkanData();
        mk3.tampilkanData();
        mk4.tampilkanData();
        mk5.tampilkanData();
        mk6.tampilkanData();
        mk7.tampilkanData();
        mk8.tampilkanData();  
    }
}
