package Jobsheet3;
import java.util.Scanner;
public class Matakuliah21 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    //Konstruktor Berparameter 3
    public Matakuliah21(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // public Matakuliah21() {

    // }

    // public Matakuliah21(String kode, String nama) {
    //     this.kode = kode;
    //     this.nama = nama;
    // }

    public static Matakuliah21 tambahData(Scanner sc) {
        System.out.print("Kode        : ");
        String kode = sc.nextLine();
        System.out.print("Nama        : ");
        String nama = sc.nextLine();
        System.out.print("SKS         : ");
        int sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam  : ");
        int jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("---------------------------------------");

        return new Matakuliah21(kode, nama, sks, jumlahJam);
    }

    void cetakInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
    }
}

