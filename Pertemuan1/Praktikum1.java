package Pertemuan1;
import java.util.Scanner;
public class Praktikum1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=========================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        double uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        double uas = sc.nextInt();

        if (tugas <= 100 && kuis <= 100 && uts <= 100 && uas <= 100) {
            tugas = tugas * 0.2;
            kuis = kuis * 0.2;
            uts = uts * 0.3;
            uas = uas * 0.3;
        } else {
            System.out.println("=========================");
            System.out.println("=========================");
            System.out.println("Nilai tidak Valid");
            System.exit(0);
        }

        double nilaiAkhir = tugas + kuis + uts + uas;
        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        String status;
        if (nilaiAkhir <= 50) {
            status = "TIDAK LULUS";
        } else {
            status = "LULUS";
        }
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("Nilai Akhir  : "+nilaiAkhir);
        System.out.println("Nilasi Huruf : "+nilaiHuruf);
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("SELAMAT ANDA "+status);

        sc.close();
    }
}
