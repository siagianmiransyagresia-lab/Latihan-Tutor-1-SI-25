import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, hasil;

        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
        if (a % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (b % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (a == b) {
            System.out.println("Kedua bilangan sama besar");
        }
        if (a > b) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            System.out.println("Bilangan kedua lebih besar");
        }
        if (a % 2 == 0 && b % 2 == 0) {
            hasil = a + b;
            System.out.println("hasil penjumlahan: " + hasil);
        } else {
            if (a % 2 != 0 && b % 2 != 0) {
                hasil = a * b;
                System.out.println("Hasil perkalian: " + hasil);
            } else {
                System.out.println("berbeda jenis");
            }
        }
    }
}

