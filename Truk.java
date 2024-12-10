public class Truk extends Kendaraan {
    private double kapasitasMaksimal; // dalam ton

    public Truk(String platNomor, String merk, int tahunProduksi, double kapasitasMaksimal) {
        super(platNomor, merk, tahunProduksi);
        this.kapasitasMaksimal = kapasitasMaksimal;
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return 500000 * hari;
    }

    // Getter dan Setter
    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public void setKapasitasMaksimal(double kapasitasMaksimal) {
        this.kapasitasMaksimal = kapasitasMaksimal;
    }
}
