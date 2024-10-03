import java.util.Scanner;

public class Soal1_InputOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca input string
        String s = input.nextLine();

        // Menghapus karakter non-alfabet dengan menggunakan regex
        String[] tokens = s.trim().split("[^A-Za-z]+");

        // Menampilkan jumlah token
        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);

            // Menampilkan setiap token pada baris baru
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
