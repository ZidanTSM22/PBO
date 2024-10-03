import java.util.Scanner;

public class Soal3_Berhitung {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan operasi aritmetika : ");
        String operasi = input.nextLine();

        String[] bagian = operasi.split(" ");

        if (bagian.length != 3) {
            System.out.println("Format input tidak valid!");
            return;
        }

        try {
            int angka1 = Integer.parseInt(bagian[0]);
            int angka2 = Integer.parseInt(bagian[2]);
            char operator = bagian[1].charAt(0);

            int hasil = 0;
            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '%':
                    hasil = angka1 % angka2;
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Pembagian dengan nol tidak diperbolehkan!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid!");
                    return;
            }

            // Menampilkan hasil
            System.out.println("Hasil: " + hasil);
        } catch (NumberFormatException e) {
            System.out.println("Angka tidak valid!");
        }
    }
}
