import java.util.Scanner;

public class HitungNilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai dari user
        System.out.print("Masukkan nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan nilai Ujian Tengah Semester (UTS): ");
        double nilaiUTS = scanner.nextDouble();

        System.out.print("Masukkan nilai Ujian Akhir Semester (UAS): ");
        double nilaiUAS = scanner.nextDouble();

        // Menghitung nilai akhir
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.35 * nilaiUTS) + (0.45 * nilaiUAS);

        // Menentukan grade berdasarkan nilai akhir
        char grade;
        if (nilaiAkhir > 85) {
            grade = 'A';
        } else if (nilaiAkhir > 75) {
            grade = 'B';
        } else if (nilaiAkhir > 65) {
            grade = 'C';
        } else if (nilaiAkhir > 49) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Menampilkan hasil
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}