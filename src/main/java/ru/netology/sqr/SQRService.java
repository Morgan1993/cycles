package ru.netology.sqr;

public class SQRService {
    public int calculateSqr(int startBorder, int endBorder) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr > endBorder){
                break;
            }
            if (sqr >= startBorder) {
                counter++;
            }
        }
        return counter;
    }

}
