package Pertemuan1;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        char [] [] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kode Kota: ");
        char inputKode = sc.next().charAt(0);
        switch (inputKode) {
            case 'A':
                System.out.println(kota[0]);
                break;
            case 'B':
                System.out.println(kota[1]);
                break;
            case 'D':
                System.out.println(kota[2]);
                break;
            case 'E':
                System.out.println(kota[3]);
                break;
            case 'F':
                System.out.println(kota[4]);
                break;
            case 'G':
                System.out.println(kota[5]);
                break;
            case 'H':
                System.out.println(kota[6]);
                break;
            case 'L':
                System.out.println(kota[7]);
                break;
            case 'N':
                System.out.println(kota[8]);
                break;
            case 'T':
                System.out.println(kota[9]);
                break;
            default:
                System.out.println("Kode Kota Tidak Ditemukan");
        }

        sc.close();
    }
}
