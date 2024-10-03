public class Peminjam {
    private String namaPeminjam;
    private String npm;

    // Constructor
    public Peminjam(String namaPeminjam, String npm) {
        this.namaPeminjam = namaPeminjam;
        this.npm = npm;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public String getNpm() {
        return npm;
    }
}
