package Lesson_7_testng;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialPart2Test {

    FactorialPart2 number = new FactorialPart2();

    @Test
    public void testFactorialForZero() {
        assertEquals(number.factorial(0), 1);
    }

    @Test
    public void testFactorialForPositiveNumber() {
        assertEquals(number.factorial(1), 1);
        assertEquals(number.factorial(5), 120);
    }

    @Test
    public void testFactorialNegativeNumber() {
        try {
            number.factorial(-1);
            fail("Ожидаемое исключение IllegalArgumentException для отрицательного числа");
        } catch (IllegalArgumentException e) {

        }
    }
}