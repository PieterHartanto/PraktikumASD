package CM;

public class Buku21 {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    int test;

    public Buku21(String kode, String jdl, int terbit){
        this.kodeBuku = kode;
        this.judul = jdl;
        this.tahunTerbit = terbit;
    }

    void tampilbuku(){
        System.out.println("Kode: " + kodeBuku + "  |" + "Judul: " + judul + "  |" + "Tahun: " + tahunTerbit);
    }
}
