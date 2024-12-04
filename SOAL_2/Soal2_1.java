package SOAL_2;

import java.util.Scanner;

public class Soal2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        long faktorial = 1;
        for (int i = 1; i <= bilangan; i++) {
            faktorial *= i;
        }
        System.out.println("Faktorial dari " + bilangan + " adalah: " + faktorial);
    }
}