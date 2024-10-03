package com.polban.jtk.inventory;

public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        kodeBarang = kode;
        namaBarang = nama;
        stok = stk;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getStok() {
        return stok;
    }

    // Hanya mengizinkan penambahan stok
    public void tambahStok(int jumlah) {
        stok += jumlah;
    }
}
