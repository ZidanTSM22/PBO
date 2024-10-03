import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Kelas dasar Person
class Person {
    protected String nama;
    protected String alamat;
    protected int umur;

    public Person(String nama, String alamat, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }
}