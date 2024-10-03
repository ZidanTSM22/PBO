import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Main Class
public class Main {

    private static List<Mahasiswa> mahasiswaList = new ArrayList<>();
    private static List<Dosen> dosenList = new ArrayList<>();
    private static List<Jadwal> jadwalList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample data Mahasiswa
        mahasiswaList.add(new Mahasiswa("Ahmad", "Jl. ABC", 20, "231511033", "Informatika", 2020));
        mahasiswaList.add(new Mahasiswa("Bandy", "Jl. DEF", 20, "231511038", "Informatika", 2020));
        mahasiswaList.add(new Mahasiswa("Dwika", "Jl. GHI", 19, "231511042", "Informatika", 2020));
        mahasiswaList.add(new Mahasiswa("Azzam", "Jl. JKL", 19, "231511054", "Informatika", 2020));
        mahasiswaList.add(new Mahasiswa("Nino", "Jl. MNO", 20, "231511059", "Informatika", 2020));
        mahasiswaList.add(new Mahasiswa("Zidan", "Jl. PQR", 21, "231511064", "Informatika", 2020));
        mahasiswaList.add(new Mahasiswa("Ilham", "Jl. STU", 20, "231511053", "Informatika", 2020));
        mahasiswaList.add(new Mahasiswa("Ammar", "Jl. VWX", 20, "231511055", "Informatika", 2020));
        mahasiswaList.add(new Mahasiswa("Nalen", "Jl. YZA", 20, "231511048", "Informatika", 2020));
        mahasiswaList.add(new Mahasiswa("Farrel", "Jl. BCD", 20, "231511060", "Informatika", 2020));

        // Sample data Dosen
        dosenList.add(new Dosen("Dr. Siti", "Jl. GHI", 40, "67890", "Matematika Diskrit"));
        dosenList.add(new Dosen("Dr. Windy", "Jl. JKL", 45, "67891", "Bahasa Inggris"));
        dosenList.add(new Dosen("Dr. Yadhi", "Jl. GHI", 40, "67892", "PRPL"));
        dosenList.add(new Dosen("Dr. Yudi", "Jl. JKL", 45, "67893", "Komputer Grafik"));
        dosenList.add(new Dosen("Dr. Setiady", "Jl. GHI", 40, "67894", "Matematika Diskrit"));
        dosenList.add(new Dosen("Dr. Eddy", "Jl. JKL", 45, "67895", "Matematika Terapan"));
        dosenList.add(new Dosen("Dr. Ade", "Jl. GHI", 40, "67896", "Basis Data"));
        dosenList.add(new Dosen("Dr. Wendy", "Jl. JKL", 45, "67897", "Dasar Dasar Pemrograman"));
        dosenList.add(new Dosen("Dr. Latifah", "Jl. GHI", 40, "67898", "Bahasa Indonesia"));
        dosenList.add(new Dosen("Dr. Santi", "Jl. JKL", 45, "67899", "PRPL"));

        // Sample data Ruangan dan Jadwal
        Ruangan r1 = new Ruangan("Lab Komputer", 40);
        Ruangan r2 = new Ruangan("Ruang Kelas 101", 30);
        Ruangan r3 = new Ruangan("Ruang Kelas 102", 30);
        Ruangan r4 = new Ruangan("Ruang Kelas 103", 30);
        Ruangan r5 = new Ruangan("Ruang Kelas 104", 30);

        jadwalList.add(new Jadwal("Senin", "08:00-10:00", r1, dosenList.get(0), "Matematika Diskrit"));
        jadwalList.add(new Jadwal("Senin", "10:00-12.00", r1, dosenList.get(1), "Bahasa Inggris"));
        jadwalList.add(new Jadwal("Selasa", "08:00-10:00", r2, dosenList.get(2), "PRPL"));
        jadwalList.add(new Jadwal("Selasa", "10:00-12:00", r2, dosenList.get(3), "Komputer Grafuk"));
        jadwalList.add(new Jadwal("Rabu", "08:00-10:00", r1, dosenList.get(4), "Mametika Diksrit"));
        jadwalList.add(new Jadwal("Rabu", "10:00-12:00", r2, dosenList.get(5), "Matematika Terapan"));
        jadwalList.add(new Jadwal("Kamis", "08:00-10:00", r1, dosenList.get(6), "Basis Data"));
        jadwalList.add(new Jadwal("Kamis", "10:00-12:00", r2, dosenList.get(7), "Dasar Dasar Pemrograman"));
        jadwalList.add(new Jadwal("Jumat", "08:00-10:00", r1, dosenList.get(8), "Bahasa Indonesia"));
        jadwalList.add(new Jadwal("Jumat", "10:00-12:00", r2, dosenList.get(9), "PRPL"));

        int choice;
        do {
            System.out.println("\n=== Menu Akademik ===");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Tampilkan Jadwal Perkuliahan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tampilkanDataMahasiswa();
                    break;
                case 2:
                    tampilkanDataDosen();
                    break;
                case 3:
                    tampilkanJadwal();
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (choice != 0);
    }

    private static void tampilkanDataMahasiswa() {
        System.out.println("\n=== Data Mahasiswa ===");
        for (Mahasiswa m : mahasiswaList) {
            m.displayData();
        }
    }

    private static void tampilkanDataDosen() {
        System.out.println("\n=== Data Dosen ===");
        for (Dosen d : dosenList) {
            d.displayData();
        }
    }

    private static void tampilkanJadwal() {
        System.out.println("\n=== Jadwal Perkuliahan ===");
        for (Jadwal j : jadwalList) {
            j.displayJadwal();
        }
    }
}
