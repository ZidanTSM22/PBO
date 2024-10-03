public class Barang {
    private String namaBarang;
    private String kodeBarang;
    private boolean tersedia;

    // Constructor
    public Barang(String namaBarang, String kodeBarang) {
        this.namaBarang = namaBarang;
        this.kodeBarang = kodeBarang;
        this.tersedia = true;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
