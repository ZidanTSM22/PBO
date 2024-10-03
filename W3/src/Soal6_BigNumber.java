import java.math.BigInteger;
import java.util.Scanner;

public class Soal6_BigNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca dua angka besar dari input
        String a = input.nextLine();
        String b = input.nextLine();

        // Menggunakan BigInteger untuk menyimpan angka besar
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        // Menjumlahkan kedua angka
        BigInteger sum = bigA.add(bigB);

        // Mengalikan kedua angka
        BigInteger product = bigA.multiply(bigB);

        // Output hasil penjumlahan dan perkalian
        System.out.println(sum);
        System.out.println(product);
    }
}
