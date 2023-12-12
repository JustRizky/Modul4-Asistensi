package Soal3;

public class Main {
    public static void main(String[] args) {
        // int[] array1 = { 0, 6, 20, 22, 1 };
        int[] array1 = { 0, 7, 6, 0, 6 };

        int mid = array1.length / 2;

        PenjumlahanWithMultiThread thread1 = new PenjumlahanWithMultiThread(array1, 0, mid);
        PenjumlahanWithMultiThread thread2 = new PenjumlahanWithMultiThread(array1, mid, array1.length);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long hitungTotal = thread1.getTotal() + thread2.getTotal();
        System.out.println("Total penjumlahan kedua array adalah: " + hitungTotal);
    }
}
