package com.polban.jtk.sales;

import java.text.DecimalFormat;

public class Product {
    // Atribut private
    private String productName;
    private double price;
    private int stock;

    // Constructor
    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    // Getter untuk nama produk
    public String getProductName() {
        return productName;
    }

    // Getter dan Setter untuk price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Harga tidak valid!");
        }
    }

    // Getter untuk stock
    public int getStock() {
        return stock;
    }

    // Menambah stok
    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
        } else {
            System.out.println("Jumlah stok tidak valid!");
        }
    }

    // Menjual produk
    public void sellProduct(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
            System.out.println(quantity + " " + productName + " terjual.");
        } else {
            System.out.println("Jumlah stok tidak cukup untuk penjualan.");
        }
    }

    // Format harga dalam string tanpa notasi eksponensial
    public String getFormattedPrice() {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(price);
    }
}
