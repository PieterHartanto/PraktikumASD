package Jobsheet2;

public class MataKuliahMain21 {
    public static void main(String[] args) {
        MataKuliah21 mk1 = new MataKuliah21();
        mk1.kodeMK = "000";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 5;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.tampilkanInformasi();

        MataKuliah21 mk2 = new MataKuliah21("TI-202", "Struktur Data", 4, 64);
        mk2.kurangiJam(2);
        mk2.tampilkanInformasi(); 

        MataKuliah21 mkAlgoritma = new MataKuliah21("TI-303", "Algoritma dan Pemrograman", 3, 48);
    }
}
