import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class Main {
    public static void main(String[] args) {
        // 1. Buat object product dengan quantity produk 10
        Product product = new Product("Laptop", 15000000, 10);

        // 2. Buat object sales
        Sales sales = new Sales(product);

        // 3. Lakukan penjualan produk dengan quantity 5
        sales.sellProduct(5);

        // 4. Lakukan restock produk
        sales.restockProduct(10);

        // 5. Lakukan memperbaharui harga produk
        sales.updateProductPrice(17000000);

        // 6. Coba lakukan memperbaharui harga produk dengan nilai negatif
        sales.updateProductPrice(-2000000);
    }
}
