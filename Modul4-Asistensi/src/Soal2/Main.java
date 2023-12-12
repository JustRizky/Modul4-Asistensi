package Soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nilai = 0;
        System.out.println("Masukkan Nilai: ");
        Scanner scanner = new Scanner(System.in);
        nilai = scanner.nextInt();

        SingleThread thread1 = new SingleThread();
        int hasil = thread1.jumlahBaris(nilai);
        System.out.println("Hasil Penjumlahan Baris: " + hasil);
    }
}
