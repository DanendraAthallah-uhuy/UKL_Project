package SOAL_3;

public class Soal3_3 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 2, 3, 3, 3, 4 };

        for (int i = 0; i < array.length; i++) {
            int angka = 1;
            if (array[i] != -1) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        angka++;
                        array[j] = -1;
                    }
                }
                System.out.println(array[i] + " muncul " + angka + " kali");
            }
        }
    }
}