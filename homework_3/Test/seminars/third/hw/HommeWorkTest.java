package seminars.third.hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class HommeWorkTest {


    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).

    @ParameterizedTest
    @ValueSource(ints = { 4 })
    void isTheNumberEven(int n) {
        assertTrue(HommeWork.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = { 3 })
    void isTheNumberOdd(int n) {
        assertFalse(HommeWork.evenOddNumber(n));
    }

// HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100)
// и возвращает true, если попадает и false - если нет, покрыть тестами метод на 100%

    @ParameterizedTest
    @ValueSource(ints = {37, 81})
    public void theNumbersFallIntoTheInterval(int n) {
        assertTrue(HommeWork.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {8, 404})
    public void theNumbersDontFallIntoTheInterval(int n) {
        assertFalse(HommeWork.numberInInterval(n));
    }

}