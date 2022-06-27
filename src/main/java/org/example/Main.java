package org.example;

import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService sqrService = new SQRService();
        System.out.println(sqrService.calculateSqr(100, 300));
    }
}