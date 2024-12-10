public class Motor extends Kendaraan {
    private String jenisMotor;

    public Motor(String platNomor, String merk, int tahunProduksi, String jenisMotor) {
        super(platNomor, merk, tahunProduksi);
        this.jenisMotor = jenisMotor;
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return 100000 * hari;
    }

    // Getter dan Setter
    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }
}
