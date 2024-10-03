import java.util.Scanner;

public class Soal4_Gaji_Agent {

    public static void main(String[] args) {
        // Deklarasi variabel
        final int GAJI_POKOK = 500000;
        final int HARGA_ITEM = 50000;
        int jumlahPenjualan;
        double totalGaji = GAJI_POKOK;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah penjualan bulan ini: ");
        jumlahPenjualan = input.nextInt();

        // Menghitung gaji berdasarkan jumlah penjualan
        if (jumlahPenjualan >= 80) {
            // Bonus 35% jika penjualan lebih dari 80 item
            totalGaji += jumlahPenjualan * HARGA_ITEM * 0.35;
        } else if (jumlahPenjualan >= 40) {
            // Bonus 25% jika penjualan 40-79 item
            totalGaji += jumlahPenjualan * HARGA_ITEM * 0.25;
        } else if (jumlahPenjualan < 15) {
            // Denda 15% dari kekurangan 15 item
            int minusItem = 15 - jumlahPenjualan;
            double denda = minusItem * HARGA_ITEM * 0.15;
            totalGaji -= denda;
        } else {
            // Bonus 10% jika penjualan 15-39 item
            totalGaji += jumlahPenjualan * HARGA_ITEM * 0.10;
        }

        System.out.printf("Gaji yang diterima: Rp%.2f%n", totalGaji);
    }
}
