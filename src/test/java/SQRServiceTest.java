import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCalculate8For100_300() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int startBorder = 100;
        int endBorder = 300;
        int expected = 8;

        // вызываем целевой метод:
        int actual = service.calculateSqr(startBorder, endBorder);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculate0ForNegativeParameters() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int startBorder = -100;
        int endBorder = -300;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.calculateSqr(startBorder, endBorder);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculate0ForStartBorderBiggerThanEndBorder() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int startBorder = 300;
        int endBorder = 100;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.calculateSqr(startBorder, endBorder);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculate0ForBorders0() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int startBorder = 0;
        int endBorder = 0;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.calculateSqr(startBorder, endBorder);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
