package CM;

public class Mahasiswa21 {
    String nim;
    String nama;
    String prodi;
    int test;

    public Mahasiswa21(String nimMhs, String nm, String prod){
        this.nim = nimMhs;
        this.nama = nm;
        this.prodi = prod;
    }

    void tampilMahasiswa(){
        
        System.out.println("NIM: " + nim + "  |" + "Nama: " + nama + "  |" + "Prodi: " + prodi);
    }
}
