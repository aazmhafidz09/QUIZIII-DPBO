public abstract class Kendaraan {
    protected String platNomor;
    protected String merk;
    protected int tahunProduksi;

    public Kendaraan(String platNomor, String merk, int tahunProduksi) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    public abstract double hitungBiayaSewa(int hari);

    // Getter dan Setter
    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
}
