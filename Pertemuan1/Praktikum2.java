package Pertemuan1;

public class Praktikum2 {
    public static void main(String[] args) {
        int n = 01;
        n+=10;

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue; }
            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i +" ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
