package SOAL_1;

import java.util.Scanner;

public class Soal1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double  berat,jarak,panjang,lebar,tinggi,volume,biayaperKG,biayaKirim;
        

        System.out.println("Berat paket(kg): ");
        berat = input.nextDouble();
        System.out.println("Masukan jarak tempuh(km): ");
        jarak = input.nextInt();
        System.out.println("Masukan panjang paket(cm): ");
        panjang = input.nextDouble();
        System.out.println("Masukan lebar paket(cm): ");
        lebar = input.nextDouble();
        System.out.println("Masukan tinggi paket(cm): ");
        tinggi = input.nextDouble();

        volume = panjang * lebar * tinggi;
        if (jarak<10) {
            biayaperKG=4250;
        }else{
            biayaperKG=6000;
        }

        biayaKirim = biayaperKG * berat;

        if (volume > 100) {
            biayaKirim += 50000;
        }else if(volume >200){
            biayaKirim+=100000;
        }
        System.out.println("Total semua biaya: " + biayaKirim);
        System.out.println("Total volume: " + volume);
    }
}