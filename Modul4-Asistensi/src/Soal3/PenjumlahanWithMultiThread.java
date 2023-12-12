package Soal3;

public class PenjumlahanWithMultiThread extends Thread {
    private int[] array;
    private int start;
    private int end;
    private long total;

    public PenjumlahanWithMultiThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.total = 0;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            total += array[i];
        }
    }

    public long getTotal() {
        return total;
    }
}
