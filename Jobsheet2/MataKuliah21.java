package Jobsheet2;

class MataKuliah21 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi(){
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        if (sksBaru < 0) {
            System.out.println("SKS tidak valid. Harus lebih dari atau sama dengan 0.");
            return;
        }
        sks = sksBaru;
    }

    void tambahJam(int jam){
        if (jam < 0) {
            System.out.println("Jumlah jam tambahan tidak valid. Harus lebih dari atau sama dengan 0.");
            return;
        }
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
        if (jam < 0) {
            System.out.println("Jumlah jam pengurangan tidak valid. Harus lebih dari atau sama dengan 0.");
            return;
        }
        if (jumlahJam - jam < 0) {
            System.out.println("Jumlah jam tidak bisa kurang dari 0.");
            return;
        }
        jumlahJam -= jam;
    }

    public MataKuliah21(){

    }
    public MataKuliah21(String kode, String nm, int sks, int jamMK){
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        jumlahJam = jamMK;
    }
}
