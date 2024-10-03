import java.util.Date;

public class Teknisi {
    private String namaTeknisi;

    // Constructor
    public Teknisi(String namaTeknisi) {
        this.namaTeknisi = namaTeknisi;
    }

    public void pinjamBarang(Peminjam peminjam, Barang barang) {
        if (barang.isTersedia()) {
            barang.setTersedia(false); // Barang dipinjam, ubah status
            System.out.println("Barang " + barang.getNamaBarang() + " telah dipinjam oleh " + peminjam.getNamaPeminjam());
        } else {
            System.out.println("Barang " + barang.getNamaBarang() + " tidak tersedia untuk dipinjam.");
        }
    }

    public void kembalikanBarang(Peminjam peminjam, Barang barang) {
        barang.setTersedia(true); // Barang dikembalikan, ubah status
        System.out.println("Barang " + barang.getNamaBarang() + " telah dikembalikan oleh " + peminjam.getNamaPeminjam());
    }
}
