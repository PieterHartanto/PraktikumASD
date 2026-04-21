package CM;
import java.util.Scanner;
public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa21[] mahasiswa = new Mahasiswa21[3];
        mahasiswa[0] = new Mahasiswa21("22001", "Andi", "Teknik Informatika");
        mahasiswa[1] = new Mahasiswa21("22002", "Budi", "Teknik Informatika");
        mahasiswa[2] = new Mahasiswa21("22003", "Citra", "Sistem Informasi Bisnis");

        Buku21[] buku = new Buku21[4];
        buku[0] = new Buku21("B001", "Algoritma", 2020);
        buku[1] = new Buku21("B002", "Basis Data", 2019);
        buku[2] = new Buku21("B003", "Pemrograman", 2021);
        buku[3] = new Buku21("B004", "fisika", 2024);

        Peminjaman21[] peminjaman = new Peminjaman21[5];
        peminjaman[0] = new Peminjaman21(7, mahasiswa[0].nama, mahasiswa[0].nim, buku[0].judul);
        peminjaman[1] = new Peminjaman21(3, mahasiswa[1].nama, mahasiswa[1].nim, buku[1].judul);
        peminjaman[2] = new Peminjaman21(10, mahasiswa[2].nama, mahasiswa[2].nim, buku[2].judul);
        peminjaman[3] = new Peminjaman21(6, mahasiswa[2].nama, mahasiswa[2].nim, buku[3].judul);
        peminjaman[4] = new Peminjaman21(4, mahasiswa[0].nama, mahasiswa[0].nim, buku[1].judul);

        boolean program = true;
        do { 
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            int menu = sc.nextInt();
            switch (menu) {
                case 0:
                    System.out.println("Anda Telah keluar");
                    program = false;
                    break;

                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    for (int i = 0; i < mahasiswa.length; i++) {
                    mahasiswa[i].tampilMahasiswa();
                    }
                    break;

                case 2:
                    System.out.println("Daftar Buku:");
                    for (int i = 0; i < buku.length ; i++) {
                    buku[i].tampilbuku();
                    }
                    break;

                case 3:
                    System.out.println("Data Peminjaman:");
                    for (int i = 0; i < peminjaman.length; i++) {
                        peminjaman[i].hitungDenda();}

                    for (int i = 0; i < peminjaman.length; i++) {
                        peminjaman[i].tampilPeminjaman();
                    }
                    break;

                case 4:
                    System.out.println("setelah diurutkan (Denda terbesar)");
                    for (int i = 0; i < peminjaman.length; i++) {
                        peminjaman[i].hitungDenda();}

                    int temp;
                    for (int i = 0; i < peminjaman.length - 1; i++){
                        for (int j = 1; j < peminjaman.length - i; j++){
                            if (peminjaman[j - 1].denda < peminjaman[j].denda){
                                temp = peminjaman[j].denda;
                                peminjaman[j].denda = peminjaman[j - 1].denda;
                                peminjaman[j - 1].denda = temp;
                             }
                        }
                    }
                    for (int i = 0; i < peminjaman.length; i++) {
                        peminjaman[i].tampilPeminjaman();
                    }
                    break;
            
                case 5:
                    System.out.print("Masukkan NIM yang ingin dicari: ");
                    String nimCari = sc.next();
                    boolean ditemukan = false;
                    for (int i = 0; i < mahasiswa.length; i++) {
                        if (mahasiswa[i].nim.equals(nimCari)) {
                            mahasiswa[i].tampilMahasiswa();
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                    }
                    break;

                default:
                    System.out.println("Pilih menu 0 - 5!");
                    break;
            }
        } while (program);

    }
}
