// Kelas Dosen (inherits from Person)
class Dosen extends Person {
    private String NIDN;
    private String mataKuliah;

    public Dosen(String nama, String alamat, int umur, String NIDN, String mataKuliah) {
        super(nama, alamat, umur);
        this.NIDN = NIDN;
        this.mataKuliah = mataKuliah;
    }

    public void displayData() {
        System.out.println("Nama: " + nama + ", NIDN: " + NIDN + ", Mata Kuliah: " + mataKuliah);
    }
}
