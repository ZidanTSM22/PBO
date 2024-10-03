import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Kelas Mahasiswa (inherits from Person)
class Mahasiswa extends Person {
    private String NIM;
    private String jurusan;
    private int angkatan;

    public Mahasiswa(String nama, String alamat, int umur, String NIM, String jurusan, int angkatan) {
        super(nama, alamat, umur);
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    public void displayData() {
        System.out.println("Nama: " + nama + ", NIM: " + NIM + ", Jurusan: " + jurusan + ", Angkatan: " + angkatan);
    }
}