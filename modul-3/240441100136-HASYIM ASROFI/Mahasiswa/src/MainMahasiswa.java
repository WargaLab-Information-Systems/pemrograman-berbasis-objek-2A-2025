public class MainMahasiswa{
    public static void main(String[] args) {
        MahasiswaReguler m1 = new MahasiswaReguler("Rofy", "12345", "TI-1A");
        m1.infoReguler();
        System.out.println();

        MahasiswaBeasiswa m2 = new MahasiswaBeasiswa("Ani", "67890", "Bidikmisi");
        m2.infoBeasiswa();
    }
}