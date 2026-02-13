package Pertemuan1;
import java.util.Scanner;
public class Praktikum3 {
    @SuppressWarnings({"ConvertToStringSwitch", "ConvertToTryWithResources"})
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] mataKuliah = {"Pancasila","Konsep Teknologi Informasi","CTPS", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        int [] nilaiAngka = new int[mataKuliah.length];

        System.out.println("================================================");
        System.out.println("Program Menghitung IP Semester");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextInt();
        }

        System.out.print("Masukkan Jumlah SKS: ");
        int sks = sc.nextInt();
        System.out.println("Masukkan Bobot SKS: ");
        int bobotSks = sc.nextInt();

        String [] nilaiHuruf = new String[mataKuliah.length];
        for (int i = 0; i < nilaiAngka.length; i++) {
            if (nilaiAngka[i] > 80) {
            nilaiHuruf[i] = "A";
        } else if (nilaiAngka[i] > 73) {
            nilaiHuruf[i] = "B+";
        } else if (nilaiAngka[i] > 65) {
            nilaiHuruf[i] = "B";
        } else if (nilaiAngka[i] > 60) {
            nilaiHuruf[i] = "C+";
        } else if (nilaiAngka[i] > 50) {
            nilaiHuruf[i] = "C";
        } else if (nilaiAngka[i] > 39) {
            nilaiHuruf[i] = "D";
        } else {
            nilaiHuruf[i] = "E";
        }
    }

        double [] nilaiSetara = new double[mataKuliah.length];
        for (int x = 0; x < mataKuliah.length; x++) {
            if (nilaiHuruf[x].equals("A")) {
                nilaiSetara[x] = 4.0;
            } else if (nilaiHuruf[x].equals("B+")) {
                nilaiSetara[x] = 3.5;
            } else if (nilaiHuruf[x].equals("B")) {
                nilaiSetara[x] = 3.0;
            } else if (nilaiHuruf[x].equals("C+")) {
                nilaiSetara[x] = 2.5;
            } else if (nilaiHuruf[x].equals("C")) {
                nilaiSetara[x] = 2.0;
            } else if (nilaiHuruf[x].equals("D")) {
                nilaiSetara[x] = 1.0;
            } else {
                nilaiSetara[x] = 0;
            }
        }

        double ip = ((nilaiSetara [0] + nilaiSetara[1] + nilaiSetara[2] + nilaiSetara[3] + nilaiSetara[4] + nilaiSetara[5] + nilaiSetara[6] + nilaiSetara[7])*bobotSks)/sks ;

        System.out.println("===============================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===============================================");
        System.out.println("Matakuliah\t\t\tNilai Angka\tNilai Huruf\tNilai Setara");
        
        System.out.println(mataKuliah[0] + "\t\t\t" + nilaiAngka[0] + "\t\t" + nilaiHuruf[0] + "\t\t" + nilaiSetara[0]);
        System.out.println(mataKuliah[1] + "\t" + nilaiAngka[1] + "\t\t" + nilaiHuruf[1] + "\t\t" + nilaiSetara[1]);
        System.out.println(mataKuliah[2] + "\t\t\t\t" + nilaiAngka[2] + "\t\t" + nilaiHuruf[2] + "\t\t" + nilaiSetara[2]);
        System.out.println(mataKuliah[3] + "\t\t" + nilaiAngka[3] + "\t\t" + nilaiHuruf[3] + "\t\t" + nilaiSetara[3]);
        System.out.println(mataKuliah[4] + "\t\t\t" + nilaiAngka[4] + "\t\t" + nilaiHuruf[4] + "\t\t" + nilaiSetara[4]);
        System.out.println(mataKuliah[5] + "\t\t" + nilaiAngka[5] + "\t\t" + nilaiHuruf[5] + "\t\t" + nilaiSetara[5]);
        System.out.println(mataKuliah[6] + "\t" + nilaiAngka[6] + "\t\t" + nilaiHuruf[6] + "\t\t" + nilaiSetara[6]);
        System.out.println(mataKuliah[7] + "\t" + nilaiAngka[7] + "\t\t" + nilaiHuruf[7] + "\t\t" + nilaiSetara[7]);
        System.out.println("===============================================");
        System.out.println("IP: " + ip);

        sc.close();
    }
}
