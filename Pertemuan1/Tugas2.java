package Pertemuan1;
import java.util.Scanner;
public class Tugas2 {
    public static String[][] input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jumlah = sc.nextInt();
        String [] [] mataKuliah = new String[jumlah][4];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Nama Mata Kuliah     : ");
            mataKuliah[i][0] = sc.next();
            System.out.print("Masukkan Ruang Mata Kuliah    : ");
            mataKuliah[i][1] = sc.next();
            System.out.print("Masukkan Hari Mata Kuliah     : ");
            mataKuliah[i][2] = sc.next();
            System.out.print("Masukkan Jam Mata Kuliah      : ");
            mataKuliah[i][3] = sc.next();
            System.out.println("===============================");
            }
            return mataKuliah;
    }

    public static void tampilJadwal(String[][] mataKuliah) {
        System.out.println("Jadwal Mata Kuliah");
        for (String[] mataKuliah1 : mataKuliah) {
            System.out.println("Mata Kuliah : " + mataKuliah1[0]);
            System.out.println("Ruang       : " + mataKuliah1[1]);
            System.out.println("Hari        : " + mataKuliah1[2]);
            System.out.println("Jam         : " + mataKuliah1[3]);
            System.out.println();
        }
    }

    public static void tampilHari(String[][] mataKuliah){
        System.out.println("Masukkan Hari: ");
        Scanner sc = new Scanner(System.in);
        String hari = sc.next();
        System.out.println("Jadwal Mata Kuliah pada Hari " + hari);
        for (int i = 0; i < mataKuliah.length; i++) {
            if (mataKuliah[i][2].equalsIgnoreCase(hari)) {
                System.out.println("Mata Kuliah : " + mataKuliah[i][0]);
                System.out.println("Ruang       : " + mataKuliah[i][1]);
                System.out.println("Hari        : " + mataKuliah[i][2]);
                System.out.println("Jam         : " + mataKuliah[i][3]);
                System.out.println();
            }
        }
    }

    public static void tampilMatkul(String[][] mataKuliah) {
        System.out.println("Masukkan Nama Mata Kuliah: ");
        Scanner sc = new Scanner(System.in);
        String matkul = sc.next();
        System.out.println("Jadwal Mata Kuliah " + matkul);
        for (int i = 0; i < mataKuliah.length; i++) {
            if (mataKuliah[i][0].equalsIgnoreCase(matkul)) {
                System.out.println("Mata Kuliah : " + mataKuliah[i][0]);
                System.out.println("Ruang       : " + mataKuliah[i][1]);
                System.out.println("Hari        : " + mataKuliah[i][2]);
                System.out.println("Jam         : " + mataKuliah[i][3]);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        String [][] mataKuliah = new String[0][0];
        String [][] matkul = input();
        System.out.println("Menu: ");
        System.out.println("1. Tampilkan Jadwal Mata Kuliah");
        System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
        System.out.println("3. Tampilkan Jadwal Berdasarkan Mata Kuliah");
        System.out.print("Masukkan Pilihan: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================");
        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                tampilJadwal(matkul);
                break;
            case 2:
                tampilHari(matkul);
                break;
            case 3:
                tampilMatkul(matkul);
                break;
            default:
                System.out.println("Pilihan Tidak Valid");
        }

        sc.close();
    }
}
