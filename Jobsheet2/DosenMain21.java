package Jobsheet2;

public class DosenMain21 {
    public static void main(String[] args) {
        Dosen21 dosen1 = new Dosen21();
        dosen1.idDosen = "000";
        dosen1.nama = "Prof.Dr.Eng. Budi";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 1945;
        dosen1.bidangKeahlian = "UI/UX";

        dosen1.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2024) + " tahun");
        dosen1.setStatusAktif(false);
        dosen1.ubahBidangKeahlian("Struktur Data");
        dosen1.tampilInformasi();

        Dosen21 dosen2 = new Dosen21("001", "Prof.Dr.Rng.Agus", true, 1945, "Basis Data");
        dosen2.tampilInformasi();
    }
}
