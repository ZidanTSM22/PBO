import java.util.Scanner;

public class Soal5_BukaTutupJalan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nomor plat untuk 4 mobil
        System.out.println("Masukkan plat number untuk 4 mobil : ");
        String plat1 = input.next();
        String plat2 = input.next();
        String plat3 = input.next();
        String plat4 = input.next();

        // Menggabungkan nomor plat mobil menjadi satu string
        String gabunganPlat = plat1 + plat2 + plat3 + plat4;

        long angkaGabungan = Long.parseLong(gabunganPlat);

        long hasil = angkaGabungan - 999999;

        if (hasil % 5 == 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}
