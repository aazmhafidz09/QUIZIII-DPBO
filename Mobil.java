public class Mobil extends Kendaraan {
    private int kapasitasPenumpang;

    public Mobil(String platNomor, String merk, int tahunProduksi, int kapasitasPenumpang) {
        super(platNomor, merk, tahunProduksi);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return 300000 * hari;
    }

    // Getter dan Setter
    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
}
