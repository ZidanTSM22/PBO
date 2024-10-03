package com.polban.jtk.inventory;

public class Inventori {
    private Barang[] barangs;

    public void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    public void showBarang() {
        for (Barang barang : barangs) {
            System.out.println(barang.getNamaBarang() + " (" + barang.getStok() + ")");
        }
    }

    public void pengadaan() {
        initBarang();
        barangs[0].tambahStok(20);
        // Contoh pengurangan stok yang tidak diizinkan (akan error):
        // barangs[0].stok -= 30;

        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}