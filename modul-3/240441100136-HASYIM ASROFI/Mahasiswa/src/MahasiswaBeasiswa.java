class MahasiswaBeasiswa extends Mahasiswa {
    String jenisBeasiswa;

    public MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }

    public void infoBeasiswa() {
        super.infoMahasiswa();
        System.out.println("Beasiswa: " + jenisBeasiswa);
    }
}
