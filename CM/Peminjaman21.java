package CM;

public class Peminjaman21 {
    String mhs;
    String noMhs;
    String buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    public Peminjaman21(){

    }

    public Peminjaman21(int pinjam, String nm, String no, String bk){
        this.lamaPinjam = pinjam;
        this.mhs = nm;
        this.buku = bk;
        this. noMhs = no;
    }

    void  hitungDenda(){
        terlambat = lamaPinjam - batasPinjam;
        if (terlambat >0) {
            denda = terlambat * 2000;
        } else {
            denda = 0;
            terlambat = 0;
        }
    }

    void tampilPeminjaman(){
        System.out.println(mhs + "   |"+ buku + "   |" + "Lama" + lamaPinjam + "   |" + "Terlambat: " + terlambat + "   |" + "Denda: " + denda);
    }

    void sortingDenda(){
        
    }
}
