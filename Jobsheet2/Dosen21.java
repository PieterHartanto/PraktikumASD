package Jobsheet2;

public class Dosen21 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status){
        this.statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg){
        return thnSkrg - tahunBergabung;
    }

    void ubahBidangKeahlian(String bidang){
        this.bidangKeahlian = bidang;
    }

    public Dosen21(){

    }

    public Dosen21(String id, String nm, boolean status, int bergabung, String keahlian) {
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = bergabung;
        bidangKeahlian = keahlian;
    }
}
