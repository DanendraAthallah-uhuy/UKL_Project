package SOAL_2;

import java.util.Scanner;

public class Soal2_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] soal = {
                { 5, 3, '*' },
                { 8, 4, '/' },
                { 6, 2, '*' },
                { 9, 3, '/' },
                { 10, 3, '%' }
        };

        for (int i = 0; i < soal.length; i++) {
            int bilangan1 = soal[i][0];
            int bilangan2 = soal[i][1];
            char operator = (char) soal[i][2];

            int hasil = 0;

            System.out.println(bilangan1 + " " + operator + " " + bilangan2 + " = ?");
            System.out.print("Jawaban: ");
            int jawaban = input.nextInt();

            if (jawaban == hasil) {
                System.out.println("Jawaban kamu benar.");
            } else {
                System.out.println("Jawaban kamu salah. Jawaban yang benar adalah: " + hasil);
            }

            System.out.println("Mau lanjut: (ya/tidak)");
            if (input.next().equalsIgnoreCase("tidak")) {

            }

            System.out.println("---------------------------------");
        }

        System.out.println("===================================");
        System.out.println("Terimakasih sudah mengikuti kuis.");
    }
    static int menghitung(int bilangan1, int bilangan2, char operator){
        switch (operator) {
            case '*':
                return bilangan1*bilangan2;
            case '/':
                return bilangan1/bilangan2;
            case '%':
                return bilangan1%bilangan2;    
            default:
                return 0;
        }
    }
}