package Soal2;

/**
 * SingleThread
 */
public interface PenjumlahanBarisWithSingleThread {
    int jumlahBaris(int nilai);
}

class SingleThread implements PenjumlahanBarisWithSingleThread {

    @Override
    public int jumlahBaris(int nilai) {
        int hitung = 0;
        for (int i = 0; i <= nilai; i++) {
            hitung += i;
        }
        return hitung;
    }

}