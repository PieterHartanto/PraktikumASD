package Pertemuan1;
public class Praktikum4 {

    public static void pendapatan(){
        int []cabang1 = {10, 5, 15, 7};
        int []cabang2 = {6, 11, 9, 12};
        int []cabang3 = {2, 10, 10, 5};
        int []cabang4 = {5, 7, 12, 9};
        int []harga = {75000, 50000, 60000, 10000};

        int pendapatan1 = 0;
        int pendapatan2 = 0;
        int pendapatan3 = 0;
        int pendapatan4 = 0;
        for(int i = 0; i < cabang1.length; i++){
            pendapatan1 = cabang1[i] * harga[i];
            pendapatan2 = cabang2[i] * harga[i];
            pendapatan3 = cabang3[i] * harga[i];
            pendapatan4 = cabang4[i] * harga[i];
        }

        if (pendapatan1 > 1500000){
            System.out.println("Sangat Baik");
        } else {
            System.out.println("Perlu Evaluasi");
        }

        if (pendapatan2 > 1500000){
            System.out.println("Sangat Baik");
        } else {
            System.out.println("Perlu Evaluasi");
        }

        if (pendapatan3 > 1500000){
            System.out.println("Sangat Baik");
        } else {
            System.out.println("Perlu Evaluasi");
        }

        if (pendapatan4 > 1500000){
            System.out.println("Sangat Baik");
        } else {
            System.out.println("Perlu Evaluasi");
        }
    }   
    public static void main(String[] args) {
        pendapatan();
    }
}
