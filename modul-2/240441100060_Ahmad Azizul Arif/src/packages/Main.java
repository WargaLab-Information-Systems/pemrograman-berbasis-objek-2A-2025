package packages;

public class Main {
    public static void main(String[] args) {
        Kampus kampus = new Kampus("Universitas Trunojoyo Madura", "Jl. Telang No.01");

        MataKuliah matkul1 = new MataKuliah("SI001", "PBO", 3);
        MataKuliah matkul2 = new MataKuliah("SI002", "Basis Data", 3);
        MataKuliah matkul3 = new MataKuliah("SI003", "Logika Engginering", 3);
        MataKuliah matkul4 = new MataKuliah("SI004", "PBW", 3);
        MataKuliah matkul5 = new MataKuliah("SI005", "DMJ", 3);
        MataKuliah matkul6 = new MataKuliah("SI006", "B. Inggris", 2);
        MataKuliah matkul7 = new MataKuliah("SI007", "Pancasila", 2);
        MataKuliah matkul8 = new MataKuliah("SI008", "Kewarganegaraan", 2);

        Mahasiswa mhs1 = new Mahasiswa("Agus", "2345677634", "SI");
        mhs1.tambahMatkul(matkul1);
        mhs1.tambahMatkul(matkul2);
        mhs1.tambahMatkul(matkul5);
        mhs1.tambahMatkul(matkul8);

        Mahasiswa mhs2 = new Mahasiswa("Riski", "2322334455", "SI");
        mhs2.tambahMatkul(matkul3);
        mhs2.tambahMatkul(matkul5);
        mhs2.tambahMatkul(matkul6);
        mhs2.tambahMatkul(matkul7);
        
        Mahasiswa mhs3 = new Mahasiswa("EzZ", "2344557788", "SI");
        mhs3.tambahMatkul(matkul1);
        mhs3.tambahMatkul(matkul1);
        mhs3.tambahMatkul(matkul2);
        mhs3.tambahMatkul(matkul4);
        
        Mahasiswa mhs4 = new Mahasiswa("Ren", "2399885544", "SI");
        mhs4.tambahMatkul(matkul2);
        mhs4.tambahMatkul(matkul4);
        mhs4.tambahMatkul(matkul6);
        mhs4.tambahMatkul(matkul8);
        
        Mahasiswa mhs5 = new Mahasiswa("Budi", "2488665544", "SI");
        mhs5.tambahMatkul(matkul3);
        mhs5.tambahMatkul(matkul5);
        mhs5.tambahMatkul(matkul6);
        mhs5.tambahMatkul(matkul7);
        
        Mahasiswa mhs6 = new Mahasiswa("vera", "2388768899", "SI");
        mhs6.tambahMatkul(matkul1);
        mhs6.tambahMatkul(matkul2);
        mhs6.tambahMatkul(matkul4);
        mhs6.tambahMatkul(matkul5);

        mhs1.tampilkanMahasiswa();
        mhs2.tampilkanMahasiswa();
        mhs3.tampilkanMahasiswa();
        mhs4.tampilkanMahasiswa();
        mhs5.tampilkanMahasiswa();
        mhs6.tampilkanMahasiswa();

        Kampus.TotalMahasiswa(Mahasiswa.TotalMahasiswa());
        
        kampus.tampilkanInfoKampus();
    }
}
