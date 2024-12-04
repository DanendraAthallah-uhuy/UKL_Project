package SOAL_1;

public class Soal1_3 {
    public static void main(String[] args) {
        for (int i = 50; i >= 2; i--) {
            if (i % 3 == 0) {
                System.out.println(i + " saya anak moklet");
            } else if (i % 3 == 1) {
                System.out.println(i + " saya anak wikusama");
            } else {
                System.out.println(i + " saya anak 33");
            }
        }
        System.out.println("1. saya senang");
    }
}