package SOAL_3;

import java.util.Scanner;

public class Soal3_1 {
    public static void main(String[] args) {

        int jumlahSISWA, Nilai;
        double totalNilai = 0, ratarata;

        Scanner input = new Scanner(System.in);
        System.out.print(" Jumlah siswa: ");
        jumlahSISWA = input.nextInt();
        System.out.println("====================================================");

        int Absen = 1;
        while (Absen <= jumlahSISWA) {
            System.out.print("Masukkan Nilai Siswa ke-" + Absen + ": ");
            Nilai = input.nextInt();
            Absen++;
            totalNilai += Nilai;

        }
        System.out.println("====================================================================================");
        System.out.println("Total nilai siswa adalah: " + totalNilai);
        System.out.println("_____________________________________________________________________________");
        ratarata = totalNilai / jumlahSISWA;
        System.out.println("Rata-rata nilai dari " + jumlahSISWA + " siswa adalah: " + ratarata);
    }
}