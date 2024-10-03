// Kelas Jadwal
class Jadwal {
    private String hari;
    private String waktu;
    private Ruangan ruangan;
    private Dosen dosen;
    private String mataKuliah;

    public Jadwal(String hari, String waktu, Ruangan ruangan, Dosen dosen, String mataKuliah) {
        this.hari = hari;
        this.waktu = waktu;
        this.ruangan = ruangan;
        this.dosen = dosen;
        this.mataKuliah = mataKuliah;
    }

    public void displayJadwal() {
        System.out.println(hari + " " + waktu + " - Mata Kuliah: " + mataKuliah + ", Dosen: " + dosen.getNama() + ", Ruangan: " + ruangan.getNamaRuangan());
    }
}