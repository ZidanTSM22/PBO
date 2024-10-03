import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca input string A dan B
        System.out.print("Masukkan string A: ");
        String A = sc.nextLine();

        System.out.print("Masukkan string B: ");
        String B = sc.nextLine();

        // 1. Menjumlahkan panjang dari A dan B
        int totalLength = A.length() + B.length();
        System.out.println("Jumlah panjang A dan B: " + totalLength);

        // 2. Menentukan apakah A lebih besar secara leksikografis dibanding B
        if (A.compareTo(B) > 0) {
            System.out.println("Ya");
        } else {
            System.out.println("Tidak");
        }

        // 3. Mengkapitalisasi huruf pertama dari A dan B
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Menampilkan hasil kapitalisasi
        System.out.println("Hasil kapitalisasi: " + capitalizedA + " " + capitalizedB);

        sc.close();
    }
}
