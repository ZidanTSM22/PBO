public class Main {
    public static void main(String[] args) {
        // Membuat object barang
        Barang laptop = new Barang("Laptop", "L001");
        Barang proyektor = new Barang("Proyektor", "P002");
        Barang terminal = new Barang("Terminal","P003");

        // Membuat object peminjam
        Peminjam zidan = new Peminjam("Zidan Tri Satria Mukti", "231511064");

        // Membuat object teknisi
        Teknisi teknisi = new Teknisi("Pak Andi");

        // Memproses peminjaman barang
        teknisi.pinjamBarang(zidan, laptop);

        // Memproses pengembalian barang
        teknisi.kembalikanBarang(zidan, laptop);

        // Mencoba meminjam barang yang sudah dikembalikan
        teknisi.pinjamBarang(zidan, proyektor);
    }
}
